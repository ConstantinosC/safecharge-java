package com.safecharge.request;

import com.safecharge.request.builder.SafechargeOrderBuilder;
import com.safecharge.util.Constants;
import com.safecharge.util.ValidChecksum;
import com.safecharge.util.ValidationUtil;

/**
 * Copyright (C) 2007-2017 SafeCharge International Group Limited.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @since 2/15/2017
 */
@ValidChecksum(orderMappingName = Constants.ChecksumOrderMapping.API_GENERIC_CHECKSUM_MAPPING)
public class OpenOrderRequest extends SafechargeOrderDetailsRequest {

    public static Builder builder() {
        return new Builder();
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("OpenOrderRequest{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    public static class Builder extends SafechargeOrderBuilder<Builder> {

        @Override public SafechargeRequest build() {
            SafechargeOrderDetailsRequest openOrderRequest = new OpenOrderRequest();
            return ValidationUtil.validate(super.build(openOrderRequest));
        }
    }
}