/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.adts;

/**
 *
 * @author jbull
 */
public class LinkedList {
    private int length;
    private ListNode head;
    
    public LinkedList(){
        this.length = 0;
    }
    
    public ListNode getHead(){
        return this.head;
    }
    
    public ListNode getLastNode(){
        ListNode currentNode = this.head;
        while(currentNode.getNext() !=  null){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public void addAtBeginning(ListNode node){
        node.setNext(head);
        head = node;
        length ++;
    }
    
    public void addAtEnd(ListNode node){
        if(this.head == null){
            this.head = node;
        } else {
            ListNode lastNode = getLastNode();
            lastNode.setNext(node);
        }
        length ++;
    }
    
    public void addAtPosition(ListNode node, int i){
        ListNode currentNode = this.head;
        for (int j = 0; j < i-1; j++) {
            currentNode = currentNode.getNext();
        }
        node.setNext(currentNode.getNext());
        currentNode.setNext(node);
        length ++;
    }
    
    public void deleteAtBeggining(){
        ListNode node = this.head;
        if (node != null){
            head = head.getNext();
            node.setNext(null);
            length --;
        }
    }
    
    public void deleteAtEnd(){
       ListNode currentNode = this.head;
        while (currentNode.getNext().getNext() != null) {            
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(null);
        length --;
    }
    
    public void deleteAtPosition(int i){
        if(i < 0){
            i = 0;
        }
        
        if(i >= this.length){
            i = this.length-1;
        }
        
        if(i == 0){
            this.head = head.getNext();
        }
        
        else{
            ListNode currentNode = this.head;
            for (int j = 1; j < i; j++) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());
        }
        
        
        
        
    }
    
}
