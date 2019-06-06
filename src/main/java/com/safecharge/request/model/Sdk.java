package com.safecharge.request.model;

import com.safecharge.model.builder.NestedBuilder;

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

    private Sdk(Builder builder) {
        setAppID(builder.appID);
        setEncData(builder.encData);
        setEphemPubKey(builder.ephemPubKey);
        setMaxTimeout(builder.maxTimeout);
        setReferenceNumber(builder.referenceNumber);
        setTransID(builder.transID);
    }

    public static Sdk.Builder builder() {
        return new Builder();
    }

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

    public static final class Builder extends NestedBuilder<ThreeD.Builder, Sdk> {
        private String appID;
        private String encData;
        private String ephemPubKey;
        private String maxTimeout;
        private String referenceNumber;
        private String transID;

        private Builder() {
        }

        public Builder withAppID(String appID) {
            this.appID = appID;
            return this;
        }

        public Builder withEncData(String encData) {
            this.encData = encData;
            return this;
        }

        public Builder withEphemPubKey(String ephemPubKey) {
            this.ephemPubKey = ephemPubKey;
            return this;
        }

        public Builder withMaxTimeout(String maxTimeout) {
            this.maxTimeout = maxTimeout;
            return this;
        }

        public Builder withReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Builder withTransID(String transID) {
            this.transID = transID;
            return this;
        }

        public Sdk build() {
            return new Sdk(this);
        }
    }
}
