package com.workz.model;

import java.util.UUID;

public class Tenant {
    private UUID myHomeId = null;
    private int userType = 0;
    private String name = null;
    private String idProof = null;
    private int idProofType = 0;
    private String description = null;
    private String locality = null;
    private Boolean isVilla = null;
    private int rent = 0;
    private Boolean furniture = null;
    private String otherAllowances = null; // like pets, Bachelor
    private String otherConditions = null; // like nearer to school, hospitals, grounds...

    public Tenant(UUID myHomeId, int userType, String name, String idProof, int idProofType, String description, String locality, Boolean isVilla, int rent, Boolean furniture, String otherAllowances, String otherConditions) {
        this.myHomeId = myHomeId;
        this.userType = userType;
        this.name = name;
        this.idProof = idProof;
        this.idProofType = idProofType;
        this.description = description;
        this.locality = locality;
        this.isVilla = isVilla;
        this.rent = rent;
        this.furniture = furniture;
        this.otherAllowances = otherAllowances;
        this.otherConditions = otherConditions;
    }
}
