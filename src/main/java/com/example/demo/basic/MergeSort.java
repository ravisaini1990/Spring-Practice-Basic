package com.example.demo.basic;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//@Primary
public class MergeSort implements ISortAlgorithm {

    public void sort(int[] unsortedNumbers) {
        Arrays.sort(unsortedNumbers);
    }
}
