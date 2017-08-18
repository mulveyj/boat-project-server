package com.joemulvey.models;

import javax.persistence.*;
import java.net.URL;


@Entity
public class SailBoat {

    private Long boat_id;
    private URL imgURL;
    private String vesselClass;
    private String vesselName;
    private String construction;
    private String builder;
    private int lengthOverAll;
    private int mainReefs;
    private String spinnaker;
    private String headsail1;
    private String headsail2;
    private String headsail3;

    public SailBoat(String vesselName, String builder, int lengthOverAll) {
        this.vesselName = vesselName;
        this.builder = builder;
        this.lengthOverAll = lengthOverAll;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="boat_id")
    public Long getBoat_id() {
        return boat_id;
    }

    public void setImgURL(URL imgURL) {
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

    public void setHeadsail1(String headsail1) {
        this.headsail1 = headsail1;
    }

    public void setHeadsail2(String headsail2) {
        this.headsail2 = headsail2;
    }

    public void setHeadsail3(String headsail3) {
        this.headsail3 = headsail3;
    }

    @Column(name="imgURL")
    public URL getImgURL() {
        return imgURL;
    }

    @Column(name="vesselClass")
    public String getVesselClass() {
        return vesselClass;
    }

    @Column(name="vesselName")
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

    @Column(name="lengthOverAll")
    public int getLengthOverAll() {
        return lengthOverAll;
    }

    @Column(name="mainReefs")
    public int getMainReefs() {
        return mainReefs;
    }

    @Column(name="spinnaker")
    public String getSpinnaker() {
        return spinnaker;
    }

    @Column(name="headsail1")
    public String getHeadsail1() {
        return headsail1;
    }

    @Column(name="headsail2")
    public String getHeadsail2() {
        return headsail2;
    }

    @Column(name="headsail3")
    public String getHeadsail3() {
        return headsail3;
    }

}
