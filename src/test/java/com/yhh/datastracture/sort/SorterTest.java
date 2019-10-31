package com.yhh.datastracture.sort;

import com.yhh.datastracture.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SorterTest {


    class TestCase<T> {
        private T[] input;
        private T[] expectedOutput;

        public TestCase(T[] input, T[] expected) {
            this.input = input;
            this.expectedOutput = expected;
        }

        public T[] getInput() {
            return this.input;
        }

        public T[] getExpectedOutput() {
            return this.expectedOutput;
        }
    }

    private List<TestCase> cases;

    @Before
    public void setUp() {
        cases = new com.yhh.datastracture.ArrayList<TestCase>();

        cases.append(new TestCase(new Integer[]{12, 3, 4, 78, 1, 23, 1}, new Integer[]{1, 1, 3, 4, 12, 23, 78}));
        cases.append(new TestCase(new Integer[]{12, 3, 4, 78, 2, 23, 1}, new Integer[]{1, 2, 3, 4, 12, 23, 78}));
        cases.append(new TestCase(new Integer[]{ 1}, new Integer[]{1}));
        cases.append(new TestCase(new Integer[]{}, new Integer[]{}));
        cases.append(new TestCase(new Integer[]{1 ,1,1,1,1}, new Integer[]{1 ,1,1,1,1}));
        cases.append(new TestCase(new Integer[]{1 ,1,1,1,1}, new Integer[]{1 ,1,1, 1,1}));

    }


    private void test(Sorter sorter) {
        int testCount = cases.size();

        for (int i = 0; i < testCount; i ++) {
            TestCase<Integer> aCase = cases.get(i);
            Integer[] input = aCase.getInput();
            Integer[] expect = aCase.getExpectedOutput();
            sorter.sort(input);
            Assert.assertArrayEquals(expect, input);
        }
    }

    @Test
    public void testInsertSort() {
        test(new InsertSorter());
    }

    @Test
    public void testBubbleSort() {
        test(new BubbleSorter());
    }


    @Test
    public void testQuickSort() {
        test(new QuickSorter());
    }
}