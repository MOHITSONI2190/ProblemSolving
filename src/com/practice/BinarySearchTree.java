package com.practice;

import java.util.*;

public class BinarySearchTree {

    class Node {
        int data;
        Node left, right, next;

        public Node(int item)
        {
            data = item;
            left = null;
            right = null;
            next=null;
        }
    }
    Node root;
    BinarySearchTree()
    {
        root = null;
    }

    public void insert(int data){
        root=insertRec(data, root);
    }

    public Node insertRec(int data, Node root){

        if(root==null){
            root= new Node(data);
            return root;
        }

        if(data< root.data){
            root.left=insertRec(data,root.left);
        }
        else   if(data>root.data){
            root.right=insertRec(data,root.right);
        }

        return root;

    }

    public void inOrder(){
        inOrderTraversal(root);
    }

    public void inOrderTraversal(Node root){
        if(root!=null) {
            inOrderTraversal(root.left);
            System.out.print(root.data);
            inOrderTraversal(root.right);
        }

    }

    public void levelOrder(){
        levelOrderTraversal(root);
    }

    public void levelOrderTraversal(Node root){

        Queue<Node> queue = new LinkedList<>();

          List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>() ;

          queue.add(root);
          while(!queue.isEmpty()){
              Node node = queue.poll();
              System.out.print(node.data);
              if(node.left!=null) {
                  queue.add(node.left);
              }

              if(node.right!=null) {
                  queue.add(node.right);
              }
          }
    }

public void zigZag(){
    zigZagLevelOrder(root);
}
    public void zigZagLevelOrder(Node root){
        Stack<Node> currLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        //Node node = root;
        List<List<Integer>> list = new ArrayList<>();
                currLevel.push(root);
        boolean leftToRight=true;

        while(!currLevel.isEmpty()){

             Node n= currLevel.pop();
             System.out.print(n.data);
             if(leftToRight){
                 if(n.left!=null){
                     nextLevel.push(n.left);
                 }
                 if(n.right!=null){
                     nextLevel.push(n.right);
                 }
             }
             else{
                 if(n.right!=null){
                     nextLevel.push(n.right);
                 }
                 if(n.left!=null){
                     nextLevel.push(n.left);
                 }
             }

             if(currLevel.isEmpty()){
                 leftToRight=!leftToRight;
                 Stack<Node> temp= new Stack<>();
                 temp=nextLevel;
                 nextLevel=currLevel;
                 currLevel=temp;
             }
        }
    }
    public void height(){
       System.out.println(treeHeight(root));
    }
    public int treeHeight(Node root){
       if(root==null) return 0;

       int lHeight = treeHeight(root.left);
       int rHeight = treeHeight(root.right);

       if(lHeight>rHeight){ return lHeight+1;}
       else return rHeight+1;


    }
public void plevelOrder(){
    printLevelOrder(root);
}

    public void printLevelOrder(Node root){
        int height = treeHeight(root);

        List<List<Integer>> list= new ArrayList<>();
        for(int i=1;i<=height;i++){
           List<Integer> list1= printElementAtCurrentLevel(root,i);
           list.add(list1);
        }

        System.out.println(list);
    }

    public List<Integer> printElementAtCurrentLevel(Node root, int level){
        List<Integer> list= new ArrayList<>();
       if(root==null)  return list;
       if(level==1) { list.add(root.data);
      // System.out.print(root.data);
           }
       if(level>1){
           printElementAtCurrentLevel(root.left, level-1);
           printElementAtCurrentLevel(root.right,level-1);
       }
       return list;

    }
    private static int isPresent(Node root, int val){
    /* For your reference
class Node {
		Node left, right;
		int data;
                Node(int newData) {
			left = right = null;
			data = newData;
		}
	}
*/

        if(root.data ==val){
            return 1;
        }
        if(root==null){
            return 0;
        }
        if(root.data>val){
            return isPresent(root.left, val);
        }
        return isPresent(root.right, val);
    }

    public Node connect(Node root) {
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        Node temp=null;
        Node  rightNeighbor=null;
        while(!queue.isEmpty()){
            int n =queue.size();
            for(int i=0;i<n;i++){

                temp= queue.poll();

                if(i>0){
                    temp.next=rightNeighbor;
                }
                rightNeighbor = temp;
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                if(temp.left!=null){
                    queue.add(temp.left);
                }
            }
        }

          return root;
    }

    public List<Integer> rightSideView(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int n =queue.size();
            boolean firstRight=true;
            for(int i =0; i<n;i++) {
                Node temp = queue.poll();
                if (firstRight){
                    list.add(temp.data);
                    firstRight=false;
                 }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                if(temp.left!=null){
                    queue.add(temp.left);
                }

            }

         }
     return list;
    }


    public List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> nodeList = new ArrayList<>();
        List<Integer> currList =  new ArrayList<>();

        if(root==null){
            return nodeList;
        }
        pathSumDfs( root.left,  targetSum, nodeList,  root.data,currList );

        return nodeList;
    }

    public void pathSumDfs(Node root, int targetSum, List<List<Integer>> nodeList, int currSum, List<Integer> currList){
        if(root==null){
            return ;
        }
        currList.add(root.data);

        if(currSum==targetSum && root.left==null && root.right==null){
            nodeList.add(currList);
            return;
        }

       pathSumDfs( root.left,  targetSum, nodeList,  currSum+root.data,new ArrayList<>(currList) );
       pathSumDfs( root.right,  targetSum, nodeList,  currSum+root.data,  new ArrayList<>(currList));

    }

    public static void main(String[] args) {

        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(5);
        bst.insert(4);
        bst.insert(2);
        bst.insert(3);
        bst.insert(1);
        bst.insert(6);
        bst.insert(9);
        bst.insert(8);
        bst.insert(10   );
        bst.insert(7);

       // bst.inOrder();
       // bst.levelOrder();
   //bst.height();
      //  bst.plevelOrder();
        bst.zigZag();
    }
}
