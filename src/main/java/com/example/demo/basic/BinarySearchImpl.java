package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//@Scope("Singleton")
public class BinarySearchImpl {

    //setter injection
    //@Autowired
    /* public void setSortAlgorithm(ISortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

//    @Autowired
//    ISortAlgorithm sortAlgorithm;

    @Autowired
    MergeSort mergeSort;

    //@Autowired
    //ISortAlgorithm bubbleSort;

    //constructor Injection
//    public BinarySearchImpl(ISortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

//    public ISortAlgorithm getSorter() {
//        return mergeSort;
//    }

    public int binarySearch(int[] numbers, int noToBeSearched) {
        ISortAlgorithm sortAlgorithm = mergeSort;
        sortAlgorithm.sort(numbers);
        System.out.println("Using sorting alogo :"+sortAlgorithm);
        return Arrays.binarySearch(numbers, noToBeSearched);
    }
}
