package com.safecharge.model;

import com.safecharge.model.builder.NestedBuilder;
import com.safecharge.request.model.Card;
import javax.validation.constraints.Size;

public class StoredCredentials {

    public StoredCredentials(String storedCredentialsMode) {
        this.storedCredentialsMode = storedCredentialsMode;
    }

    @Size(max = 1)
    private String storedCredentialsMode;

    private StoredCredentials(Builder builder) {
        setStoredCredentialsMode(builder.storedCredentialsMode);
    }

    public static StoredCredentials.Builder builder() {
        return new Builder();
    }

    public String getStoredCredentialsMode() {
        return storedCredentialsMode;
    }

    public void setStoredCredentialsMode(String storedCredentialsMode) {
        this.storedCredentialsMode = storedCredentialsMode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StoredCredentials{");
        sb.append("storedCredentialsMode='").append(storedCredentialsMode).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder extends NestedBuilder<Card.Builder, StoredCredentials> {
        private String storedCredentialsMode;

        public Builder storedCredentialsMode(String storedCredentialsMode) {
            this.storedCredentialsMode = storedCredentialsMode;
            return this;
        }

        public StoredCredentials build() {
            return new StoredCredentials(this);
        }
    }
}
