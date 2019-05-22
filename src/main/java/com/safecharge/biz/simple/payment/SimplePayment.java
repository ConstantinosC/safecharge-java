package com.safecharge.biz.simple.payment;

import com.safecharge.biz.SafechargeRequestExecutor;
import com.safecharge.model.CardData;
import com.safecharge.model.ExternalMpi;
import com.safecharge.model.MerchantInfo;
import com.safecharge.request.GetSessionTokenRequest;
import com.safecharge.request.PaymentCCRequest;
import com.safecharge.request.PaymentRequest;
import com.safecharge.request.SafechargeBaseRequest;
import com.safecharge.request.model.PaymentOption;
import com.safecharge.response.PaymentResponse;
import com.safecharge.response.SafechargeResponse;
import com.safecharge.util.Constants;

public class SimplePayment {

    private MerchantInfo merchantInfo;

    private SafechargeRequestExecutor requestExecutor = SafechargeRequestExecutor.getInstance();

    /**
     * Even if this constructor allows the {@code merchantInfo} to be null, the payment request will fail due to missing parameters
     *
     * @param merchantInfo (required) A {@link MerchantInfo} object containing info needed to create a request to Safecharge
     */
    public SimplePayment(MerchantInfo merchantInfo) {
        this.merchantInfo = merchantInfo;
    }

    private PaymentResponse executePayment(PaymentOption paymentOption, String amount, String currency,
                                           Constants.TransactionType transactionType, String isPartialApproval, ExternalMpi externalMpi) {
        SafechargeResponse getSessionTokenResponse = requestExecutor
                .executeRequest(GetSessionTokenRequest.builder().addMerchantInfo(merchantInfo).build());

        if (getSessionTokenResponse != null
                && Constants.APIResponseStatus.SUCCESS.equals(getSessionTokenResponse.getStatus())) {
            SafechargeBaseRequest paymentRequest = PaymentRequest.builder()
                    .addSessionToken(getSessionTokenResponse.getSessionToken())
                    .addMerchantInfo(merchantInfo)
                    .addPaymentOption(paymentOption)
                    .addCurrency(currency)
                    .addAmount(amount)
                    .build();
            return (PaymentResponse) requestExecutor.executeRequest(paymentRequest);
        } else {
            return null;
        }
    }
}
