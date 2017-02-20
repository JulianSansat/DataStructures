/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.domain;


import datastructures.adts.ListNode;
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
public class ListNodeTest {
    ListNode firstNode = new ListNode(1);
    ListNode secondNode = new ListNode(5);
    
    public ListNodeTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        firstNode.setNext(secondNode);
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
    public void TestListNodeSetNext(){
        ListNode expResult = secondNode;
        ListNode result = firstNode.getNext();
        assertEquals(expResult, result);
    }
    
}
