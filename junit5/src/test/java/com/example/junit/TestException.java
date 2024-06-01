package com.example.junit;

import org.junit.jupiter.api.Test;

public class TestException {
    @SuppressWarnings("unused")
    @Test
    void testSortingArray_Exception(){
        try{
            SortingArray array = new SortingArray();
            int unsorted[] = null;
            int sortedArray[] = array.sortingArray(unsorted);
            System.out.println("Statements below exception");
        } catch(NullPointerException e){
            System.out.println("Exception generated");
        }
    }
}
