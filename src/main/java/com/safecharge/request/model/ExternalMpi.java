package com.safecharge.request.model;

import com.safecharge.model.builder.NestedBuilder;
import com.safecharge.util.BooleanString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ExternalMpi {

    @BooleanString(mandatory = true)
    private String isExternalMpi;

    @Size(min = 1, max = 2, message = "value is invalid.")
    @NotNull
    private String eci;

    @Size(min = 1, max = 50, message = "value is invalid. The length of the value should be between {min} and {max} symbols.")
    @NotNull
    private String cavv;

    @Size(max = 50, message = "value is invalid. The length of the value should be maximum {max} symbols.")
    private String xid;

    private ExternalMpi(Builder builder) {
        setIsExternalMpi(builder.isExternalMpi);
        setEci(builder.eci);
        setCavv(builder.cavv);
        setXid(builder.xid);
    }

    public static ExternalMpi.Builder builder() {
        return new Builder();
    }

    public String getIsExternalMpi() {
        return isExternalMpi;
    }

    public void setIsExternalMpi(String isExternalMpi) {
        this.isExternalMpi = isExternalMpi;
    }

    public String getEci() {
        return eci;
    }

    public void setEci(String eci) {
        this.eci = eci;
    }

    public String getCavv() {
        return cavv;
    }

    public void setCavv(String cavv) {
        this.cavv = cavv;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExternalMpi{");
        sb.append("isExternalMpi='").append(isExternalMpi).append('\'');
        sb.append(", eci='").append(eci).append('\'');
        sb.append(", cavv='").append(cavv).append('\'');
        sb.append(", xid='").append(xid).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder extends NestedBuilder<ThreeD.Builder, ExternalMpi> {
        private String isExternalMpi;
        private String eci;
        private String cavv;
        private String xid;

        public Builder addIsExternalMpi(String isExternalMpi) {
            this.isExternalMpi = isExternalMpi;
            return this;
        }

        public Builder addEci(String eci) {
            this.eci = eci;
            return this;
        }

        public Builder addCavv(String cavv) {
            this.cavv = cavv;
            return this;
        }

        public Builder addXid(String xid) {
            this.xid = xid;
            return this;
        }

        public ExternalMpi build() {
            return new ExternalMpi(this);
        }
    }
}
