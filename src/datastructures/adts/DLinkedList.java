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
public class DLinkedList {
    private int length;
    private DListNode head;
    
    public DLinkedList(){
       this.length = 0; 
    }
    
    public int getLength(){
        return this.length;
    }
    
    public DListNode getHead(){
        return this.head;
    }
    
    public void addAtBeginning(DListNode node){
        if(head == null){
            head = node;
        }
        else{
            node.setNext(head);
            head.setPrev(node);
            this.head = node;
        }
        this.length ++;
    }
}
