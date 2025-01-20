package com.example.external_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalProperties {

    @Value("${external.baseUrl}")
    String baseUrl;
    @Value("${external.isProd}")
    boolean isProd;
    @Value("${external.buildVersion}")
    double buildVersion;

    public String getBaseUrl() {
        return baseUrl;
    }

    public boolean isProd() {
        return isProd;
    }

    public double getBuildVersion() {
        return buildVersion;
    }

    @Override
    public String toString() {
        return "ExternalProperties{" +
                "baseUrl='" + baseUrl + '\'' +
                ", isProd=" + isProd +
                ", buildVersion=" + buildVersion +
                '}';
    }
}
