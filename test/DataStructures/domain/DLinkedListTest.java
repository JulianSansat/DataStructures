/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.domain;

import datastructures.adts.DLinkedList;
import datastructures.adts.DListNode;
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
public class DLinkedListTest {
    
    DLinkedList dLinkedList; 
    DListNode firstNode;
    DListNode secondNode;
    DListNode thirdNode;
    DListNode fourthNode;
    
    public DLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dLinkedList = new DLinkedList();
        firstNode = new DListNode(1);
        secondNode = new DListNode(5);
        thirdNode = new DListNode(10);
        fourthNode = new DListNode(20);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestAddAtBeginning(){
        dLinkedList.addAtBeginning(firstNode);
        DListNode expResult = firstNode;
        DListNode result = dLinkedList.getHead();
        assertEquals(expResult, result);
    }
}
