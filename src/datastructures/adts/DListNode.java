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
public class DListNode {
    private int data;
    private DListNode next;
    private DListNode prev;
    
    public DListNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
    public DListNode(int data, DListNode next, DListNode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    
    public int getData(){
        return this.data;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public void setNext(DListNode node){
        this.next = node;
    }
    
    public DListNode getNext(){
        return this.next;
    }
    
    public void setPrev(DListNode node){
        this.prev = node;
    }
    
    public DListNode getPrev(){
        return this.prev;
    }
}
