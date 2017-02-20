/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.domain;

import datastructures.adts.LinkedList;
import datastructures.adts.ListNode;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jbull
 */
public class LinkedListTest {
    
    LinkedList linkedList; 
    ListNode firstNode;
    ListNode secondNode;
    ListNode thirdNode;
    ListNode fourthNode;
    
    public LinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        linkedList = new LinkedList();
        firstNode = new ListNode(1);
        secondNode = new ListNode(5);
        thirdNode = new ListNode(10);
        fourthNode = new ListNode(20);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    
    @Test
    public void TestAddAtBeginningWhenListEmpty(){
        linkedList.addAtBeginning(firstNode);
        ListNode result = linkedList.getHead();
        assertNotNull(result);
    }
    
    @Test
    public void TestAddAtBeginningWhenListNotEmpty(){
        linkedList.addAtBeginning(firstNode);
        linkedList.addAtBeginning(secondNode);
        ListNode result = linkedList.getHead();
        ListNode expResult = secondNode;
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestAddAtEndWhenListEmpty(){
        linkedList.addAtEnd(firstNode);
        ListNode result = linkedList.getHead();
        assertNotNull(result);
    }
    
    @Test
    public void TestAddAtEndWhenListNotEmpty(){
        linkedList.addAtBeginning(firstNode);
        linkedList.addAtEnd(secondNode);
        ListNode result = linkedList.getLastNode();
        ListNode expResult = secondNode;
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestGetLength(){
        linkedList.addAtBeginning(secondNode);
        linkedList.addAtBeginning(firstNode);
        linkedList.addAtEnd(thirdNode);
        int result = linkedList.getLength();
        int expResult = 3;
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestAddAtPosition(){
        linkedList.addAtBeginning(secondNode);
        linkedList.addAtBeginning(firstNode);
        linkedList.addAtEnd(thirdNode);
        linkedList.addAtPosition(fourthNode, 2);
        ListNode expResult = thirdNode;
        ListNode result = linkedList.getLastNode();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void TestDeleteFromBeginning(){
        linkedList.addAtBeginning(secondNode);
        linkedList.addAtBeginning(firstNode);
        linkedList.deleteAtBeggining();
        ListNode expResult = secondNode;
        ListNode result = linkedList.getHead();
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestDeleteFromEnd(){
        linkedList.addAtBeginning(secondNode);
        linkedList.addAtBeginning(firstNode);
        linkedList.deleteAtEnd();
        ListNode expResult = firstNode;
        ListNode result = linkedList.getLastNode();
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestDeleteFromPosition(){
        linkedList.addAtBeginning(secondNode);
        linkedList.addAtBeginning(firstNode);
        linkedList.addAtEnd(thirdNode);
        linkedList.addAtEnd(fourthNode);
        linkedList.deleteAtPosition(2);
        ListNode expResult = fourthNode;
        ListNode result = linkedList.getLastNode();
        assertEquals(expResult, result);
    }
    
}
