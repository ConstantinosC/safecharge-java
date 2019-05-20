package com.safecharge.request;

import com.safecharge.model.*;
import com.safecharge.request.builder.SafechargeCCBuilder;
import com.safecharge.util.Constants;
import com.safecharge.util.ValidChecksum;
import com.safecharge.util.ValidationUtils;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

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
public class PaymentRequest extends SafechargeRequest {


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
     * The ID of the user token to add to the request.
     */
    @Size(max = 255, message = "userTokenId value size must be up to 255 characters")
    private String userTokenId;

    /**
     * ID of the transaction in merchant system.
     */
    @Size(max = 45, message = "clientUniqueId size must be up to 45 characters long!")
    protected String clientUniqueId;

    /**
     * Param indicating whether this is a regular transaction (0) or a recurring/re-billing transaction (1).
     */
    @Max(value = 1)
    @Min(value = 0)
    private int isRebilling;

    @Size(max = 3)
    private String currency;

    @Size(max = 12)
    private String amount;

    private AmountDetails amountDetails;

    /**
     * List of items that will be purchased.
     */
    @Valid
    @NotNull
    @Size(min = 1, message = "Request must have at least one item!")
    private List<Item> items = new ArrayList<>();

    /**
     * The details for the device from which the transaction will be made.
     */
    @Valid
    private DeviceDetails deviceDetails;

    /**
     * Shipping address related to a user's order.
     */
    @Valid
    private UserAddress shippingAddress;

    /**
     * Billing address related to a user payment option. Since order can contain only one payment option billing address is part of the order parameters.
     */
    @Valid
    private UserAddress billingAddress;

    /**
     * Merchant descriptor - this is the message(Merchant's name and phone) that the user will see in his payment bank report.
     */
    @Valid
    private DynamicDescriptor dynamicDescriptor;

    /**
     * Optional custom fields.
     */
    @Valid
    private MerchantDetails merchantDetails;

    /**
     * This block contain industry specific addendums such as: Local payment, Hotel, Airline etc.
     */
    private Addendums addendums;

    /**
     * Although DMN response can be configured per merchant site, it will allow to dynamically return the DMN to the provided address per request.
     */
    @Valid
    private UrlDetails urlDetails;

    @Size(max = 50)
    private String customSiteName;

    @Size(max = 50)
    private String productId;

    @Size(max = 255)
    private String customData;

    /**
     * The ID of the original auth transaction.
     */
    @NotNull(message = "relatedTransactionId parameter is mandatory!")
    protected String relatedTransactionId;




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


