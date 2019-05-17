package com.safecharge.request;

import com.safecharge.request.builder.SafechargeCCBuilder;
import com.safecharge.util.Constants;
import com.safecharge.util.ValidChecksum;
import com.safecharge.util.ValidationUtils;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 * Request to perform a payment.
 * <p>
 * The request must contain only one of the three:
 * <ol>
 * <li>CardData(such as card number, cardholder name, CVV, expiration date)
 * <li>User Payment Option ID of previouslt used credit/debit card, which info is stored by the SafeCharge's system.
 * <li>Temporary card token.
 * </ol>
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>

 * @since 5/13/2019
 */
@ValidChecksum(orderMappingName = Constants.ChecksumOrderMapping.API_GENERIC_CHECKSUM_MAPPING)
public class PaymentRequest extends SafechargeCCRequest {

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends SafechargeCCBuilder<PaymentRequest.Builder> {

        /**
         * Builds the request.
         *
         * @return {@link SafechargeRequest} object build from the params set by this builder
         */
        @Override
        public SafechargeBaseRequest build() {
            PaymentRequest request = new PaymentRequest();
            return ValidationUtils.validate(super.build(request));
        }
    }
}


