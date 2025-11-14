package com.example.demo.data;

import jakarta.persistence.*;

//@Entity
//@Table(name = "JURISDICTION_SET_VALUES")
public class JurisdictionSetValues {
/*
    @Id
    @Column(name = "JURISDICTION_SET_VALUES_ID", nullable = false)
    private Long jurisdictionSetValuesId;

    @Column(name = "JURISDICTION_ID", nullable = false)
    private Long jurisdictionId;

    @Column(name = "JURISDICTION_SET_ID", nullable = false)
    private Long jurisdictionSetId;

    @Column(name = "JURISDICTION_SHORT_NAME", length = 100)
    private String jurisdictionShortName;

    @Column(name = "JURISDICTION_NAME", length = 100)
    private String jurisdictionName;

    // Example of the relationship mapping to JURISDICTION_SET table
    // Uncomment if you have a corresponding entity class for JURISDICTION_SET
    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JURISDICTION_SET_ID", referencedColumnName = "JURISDICTION_SET_ID", insertable = false, updatable = false)
    private JurisdictionSet jurisdictionSet;


    // Constructors
    //public JurisdictionSetValue() {}

    public void JurisdictionSetValue(Long jurisdictionSetValuesId, Long jurisdictionId, Long jurisdictionSetId) {
        this.jurisdictionSetValuesId = jurisdictionSetValuesId;
        this.jurisdictionId = jurisdictionId;
        this.jurisdictionSetId = jurisdictionSetId;
    }

    // Getters and setters
    public Long getJurisdictionSetValuesId() {
        return jurisdictionSetValuesId;
    }

    public void setJurisdictionSetValuesId(Long jurisdictionSetValuesId) {
        this.jurisdictionSetValuesId = jurisdictionSetValuesId;
    }

    public Long getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Long jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public Long getJurisdictionSetId() {
        return jurisdictionSetId;
    }

    public void setJurisdictionSetId(Long jurisdictionSetId) {
        this.jurisdictionSetId = jurisdictionSetId;
    }

    public String getJurisdictionShortName() {
        return jurisdictionShortName;
    }

    public void setJurisdictionShortName(String jurisdictionShortName) {
        this.jurisdictionShortName = jurisdictionShortName;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    // Optional: toString(), equals(), hashCode()
    @Override
    public String toString() {
        return "JurisdictionSetValue{" +
                "jurisdictionSetValuesId=" + jurisdictionSetValuesId +
                ", jurisdictionId=" + jurisdictionId +
                ", jurisdictionSetId=" + jurisdictionSetId +
                ", jurisdictionShortName='" + jurisdictionShortName + '\'' +
                ", jurisdictionName='" + jurisdictionName + '\'' +
                '}';
    }

    */
}
