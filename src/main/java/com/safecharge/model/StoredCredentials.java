package com.safecharge.model;

import javax.validation.constraints.Size;

public class StoredCredentials {

    public StoredCredentials(String storedCredentialsMode) {
        this.storedCredentialsMode = storedCredentialsMode;
    }

    @Size(max = 1)
    private String storedCredentialsMode;

    public String getStoredCredentialsMode() {
        return storedCredentialsMode;
    }

    public void setStoredCredentialsMode(String storedCredentialsMode) {
        this.storedCredentialsMode = storedCredentialsMode;
    }

}
