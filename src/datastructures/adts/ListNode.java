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
public class ListNode {
    private int data;
    private ListNode next;
    
    public ListNode(int data){
        this.data = data;
    }
    
    public int getData(){
        return this.data;
    }
    
    public void setNext(ListNode next){
        this.next = next;
    }
    
    public ListNode getNext(){
        return this.next;
    }
}
