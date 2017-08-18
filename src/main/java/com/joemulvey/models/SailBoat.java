package com.joemulvey.models;

import java.net.URL;

public class SailBoat {

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

    public URL getImgURL() {
        return imgURL;
    }

    public String getVesselClass() {
        return vesselClass;
    }

    public String getVesselName() {
        return vesselName;
    }

    public String getConstruction() {
        return construction;
    }

    public String getBuilder() {
        return builder;
    }

    public int getLengthOverAll() {
        return lengthOverAll;
    }

    public int getMainReefs() {
        return mainReefs;
    }

    public String getSpinnaker() {
        return spinnaker;
    }

    public String getHeadsail1() {
        return headsail1;
    }

    public String getHeadsail2() {
        return headsail2;
    }

    public String getHeadsail3() {
        return headsail3;
    }

}
