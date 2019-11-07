package com.yhh.datastracture.hash;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedHashTableTest {

    private IHashTable<String, String> hashTable = new LinkedHashTable(0.75f, 5);

    @Test
    public void hash() {

        int lenght = 7;

        int hash123_7 = hashTable.hash("123", lenght);
        int hash1234_7 = hashTable.hash("1234", lenght);
        int hashNull_7 = hashTable.hash(null, lenght);

        Assert.assertEquals(hash123_7, hashTable.hash("123", lenght));
        Assert.assertEquals(0, hashNull_7);
        Assert.assertNotEquals(hash123_7, hash1234_7);


        int hash123_15 = hashTable.hash("123", 15);
        int hashNull_15 = hashTable.hash(null, 15);

        Assert.assertNotEquals(hash123_7, hash123_15);
        Assert.assertEquals(0, hashNull_15);

        Assert.assertTrue(hash123_15 < 16);
        Assert.assertTrue(hash123_15 >= 0);

        Assert.assertTrue(hash123_7 < 8);
        Assert.assertTrue(hash123_7 >= 0);
    }


    class TestCase {
        String name;
        String score;

        public TestCase(String name, String score) {
            this.name = name;
            this.score = score;
        }

    }


    private java.util.List<TestCase> testCases = Arrays.asList(
            new TestCase("Alice", "89"),
            new TestCase("Bob", "89"),
            new TestCase("Bob", "91"),
            new TestCase("C", "34"),
            new TestCase("Dd", "32"),
            new TestCase("A", "89"),
            new TestCase("B", "89"),
            new TestCase("C", "89"),
            new TestCase("ddd", "12"),
            new TestCase("ee", "3"),
            new TestCase("fff", "89"),
            new TestCase("ghhh", "89"),
            new TestCase("ffdf", "443"),
            new TestCase("cfdfwed", "222"),
            new TestCase("fsew", "233"),
            new TestCase("ffrrf", "89"),
            new TestCase("234", "89"),
            new TestCase("Alice1", "89"),
            new TestCase("Bob2", "89"),
            new TestCase("Bob3", "91"),
            new TestCase("4C", "34"),
            new TestCase("44Dd", "32"),
            new TestCase("A6", "89"),
            new TestCase("B6", "89"),
            new TestCase("1C", "89"),
            new TestCase("d3dd", "132"),
            new TestCase("2ee", "33"),
            new TestCase("3", "839"),
            new TestCase("ghhh", "389"),
            new TestCase("333", "3443"),
            new TestCase("33333", "3222"),
            new TestCase("333", "2333"),
            new TestCase("ffrrf", "839"),
            new TestCase("2222", "33333")
    );


    private String getExpectedValue(String key) {
        for (int i = testCases.size() - 1; i >=0 ; i -- ) {
            if (testCases.get(i).name.equals(key)) {
                return testCases.get(i).score;
            }

        }
        return null;
    }

    @Test
    public void putGet() {

        for (TestCase testCase : testCases) {
            this.hashTable.put(testCase.name, testCase.score);
        }

        Assert.assertEquals(hashTable.size(), 29 );

        for (TestCase testCase : testCases) {
            String value = hashTable.get(testCase.name);
            String expected = getExpectedValue(testCase.name);
            Assert.assertEquals(expected, value);
        }

    }

    @Test
    public void remove() {
    }
}