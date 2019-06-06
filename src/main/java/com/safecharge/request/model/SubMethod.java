package com.safecharge.request.model;

import com.safecharge.model.builder.NestedBuilder;

import javax.validation.constraints.Size;

public class SubMethod {

    @Size(max = 50, message = "value is invalid.")
    private String subMethod;

    private String referenceId;

    private String email;

    private SubMethod(Builder builder) {
        setSubMethod(builder.subMethod);
        setReferenceId(builder.referenceId);
        setEmail(builder.email);
    }

    public static SubMethod.Builder builder() {
        return new Builder();
    }

    public String getSubMethod() {
        return subMethod;
    }

    public void setSubMethod(String subMethod) {
        this.subMethod = subMethod;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubMethod{");
        sb.append("subMethod='").append(subMethod).append('\'');
        sb.append(", referenceId='").append(referenceId).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder extends NestedBuilder<PaymentOption.Builder, SubMethod>  {
        private String subMethod;
        private String referenceId;
        private String email;

        public Builder addSubMethod(String subMethod) {
            this.subMethod = subMethod;
            return this;
        }

        public Builder addReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        public Builder addEmail(String email) {
            this.email = email;
            return this;
        }

        public SubMethod build() {
            return new SubMethod(this);
        }
    }
}

