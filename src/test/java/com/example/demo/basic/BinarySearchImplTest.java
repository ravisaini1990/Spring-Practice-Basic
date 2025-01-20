package com.example.demo.basic;

import com.example.demo.BasicSpringApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = BasicSpringApplication.class)
class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    void binarySearch() {
        Assertions.assertNotNull(binarySearch);
        int result = binarySearch.binarySearch(new int[] {22, 23, 28, 21}, 28);
        Assertions.assertEquals(3, result);
        Assertions.assertNotEquals(1, result);
    }
}