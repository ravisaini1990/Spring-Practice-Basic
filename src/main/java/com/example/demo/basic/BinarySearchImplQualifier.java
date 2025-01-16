package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//@Scope("prototype")
//@Scope("session")
//@Scope("request")
//@Scope("singleton")

//or

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImplQualifier {

    //setter injection
    //@Autowired
    /* public void setSortAlgorithm(ISortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

//    @Autowired
//    ISortAlgorithm sortAlgorithm;

    @Autowired
    ISortAlgorithm mergeSort;

    @Autowired
    @Qualifier("bubble")
    ISortAlgorithm iSortAlgorithm;

    //constructor Injection
//    public BinarySearchImpl(ISortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

//    public ISortAlgorithm getSorter() {
//        return mergeSort;
//    }

    public int binarySearch(int[] numbers, int noToBeSearched) {
        ISortAlgorithm sortAlgorithm = iSortAlgorithm;
        sortAlgorithm.sort(numbers);
        System.out.println("Using sorting alogo :"+sortAlgorithm);
        return Arrays.binarySearch(numbers, noToBeSearched);
    }
}
