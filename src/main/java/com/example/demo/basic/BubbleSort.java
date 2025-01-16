package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Qualifier("bubble")
public class BubbleSort implements ISortAlgorithm {

    public void sort(int[] unsortedNumbers) {
        Arrays.sort(unsortedNumbers);
    }
}
