/**
 * Example of Inner Class
 * Implement a data structure to print even valve of an int array.
 */

package com.learn.nestedclass.innerclass;

import java.util.Iterator;

public class DataStructure {
    private static final int SIZE = 15;
    private int[] array = new int[SIZE];
    DataStructure(){
        for (int i=0;i<SIZE;i++)
            array[i]=i;
    }

    public void printEven(){
        DataStructureIterator dsItr = new EvenIterator();
        while (dsItr.hasNext()){
            System.out.println(dsItr.next());
        }
    }

    interface DataStructureIterator extends Iterator<Integer>{}

    private class EvenIterator implements DataStructureIterator{
        private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            if(nextIndex<SIZE)
                return true;
            return false;
        }

        @Override
        public Integer next() {
            Integer value = Integer.valueOf(array[nextIndex]);
            nextIndex += 2;
            return value;
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
