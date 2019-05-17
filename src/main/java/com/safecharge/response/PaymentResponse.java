package com.safecharge.response;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 * Response received from the SafeCharge's servers to the {@link com.safecharge.request.PaymentRequest}.
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @see com.safecharge.request.PaymentRequest
 * @since 5/13/2019
 */
public class PaymentResponse extends PaymentsResponse {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentResponse{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
