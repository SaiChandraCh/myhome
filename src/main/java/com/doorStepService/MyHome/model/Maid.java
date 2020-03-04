package com.doorStepService.MyHome.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Maid {

    @Id
    private String myHomeId = null;
    private int serviceProviderType = 0;
    private String name = null;
    private String idProof = null;
    private int idProofType = 0;
    private String description = null;
    private String locality = null;

    public Maid(int serviceProviderType, String name, String idProof, int idProofType, String description, String locality) {
        this.serviceProviderType = serviceProviderType;
        this.name = name;
        this.idProof = idProof;
        this.idProofType = idProofType;
        this.description = description;
        this.locality = locality;
    }


    public int getServiceProviderType() {
        return serviceProviderType;
    }

    public void setServiceProviderType(int serviceProviderType) {
        this.serviceProviderType = serviceProviderType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public int getIdProofType() {
        return idProofType;
    }

    public void setIdProofType(int idProofType) {
        this.idProofType = idProofType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

}
