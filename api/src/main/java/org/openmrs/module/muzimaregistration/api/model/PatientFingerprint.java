package org.openmrs.module.muzimaregistration.api.model;

import org.openmrs.BaseOpenmrsData;

import java.io.Serializable;
import java.util.UUID;

public class PatientFingerprint extends BaseOpenmrsData implements Serializable {
    private Integer id;
    private String patientUUID;
    private String fingerprint;

    public PatientFingerprint(String patientUUID, String fingerprint){
        this.patientUUID = patientUUID;
        this.fingerprint = fingerprint;
    }

    public PatientFingerprint() {
    }

    public String getPatientUUID() {
        return patientUUID;
    }

    public void setPatientUUID(String patientUUID) {
        this.patientUUID = patientUUID;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
