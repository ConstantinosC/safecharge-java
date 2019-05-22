package com.safecharge.request.model;

import com.safecharge.model.CardData;
import com.safecharge.model.StoredCredentials;

import javax.validation.Valid;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 5/21/2019
 */
public class Card extends CardData {

    private String acquirerId;

    @Valid
    private ExternalToken externalToken;

    @Valid
    private StoredCredentials storedCredentials;

    @Valid
    private ThreeD threeD;

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
}
