package com.practice.linkedList;

import com.practice.AddiingTwoVeryLargeNumbers;

public class AddTwoNumbers {

  class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode curr1= l1;
            ListNode curr2=l2;

            String sum1="";
            String sum2="";
            int i=0;
            while(curr1!=null||curr2!=null){
                if(curr1!=null){
                    sum1=sum1+String.valueOf(curr1.val);
                    curr1=curr1.next;
                }

                if(curr2!=null){
                    sum2=sum2+String.valueOf(curr2.val);
                    curr2=curr2.next;
                }
                i++;
            }

            String sum = summation(new String(new StringBuilder(sum1).reverse()), new String(new StringBuilder(sum2).reverse()));


            ListNode head= null;
           ListNode curr= null;
           if(sum.equals("0")){
                ListNode node= new ListNode(0);
                return node;
            }
            for(int j=0;j<sum.length();j++){
               int newVal= Character.getNumericValue(sum.charAt(j));
                ListNode node= new ListNode(newVal);

                if(head ==null){
                    head= node;
                    curr=head;
                }
                else{
                    curr.next=node;
                    curr=curr.next;
                }

            }
            return head;
        }

    public static String summation(String str1, String str2) {

        String sumString = "";
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        String s1 = new String(new StringBuilder(str1).reverse());
        String s2 = new String(new StringBuilder(str2).reverse());

        int carry = 0;
        for (int i = 0; i < s1.length(); i++) {

            int s = Character.getNumericValue(s1.charAt(i)) + Character.getNumericValue(s2.charAt(i)) + carry;

            sumString = sumString + String.valueOf(s % 10);
            carry = s / 10;
        }

        for (int i = s1.length(); i < s2.length(); i++) {

            int s = Character.getNumericValue(s2.charAt(i)) + carry;

            sumString = sumString + String.valueOf(s % 10);
            carry = s / 10;
        }
        if (carry > 0){
            sumString = sumString + String.valueOf(carry);
        }
        return sumString;
    }



        public long reverseNumber(long num){
            long reverse=0L;
            while(num!=0){
                int digit= (int) (num%10);
                reverse = (reverse*10) +digit;
                num=num/10;
            }
            return reverse;
        }

        public  static  void printList(ListNode head){
            ListNode currentNode=head;
            while(currentNode!=null){
                System.out.print(currentNode.val+" ");
                currentNode=currentNode.next;
            }
        }

    public static void main(String[] args) {

    }
}
