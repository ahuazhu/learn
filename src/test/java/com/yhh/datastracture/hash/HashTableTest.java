package com.yhh.datastracture.hash;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void print() {
        HashTable hashTable=new HashTable();
        hashTable.put("张三",80);
        hashTable.put("李四",60);
        hashTable.put("王五",90);
        hashTable.put("赵六",70);
        hashTable.put("李乾",68);
        hashTable.put("小红",72);
        hashTable.put("孙亮",87);
        hashTable.put("小黑",63);
        hashTable.put("小李",59);
        hashTable.put("小绿",75);
        hashTable.put("小青",87);
        hashTable.put("小明",93);
        hashTable.put("1",66);
        hashTable.put("2",67);
        hashTable.put("3",72);
        hashTable.put("4",93);
        hashTable.put("5",95);
        hashTable.put("6",100);
        hashTable.put("7",92);
        hashTable.put("8",82);
        hashTable.remove("王五",90);
        hashTable.print();
        System.out.println(hashTable.findValue("2"));
        System.out.println(hashTable.findValue("小绿"));
        System.out.println(hashTable.findValue("孙亮"));
        System.out.println(hashTable.findValue("7"));
        System.out.println(hashTable.findValue("3"));
        System.out.println(hashTable.findValue("小红"));
        System.out.println(hashTable.findValue("小黑"));
        Assert.assertEquals(hashTable.findValue("赵六"),70);
    }
}