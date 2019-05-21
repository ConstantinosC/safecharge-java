package com.safecharge.model;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 5/21/2019
 */
public class ThreeD {

    private String threeDReason;
    private String threeDFlow;
    private String paRequest;
    private String acsUrl;
    private String eci;

    public String getThreeDReason() {
        return threeDReason;
    }

    public void setThreeDReason(String threeDReason) {
        this.threeDReason = threeDReason;
    }

    public String getThreeDFlow() {
        return threeDFlow;
    }

    public void setThreeDFlow(String threeDFlow) {
        this.threeDFlow = threeDFlow;
    }

    public String getPaRequest() {
        return paRequest;
    }

    public void setPaRequest(String paRequest) {
        this.paRequest = paRequest;
    }

    public String getAcsUrl() {
        return acsUrl;
    }

    public void setAcsUrl(String acsUrl) {
        this.acsUrl = acsUrl;
    }

    public String getEci() {
        return eci;
    }

    public void setEci(String eci) {
        this.eci = eci;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ThreeD{");
        sb.append("threeDReason='").append(threeDReason).append('\'');
        sb.append(", threeDFlow='").append(threeDFlow).append('\'');
        sb.append(", paRequest='").append(paRequest).append('\'');
        sb.append(", acsUrl='").append(acsUrl).append('\'');
        sb.append(", eci='").append(eci).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
