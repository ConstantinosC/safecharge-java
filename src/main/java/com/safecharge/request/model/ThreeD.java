package com.safecharge.request.model;

import com.safecharge.model.BrowserDetails;
import com.safecharge.model.builder.NestedBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 5/21/2019
 */
public class ThreeD {

    @Size(max = 1, message = "value is invalid. The allowed values are: (0, {max}).")
    private String isDynamic3D;

    private String dynamic3DMode;

    private String convertNoneEntrolled;

    @Valid
    private ExternalMpi externalMpi;

    @Valid
    private BrowserDetails browserDetails;

    @Valid
    private ThreeDSecure threeDSecure;

    private String paResponse;

    @Valid
    private Sdk sdk;

    @Size(max = 1, message = "value is invalid.")
    @NotNull
    private String methodCompletionInd;

    private ThreeD(Builder builder) {
        setIsDynamic3D(builder.isDynamic3D);
        setDynamic3DMode(builder.dynamic3DMode);
        setConvertNoneEntrolled(builder.convertNoneEntrolled);
        setExternalMpi(builder.externalMpi);
        setBrowserDetails(builder.browserDetails);
        setThreeDSecure(builder.threeDSecure);
        setPaResponse(builder.paResponse);
        setSdk(builder.sdk);
        setMethodCompletionInd(builder.methodCompletionInd);
    }

    public static ThreeD.Builder builder(String methodCompletionInd) {
        return new Builder(methodCompletionInd);
    }

    public String getIsDynamic3D() {
        return isDynamic3D;
    }

    public void setIsDynamic3D(String isDynamic3D) {
        this.isDynamic3D = isDynamic3D;
    }

    public String getDynamic3DMode() {
        return dynamic3DMode;
    }

    public void setDynamic3DMode(String dynamic3DMode) {
        this.dynamic3DMode = dynamic3DMode;
    }

    public String getConvertNoneEntrolled() {
        return convertNoneEntrolled;
    }

    public void setConvertNoneEntrolled(String convertNoneEntrolled) {
        this.convertNoneEntrolled = convertNoneEntrolled;
    }

    public ExternalMpi getExternalMpi() {
        return externalMpi;
    }

    public void setExternalMpi(ExternalMpi externalMpi) {
        this.externalMpi = externalMpi;
    }

    public BrowserDetails getBrowserDetails() {
        return browserDetails;
    }

    public void setBrowserDetails(BrowserDetails browserDetails) {
        this.browserDetails = browserDetails;
    }

    public ThreeDSecure getThreeDSecure() {
        return threeDSecure;
    }

    public void setThreeDSecure(ThreeDSecure threeDSecure) {
        this.threeDSecure = threeDSecure;
    }

    public String getPaResponse() {
        return paResponse;
    }

    public void setPaResponse(String paResponse) {
        this.paResponse = paResponse;
    }

    public Sdk getSdk() {
        return sdk;
    }

    public void setSdk(Sdk sdk) {
        this.sdk = sdk;
    }

    public String getMethodCompletionInd() {
        return methodCompletionInd;
    }

    public void setMethodCompletionInd(String methodCompletionInd) {
        this.methodCompletionInd = methodCompletionInd;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ThreeD{");
        sb.append("isDynamic3D='").append(isDynamic3D).append('\'');
        sb.append(", dynamic3DMode='").append(dynamic3DMode).append('\'');
        sb.append(", convertNoneEntrolled='").append(convertNoneEntrolled).append('\'');
        sb.append(", externalMpi=").append(externalMpi);
        sb.append(", browserDetails=").append(browserDetails);
        sb.append(", threeDSecure=").append(threeDSecure);
        sb.append(", paResponse='").append(paResponse).append('\'');
        sb.append(", sdk=").append(sdk);
        sb.append(", methodCompletionInd='").append(methodCompletionInd).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder extends NestedBuilder<Card.Builder, ThreeD>  {
        private String isDynamic3D;
        private String dynamic3DMode;
        private String convertNoneEntrolled;
        private ExternalMpi externalMpi;
        private BrowserDetails browserDetails;
        private ThreeDSecure threeDSecure;
        private String paResponse;
        private Sdk sdk;
        private String methodCompletionInd;

        private Builder(String methodCompletionInd) {
            this.methodCompletionInd = methodCompletionInd;
        }
        
        public Builder addIsDynamic3D(String isDynamic3D) {
            this.isDynamic3D = isDynamic3D;
            return this;
        }

        public Builder addDynamic3DMode(String dynamic3DMode) {
            this.dynamic3DMode = dynamic3DMode;
            return this;
        }

        public Builder addConvertNoneEntrolled(String convertNoneEntrolled) {
            this.convertNoneEntrolled = convertNoneEntrolled;
            return this;
        }

        public Builder addExternalMpi(ExternalMpi externalMpi) {
            this.externalMpi = externalMpi;
            return this;
        }

        public ExternalMpi.Builder withExternalMpi() {
            return ExternalMpi.builder().withParentBuilder(this);
        }

        public Builder addBrowserDetails(BrowserDetails browserDetails) {
            this.browserDetails = browserDetails;
            return this;
        }

        public BrowserDetails.Builder withBrowserDetails() {
            return BrowserDetails.builder().withParentBuilder(this);
        }

        public Builder addThreeDSecure(ThreeDSecure threeDSecure) {
            this.threeDSecure = threeDSecure;
            return this;
        }

        public ThreeDSecure.Builder withThreeDSecure() {
            return ThreeDSecure.builder().withParentBuilder(this);
        }

        public Builder addPaResponse(String paResponse) {
            this.paResponse = paResponse;
            return this;
        }

        public Builder addSdk(Sdk sdk) {
            this.sdk = sdk;
            return this;
        }

        public Sdk.Builder withSdk() {
            return Sdk.builder().withParentBuilder(this);
        }

        public Builder addMethodCompletionInd(String methodCompletionInd) {
            this.methodCompletionInd = methodCompletionInd;
            return this;
        }

        public ThreeD build() {
            return new ThreeD(this);
        }
    }
}


