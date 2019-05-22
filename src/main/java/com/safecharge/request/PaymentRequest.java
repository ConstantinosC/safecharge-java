package com.safecharge.request;

import com.safecharge.request.builder.SafechargeOrderBuilder;
import com.safecharge.request.model.PaymentOption;
import com.safecharge.util.Constants;
import com.safecharge.util.ValidChecksum;
import com.safecharge.util.ValidationUtils;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

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
public class PaymentRequest extends SafechargeOrderDetailsRequest {

    /**
     * MerchantOrderID to be used as input parameter in update method and payment methods. The parameter passed to define which merchant order to update.
     */
    @Size(max = 45, message = "orderId size must be up to 45 characters long!")
    private String orderId;

    /**
     * Payment options
     */
    @Valid
    private PaymentOption paymentOption;

    /**
     * Param indicating whether this is a regular transaction (0) or a recurring/re-billing transaction (1).
     */
    @Max(value = 1)
    @Min(value = 0)
    private int isRebilling;

    @Size(max = 50)
    private String customSiteName;

    @Size(max = 50)
    private String productId;

    @Size(max = 255)
    private String customData;

    @Size(max = 19)
    private String relatedTransactionId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public PaymentOption getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption;
    }

    public int getIsRebilling() {
        return isRebilling;
    }

    public void setIsRebilling(int isRebilling) {
        this.isRebilling = isRebilling;
    }

    public String getCustomSiteName() {
        return customSiteName;
    }

    public void setCustomSiteName(String customSiteName) {
        this.customSiteName = customSiteName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCustomData() {
        return customData;
    }

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    public String getRelatedTransactionId() {
        return relatedTransactionId;
    }

    public void setRelatedTransactionId(String relatedTransactionId) {
        this.relatedTransactionId = relatedTransactionId;
    }

    public static PaymentRequest.Builder builder() {
        return new PaymentRequest.Builder();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentRequest{");
        sb.append("orderId='").append(orderId).append('\'');
        sb.append(", paymentOption=").append(paymentOption);
        sb.append(", isRebilling=").append(isRebilling);
        sb.append(", customSiteName='").append(customSiteName).append('\'');
        sb.append(", productId='").append(productId).append('\'');
        sb.append(", customData='").append(customData).append('\'');
        sb.append(", relatedTransactionId='").append(relatedTransactionId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private PaymentRequest(Builder builder) {
        this.orderId = builder.orderId;
        this.paymentOption = builder.paymentOption;
        this.isRebilling = builder.isRebilling;
        this.customSiteName = builder.customSiteName;
        this.productId = builder.productId;
        this.customData = builder.customData;
        this.relatedTransactionId = builder.relatedTransactionId;
    }

    public static class Builder extends SafechargeOrderBuilder<Builder> {
        private String orderId;
        private PaymentOption paymentOption;
        private int isRebilling;
        private String customSiteName;
        private String productId;
        private String customData;
        private String relatedTransactionId;

        public Builder() {
        }

        public Builder addOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder addPaymentOption(PaymentOption paymentOption) {
            this.paymentOption = paymentOption;
            return this;
        }

        public Builder addIsRebilling(int isRebilling) {
            this.isRebilling = isRebilling;
            return this;
        }

        public Builder addCustomSiteName(String customSiteName) {
            this.customSiteName = customSiteName;
            return this;
        }

        public Builder addProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder addCustomData(String customData) {
            this.customData = customData;
            return this;
        }

        public Builder addRelatedTransactionId(String relatedTransactionId) {
            this.relatedTransactionId = relatedTransactionId;
            return this;
        }

        public SafechargeBaseRequest build() {
            return ValidationUtils.validate(new PaymentRequest(this));
        }
    }
}


