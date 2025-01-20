package com.example.application_xml;

public class XmlBusiness {
    public void setXmlDao(XmlDao xmlDao) {
        this.xmlDao = xmlDao;
    }

    XmlDao xmlDao;

    public XmlBusiness(XmlDao xmlDao) {
        this.xmlDao = xmlDao;
    }

    public String getXmlDao() {
        return xmlDao.getDaoName();
    }

    public String getName() {
        return  XmlBusiness.class.getName();
    }
}
