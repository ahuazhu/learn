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
        hashTable.print();
        hashTable.put("小明",93);
        hashTable.print();
        hashTable.remove("王五",90);
        hashTable.print();
        Assert.assertEquals(hashTable.findValue("赵六"),70);
    }
}