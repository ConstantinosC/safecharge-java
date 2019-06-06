package com.safecharge.request.model;

import com.safecharge.model.CardData;
import com.safecharge.model.StoredCredentials;
import com.safecharge.model.builder.NestedBuilder;

import javax.validation.Valid;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 5/21/2019
 */
public class Card extends CardData  {

    private String acquirerId;

    @Valid
    private ExternalToken externalToken;

    @Valid
    private StoredCredentials storedCredentials;

    @Valid
    private ThreeD threeD;

    private Card(Builder builder) {
        setCardNumber(builder.cardNumber);
        setCardHolderName(builder.cardHolderName);
        setExpirationMonth(builder.expirationMonth);
        setExpirationYear(builder.expirationYear);
        setCcTempToken(builder.ccTempToken);
        setCVV(builder.cVV);
        setAcquirerId(builder.acquirerId);
        setExternalToken(builder.externalToken);
        setStoredCredentials(builder.storedCredentials);
        setThreeD(builder.threeD);
    }

    public static Card.Builder builder() {
        return new Card.Builder();
    }

    public String getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    public ExternalToken getExternalToken() {
        return externalToken;
    }

    public void setExternalToken(ExternalToken externalToken) {
        this.externalToken = externalToken;
    }

    public StoredCredentials getStoredCredentials() {
        return storedCredentials;
    }

    public void setStoredCredentials(StoredCredentials storedCredentials) {
        this.storedCredentials = storedCredentials;
    }

    public ThreeD getThreeD() {
        return threeD;
    }

    public void setThreeD(ThreeD threeD) {
        this.threeD = threeD;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("acquirerId='").append(acquirerId).append('\'');
        sb.append(", externalToken=").append(externalToken);
        sb.append(", storedCredentials=").append(storedCredentials);
        sb.append(", threeD=").append(threeD);
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder extends NestedBuilder<PaymentOption.Builder, Card> {
        private String cardNumber;
        private String cardHolderName;
        private String expirationMonth;
        private String expirationYear;
        private String ccTempToken;
        private String cVV;
        private String acquirerId;
        private ExternalToken externalToken;
        private StoredCredentials storedCredentials;
        private ThreeD threeD;

        public Builder addCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder addCardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        public Builder addExpirationMonth(String expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        public Builder addExpirationYear(String expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        public Builder addCcTempToken(String ccTempToken) {
            this.ccTempToken = ccTempToken;
            return this;
        }

        public Builder addCVV(String cVV) {
            this.cVV = cVV;
            return this;
        }

        public Builder addAcquirerId(String acquirerId) {
            this.acquirerId = acquirerId;
            return this;
        }

        public Builder addExternalToken(ExternalToken externalToken) {
            this.externalToken = externalToken;
            return this;
        }

        public ExternalToken.Builder withExternalToken() {
            return ExternalToken.builder().withParentBuilder(this);
        }

        public Builder addStoredCredentials(StoredCredentials storedCredentials) {
            this.storedCredentials = storedCredentials;
            return this;
        }

        public StoredCredentials.Builder withStoredCredentials() {
            return StoredCredentials.builder().withParentBuilder(this);
        }

        public Builder addThreeD(ThreeD threeD) {
            this.threeD = threeD;
            return this;
        }

        public ThreeD.Builder withThreeD(String methodCompletion) {
            return ThreeD.builder(methodCompletion).withParentBuilder(this);
        }

        public Card build() {
            return new Card(this);
        }
    }
}
