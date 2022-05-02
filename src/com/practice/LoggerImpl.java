package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// problem - design an implementation for LogClient
interface LogClient{
    /**
     * When a process starts it calls start Method with processId
     **/
    void start(String processId);
    /**
     * When a process ends it calls end Method with processId
     * **/
    void end(String processId);

    /**
     *Polls the first log entry of a completed process sorted by start time of the process in below format
     * {processId} started at {startTime}  and ended at {endTime}
     *
     * process id = 1 --> 12, 15
     * process id = 2 --> 8, 12
     * process id = 3 --> 7, 12
     *
     * {3} started at {7} and ended at {12}
     * {2} started at {8} and ended at {12}
     * **/
        void poll();
}


//Solution

class Process{
    private String processId;
    private Long startTime;
    private Long endTime;

    Process(String processId, Long startTime){
        this.processId=processId;
        this.startTime=startTime;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
public class LoggerImpl  implements  LogClient{
    Map<String, Process> processMap = new HashMap<>();
    PriorityQueue<Process> processQueue = new PriorityQueue<>((a,b)-> (int) (a.getStartTime()-b.getStartTime()));
    @Override
    public void start(String processId) {
        Process process = new Process(processId, System.currentTimeMillis());
        processQueue.add(process);
        processMap.put(processId,process);

    }


    @Override
    public void end(String processId) {
        processMap.get(processId).setEndTime(System.currentTimeMillis());


    }

    @Override
    public void poll() {
        if(processQueue.isEmpty()){
            System.out.println("No loggers to output");
            return;
        }
        Process process= processQueue.peek();
        if(process.getEndTime()!=0l){
            System.out.println("{"+process.getProcessId()+"} started at {"+ process.getStartTime()+"}  and ended at" +
                    " {"+ process.getEndTime()+"}");
            processQueue.poll();
            processMap.remove(process.getProcessId());
        }
        else{
            System.out.println("No Process has completed");
        }

    }
}
