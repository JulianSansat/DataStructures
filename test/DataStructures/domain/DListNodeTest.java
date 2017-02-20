/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.domain;

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
public class DListNodeTest {
    DListNode firstNode = new DListNode(1);
    DListNode secondNode = new DListNode(5);
    
    public DListNodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestDListNodeSetNext(){
        firstNode.setNext(secondNode);
        DListNode expResult = secondNode;
        DListNode result = firstNode.getNext();
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestDListNodeSetPrev(){
        secondNode.setPrev(firstNode);
        DListNode expResult = firstNode;
        DListNode result = secondNode.getPrev();
        assertEquals(expResult, result);
    }
}
