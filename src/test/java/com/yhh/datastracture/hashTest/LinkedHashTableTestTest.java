package com.yhh.datastracture.hashTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedHashTableTestTest {
    LinkedHashTableTest<String,String> hashTableTest=new LinkedHashTableTest<String, String>(0.75f,7);
    @Test
    public void size() {

        Assert.assertEquals(hashTableTest.size(),0);
    }

    @Test
    public void hash() {
        int hash_zs=hashTableTest.hash("张三",7);
        int hash_ls=hashTableTest.hash("李四",7);
        int hash_null=hashTableTest.hash(null,7);
        Assert.assertEquals(hash_zs,hashTableTest.hash("张三",7));
        Assert.assertEquals(hash_null,0);
        Assert.assertNotEquals(hash_zs,hash_ls);
        Assert.assertTrue(hash_zs>=0);
        Assert.assertTrue(hash_zs<7);
    }
    class TestCase{
        String name;
        String score;
        public TestCase(String name,String score){
            this.name=name;
            this.score=score;
        }
    }
    private List<TestCase> testCases= Arrays.asList(
            new TestCase("张三","80"),
            new TestCase("李四","70"),
            new TestCase("王五","60"),
            new TestCase("赵六","40"),
            new TestCase("1231","23"),
            new TestCase("wqe","345"),
            new TestCase("sad","73"),
            new TestCase("1231","45"),
            new TestCase("asd","73"),
            new TestCase("李fgd","83"),
            new TestCase("gre","88")
            );

    @Test
    public void put() {
        for (TestCase testCase : testCases) {
            this.hashTableTest.put(testCase.name, testCase.score);
        }
        Assert.assertEquals(hashTableTest.size(),10);
        hashTableTest.print();
    }

    private String getValue(String name){
        for (int i = testCases.size()-1; i >=0; i--) {
            if (testCases.get(i).name.equals(name)){
                return testCases.get(i).score;
            }
        }
        return null;
    }

    @Test
    public void get() {
        for (TestCase testCase : testCases) {
            this.hashTableTest.put(testCase.name, testCase.score);
        }
        for (int i = 0; i < testCases.size(); i++) {
            String value=hashTableTest.get(testCases.get(i).name);
            String getValue=getValue(testCases.get(i).name);
            Assert.assertEquals(value,getValue);
        }
    }

    @Test
    public void remove() {
        for (TestCase testCase : testCases) {
            this.hashTableTest.put(testCase.name, testCase.score);
        }
        hashTableTest.print();
        System.out.println();
        hashTableTest.remove("张三");
        hashTableTest.remove("李四");
        hashTableTest.remove("王五");
        hashTableTest.remove("赵六");
        hashTableTest.remove("sad");
        hashTableTest.print();
        Assert.assertEquals(hashTableTest.size(),5);
    }
}