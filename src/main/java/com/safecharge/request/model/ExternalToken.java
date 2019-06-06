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
public class ExternalToken {

    @Size(max = 45)
    private String externalTokenProvider;

    @Size(max = 5000)
    private String mobileToken;

    private ExternalToken(Builder builder) {
        setExternalTokenProvider(builder.externalTokenProvider);
        setMobileToken(builder.mobileToken);
    }

    public static ExternalToken.Builder builder() {
        return new Builder();
    }

    public String getExternalTokenProvider() {
        return externalTokenProvider;
    }

    public void setExternalTokenProvider(String externalTokenProvider) {
        this.externalTokenProvider = externalTokenProvider;
    }

    public String getMobileToken() {
        return mobileToken;
    }

    public void setMobileToken(String mobileToken) {
        this.mobileToken = mobileToken;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExternalToken{");
        sb.append("externalTokenProvider='").append(externalTokenProvider).append('\'');
        sb.append(", mobileToken='").append(mobileToken).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder extends NestedBuilder<Card.Builder, ExternalToken> {
        private String externalTokenProvider;
        private String mobileToken;

        private Builder() {
        }

        public Builder externalTokenProvider(String externalTokenProvider) {
            this.externalTokenProvider = externalTokenProvider;
            return this;
        }

        public Builder mobileToken(String mobileToken) {
            this.mobileToken = mobileToken;
            return this;
        }

        public ExternalToken build() {
            return new ExternalToken(this);
        }
    }
}
