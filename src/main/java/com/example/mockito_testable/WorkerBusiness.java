package com.example.mockito_testable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class WorkerBusiness {

    public WorkerDao getWorkerDao() {
        return workerDao;
    }

    public void setWorkerDao(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }

    @Autowired
    WorkerDao workerDao;

    public  int fetchGreatestNumber() {
        int[] data = workerDao.getWorkers();
        return Arrays.stream(data).max().getAsInt();
    }
}
