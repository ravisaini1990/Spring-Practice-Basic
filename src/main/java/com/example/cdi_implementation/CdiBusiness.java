package com.example.cdi_implementation;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Singleton;

/// Java EE recommendation
@Singleton
@Named
public class CdiBusiness {

    //@Autowired
    @Inject
    CdiDao cdiDao;

    public CdiDao getCdiDao() {
        return cdiDao;
    }

    public void setCdiDao(CdiDao cdiDao) {
        this.cdiDao = cdiDao;
    }

}
