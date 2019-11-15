package com.yhh.datastracture.aggregate;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class HashSetTest {
    HashSet<String> hashSet=new HashSet<String>(0.8f,13);
    @Test
    public void hash() {
        int hash_zs=hashSet.hash("张三",13);
        int hash_ls=hashSet.hash("李四",13);
        int hash_null=hashSet.hash(null,13);
        Assert.assertEquals(hash_zs,hashSet.hash("张三",13));
        Assert.assertEquals(hash_null,0);
        Assert.assertNotEquals(hash_zs,hash_ls);
        Assert.assertTrue(hash_zs>=0);
        Assert.assertTrue(hash_zs<13);
    }
    class TestCase{
        String name;
        public TestCase(String name){
            this.name=name;
        }
    }
    private List<TestCase> testCases= Arrays.asList(
            new TestCase("张三"),
            new TestCase("李四"),
            new TestCase("王五"),
            new TestCase("赵六"),
            new TestCase("1231"),
            new TestCase("wqe"),
            new TestCase("sad"),
            new TestCase("1231"),
            new TestCase("asd"),
            new TestCase("李fgd"),
            new TestCase("gre")
    );

    @Test
    public void add() {
        for (TestCase testCase : testCases) {
            this.hashSet.add(testCase.name);
        }
        Assert.assertEquals(hashSet.getSize(),10);
    }

    @Test
    public void remove() {
        for (TestCase testCase : testCases) {
            this.hashSet.add(testCase.name);
        }
        hashSet.remove("张三");
        hashSet.remove("gre");
        hashSet.remove("asd");
        Assert.assertEquals(hashSet.getSize(),7);
    }

    @Test
    public void contain() {
        for (TestCase testCase : testCases) {
            this.hashSet.add(testCase.name);
        }
        Assert.assertEquals(hashSet.contain("张三"),true);
        Assert.assertEquals(hashSet.contain("gre"),true);
        Assert.assertEquals(hashSet.contain("张1"),false);
    }

    @Test
    public void getSize() {
        Assert.assertEquals(hashSet.getSize(),0);
        for (TestCase testCase : testCases) {
            this.hashSet.add(testCase.name);
        }
        Assert.assertEquals(hashSet.getSize(),10);
    }

    @Test
    public void isEmpty() {
        Assert.assertEquals(hashSet.isEmpty(),true);
        for (TestCase testCase : testCases) {
            this.hashSet.add(testCase.name);
        }
        Assert.assertEquals(hashSet.isEmpty(),false);
    }
}