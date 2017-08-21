package com.joemulvey.models;

import javax.persistence.*;

@Entity(name = "sailboat")
public class SailBoat {

    private Long boatId = null;
    private String imgURL;
    private String vesselClass;
    private String vesselName;
    private String construction;
    private String builder;
    private int lengthOverAll;
    private int mainReefs;
    private String spinnaker;
    private String headsailOne;
    private String headsailTwo;
    private String headsailThree;


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="boat_id")
    public Long getBoatId() {
        return boatId;
    }

    public void setBoatId(Long boatId) {
        this.boatId = boatId;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setLengthOverAll(int lengthOverAll) {
        this.lengthOverAll = lengthOverAll;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public void setVesselClass(String vesselClass) {
        this.vesselClass = vesselClass;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public void setMainReefs(int mainReefs) {
        this.mainReefs = mainReefs;
    }

    public void setSpinnaker(String spinnaker) {
        this.spinnaker = spinnaker;
    }

    @Column(name="img_url")
    public String getImgURL() {
        return imgURL;
    }

    @Column(name="vessel_class")
    public String getVesselClass() {
        return vesselClass;
    }

    @Column(name="vessel_name")
    public String getVesselName() {
        return vesselName;
    }

    @Column(name="construction")
    public String getConstruction() {
        return construction;
    }

    @Column(name="builder")
    public String getBuilder() {
        return builder;
    }

    @Column(name="length_over_all")
    public int getLengthOverAll() {
        return lengthOverAll;
    }

    @Column(name="main_reefs")
    public int getMainReefs() {
        return mainReefs;
    }

    @Column(name="spinnaker")
    public String getSpinnaker() {
        return spinnaker;
    }

    @Column(name="headsail_one")
    public String getHeadsailOne() {
        return headsailOne;
    }

    public void setHeadsailOne(String headsailOne) {
        this.headsailOne = headsailOne;
    }

    @Column(name="headsail_two")
    public String getHeadsailTwo() {
        return headsailTwo;
    }

    public void setHeadsailTwo(String headsailTwo) {
        this.headsailTwo = headsailTwo;
    }

    @Column(name="headsail_three")
    public String getHeadsailThree() {
        return headsailThree;
    }

    public void setHeadsailThree(String headsailThree) {
        this.headsailThree = headsailThree;
    }
}
