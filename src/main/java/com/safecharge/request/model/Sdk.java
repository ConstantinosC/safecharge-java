package com.safecharge.request.model;

import javax.validation.constraints.Size;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 5/21/2019
 */
public class Sdk {

    @Size(max = 36)
    private String appID;

    @Size(max = 64000)
    private String encData;

    @Size(max = 256)
    private String ephemPubKey;

    @Size(max = 2)
    private String maxTimeout;

    @Size(max = 32)
    private String referenceNumber;

    @Size(max = 36)
    private String transID;

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getEncData() {
        return encData;
    }

    public void setEncData(String encData) {
        this.encData = encData;
    }

    public String getEphemPubKey() {
        return ephemPubKey;
    }

    public void setEphemPubKey(String ephemPubKey) {
        this.ephemPubKey = ephemPubKey;
    }

    public String getMaxTimeout() {
        return maxTimeout;
    }

    public void setMaxTimeout(String maxTimeout) {
        this.maxTimeout = maxTimeout;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sdk{");
        sb.append("appID='").append(appID).append('\'');
        sb.append(", encData='").append(encData).append('\'');
        sb.append(", ephemPubKey='").append(ephemPubKey).append('\'');
        sb.append(", maxTimeout='").append(maxTimeout).append('\'');
        sb.append(", referenceNumber='").append(referenceNumber).append('\'');
        sb.append(", transID='").append(transID).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
