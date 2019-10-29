package com.yhh.datastracture;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testSize() {
        List l = new LinkedList();
        Assert.assertEquals(0, l.size());
        l.insert(0, 1);
        Assert.assertEquals(1, l.size());

        l.append(3);
        l.append(4);
        Assert.assertEquals(3, l.size());
    }

    @Test
    public void testRemove() {
        List l = new LinkedList();
        l.insert(0, 1);
        l.append(3);
        l.append(4);
        Assert.assertEquals(3, l.size());
        l.remove(0);
        Assert.assertEquals(2, l.size());
    }

    @Test
    public void testEquals() {
        List l1 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);

        List l2 = new LinkedList();
        l2.append(1);
        l2.append(2);

        Assert.assertNotEquals(l1, l2);
        l2.append(3);


        Assert.assertTrue(l1.equals(l2));


    }

}