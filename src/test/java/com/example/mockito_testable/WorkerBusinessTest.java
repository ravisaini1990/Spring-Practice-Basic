package com.example.mockito_testable;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WorkerBusinessTest {

    @Mock
    WorkerDao workerDao;

    @InjectMocks
    WorkerBusiness workerBusiness;

    @Test
    void name() {
        assertNotNull(workerDao);
        assertNotNull(workerBusiness);

        Mockito.when(workerDao.getWorkers()).thenReturn(new int[] {1, 13, 11, 500, 652, 22});

        int result = workerBusiness.fetchGreatestNumber();
        assertEquals(652, result);
    }
}