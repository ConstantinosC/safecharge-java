package com.safecharge.retail.util;

import java.util.HashMap;
import java.util.Map;

import com.safecharge.retail.request.Authorization3DRequest;
import com.safecharge.retail.request.CardTokenizationRequest;
import com.safecharge.retail.request.GetOrderDetailsRequest;
import com.safecharge.retail.request.GetSessionTokenRequest;
import com.safecharge.retail.request.OpenOrderRequest;
import com.safecharge.retail.request.PaymentAPMRequest;
import com.safecharge.retail.request.PaymentCCRequest;
import com.safecharge.retail.request.SafechargeRequest;
import com.safecharge.retail.request.UpdateOrderRequest;
import com.safecharge.retail.response.Authorization3DResponse;
import com.safecharge.retail.response.CardTokenizationResponse;
import com.safecharge.retail.response.OpenOrderResponse;
import com.safecharge.retail.response.OrderDetailsResponse;
import com.safecharge.retail.response.PaymentAPMResponse;
import com.safecharge.retail.response.PaymentCCResponse;
import com.safecharge.retail.response.SafechargeResponse;
import com.safecharge.retail.response.SessionTokenResponse;
import com.safecharge.retail.response.UpdateOrderResponse;

/**
 * Copyright (C) 2007-2017 SafeCharge International Group Limited.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @since 2/15/2017
 */
public interface Constants {

    // TODO - rethink if this should be inside the interface !!!
    Map<Class<? extends SafechargeRequest>, Class<? extends SafechargeResponse>> RESPONSE_TYPE_BY_REQUEST_TYPE =
            new HashMap<Class<? extends SafechargeRequest>, Class<? extends SafechargeResponse>>() {
                private static final long serialVersionUID = -5429154998138428047L;

                {
                    put(GetSessionTokenRequest.class, SessionTokenResponse.class);
                    put(OpenOrderRequest.class, OpenOrderResponse.class);
                    put(UpdateOrderRequest.class, UpdateOrderResponse.class);
                    put(GetOrderDetailsRequest.class, OrderDetailsResponse.class);
                    put(PaymentCCRequest.class, PaymentCCResponse.class);
                    put(PaymentAPMRequest.class, PaymentAPMResponse.class);
                    put(Authorization3DRequest.class, Authorization3DResponse.class);
                    put(CardTokenizationRequest.class, CardTokenizationResponse.class);
                }
            };

    Map<Class<? extends SafechargeRequest>, String> REQUEST_URL_BY_REQUEST_TYPE = new HashMap<Class<? extends SafechargeRequest>, String>() {
        private static final long serialVersionUID = -6533247180543051173L;

        {
            put(GetSessionTokenRequest.class, APIConstants.GET_SESSION_TOKEN_URL);
            put(OpenOrderRequest.class, APIConstants.OPEN_ORDER_URL);
            put(UpdateOrderRequest.class, APIConstants.UPDATE_ORDER_URL);
            put(GetOrderDetailsRequest.class, APIConstants.GET_ORDER_DETAILS_URL);
            put(PaymentCCRequest.class, APIConstants.PAYMENT_CC_URL);
            put(PaymentAPMRequest.class, APIConstants.PAYMENT_APM_URL);
            put(Authorization3DRequest.class, APIConstants.AUTHORIZATION_3D_URL);
            put(CardTokenizationRequest.class, APIConstants.CARD_TOKENIZATION_URL);
        }
    };

    /**
     * Response statuses Approved, Declined and Error are used by PhoneBet API and should not be changed, because they are in production use.
     */
    enum APIResponseStatus {

        SUCCESS("SUCCESS"), ERROR("ERROR"), Approved("Approved"), Declined("Declined"), Error("Error");

        private final String name;

        APIResponseStatus(final String name) {
            this.name = name;
        }

        @Override public String toString() {
            return name;
        }

        /**
         * WARNING! Case insensitive!
         */
        public static APIResponseStatus getStatus(String status) {
            status = status.toUpperCase();

            if ("SUCCESS".equals(status)) {
                return SUCCESS;
            } else if ("ERROR".equals(status)) {
                return ERROR;
            } else if ("APPROVED".equals(status)) {
                return Approved;
            } else if ("DECLINED".equals(status)) {
                return Declined;
            } else {
                throw new IllegalArgumentException("Unknown status \"" + status + "\".");
            }
        }
    }

    enum HashAlgorithm {
        MD5("MD5"), SHA256("SHA-256"), SHA1("SHA-1");

        private final String algorithm;

        HashAlgorithm(String algorithm) {
            this.algorithm = algorithm;
        }

        public String getAlgorithm() {
            return this.algorithm;
        }
    }

    enum TransactionType {
        Sale, Auth, Auth3D, Credit, Void, Sale3D, Settle, Refund, RiskOnly
    }

    enum OrderType {
        OPEN_ORDER, UPDATE_ORDER, AUTH_3D, PAYMENT_CC, PAYMENT_APM
    }

    enum APIType {
        PAYMENT, WITHDRAW
    }

    enum ErrorType {
        NO_ERROR, GENERIC_ERROR, INVALID_CHECKSUM, GENERAL_VALIDATION, COMMUNICATION_ERROR, ERR_CODE_INVALID_MERCHANT_SITE_ID, ERR_CODE_INVALID_ORDER_ID, ERR_CODE_INVALID_ORDER_STATE, ERR_CODE_INVALID_AMOUNT, ERR_CODE_INVALID_CURRENCY, ERR_CODE_INVALID_TRX_TYPE, ERR_CODE_USED_SESSION_TOKEN, SESSION_EXPIRED, INVALID_TOKEN, INVALID_REQUEST, ERR_CODE_INVALID_USER_TOKEN, ERR_CODE_INVALID_CARD_DATA, ERR_CODE_MISSING_PAYMENT_DATA, ERR_CODE_AMBIGUOUS_PAYMENT_DATA, ERR_CODE_INVALID_UPO_DATA, ERR_CODE_USER_MANAGEMENT_OFF, ERR_CODE_INVALID_CARD_ISSUER, ERR_CODE_INVALID_CARD_TOKEN
    }

    int ERR_CODE_NO_ERROR = 0;
    int ERR_CODE_GENERAL_SYSTEM_ERROR = 1000;
    int ERR_CODE_INVALID_CHECKSUM = 1001;
    int ERR_CODE_MERCHANT_NOT_EXIST = 1002;
    int ERR_CODE_MERCHANT_SITE_NOT_EXIST = 1003;
    int ERR_CODE_INVALID_CARD_NUMBER = 1004;
    int ERR_CODE_INVALID_EXP_MONTH = 1005;
    int ERR_CODE_INVALID_EXP_YEAR = 1006;
    int ERR_CODE_INVALID_NAME_ON_CARD = 1007;
    int ERR_CODE_EXPIRED_CARD = 1008;
    int ERR_CODE_UPO_STATUS_SUSPENDED = 1009;
    int ERR_CODE_INVALID_USER_TOKEN = 1010;
    int ERR_CODE_INVALID_USER_PAYMENT_OPTION_ID = 1011;
    int ERR_CODE_INVALID_CLIENT_REQUEST_ID = 1012;
    int ERR_CODE_INVALID_MERCHANT_ID = 1013;
    int ERR_CODE_INVALID_COUNTRY_CODE = 1014;
    int ERR_CODE_INVALID_LOCALE_CODE = 1015;
    int ERR_CODE_INVALID_PHONE_NUMBER = 1016;
    int ERR_CODE_INVALID_MERCHANT_MERCHANTSITE = 1017;
    int ERR_CODE_INVALID_CC_CARD_BIN = 1018;
    int ERR_CODE_GENERAL_VALIDATION = 1019;
    int ERR_CODE_INVALID_PAYMENT_METHOD = 1020;
    int ERR_CODE_INVALID_TIMESTAMP = 1021;
    int ERR_CODE_INVALID_MERCHANT_SITE_ID = 1022;
    int ERR_CODE_INVALID_UPO_STATUS = 1023;
    int ERR_CODE_UPO_LIMIT_EXCEEDED = 1024;
    int ERR_CODE_INVALID_CC_CARD_LAST_4_DIGITS = 1025;
    int ERR_CODE_INVALID_UNIQUE_CC = 1026;
    int ERR_CODE_INVALID_CC_ISSUER_NAME = 1027;
    int ERR_CODE_INVALID_CC_ISSUER = 1028;
    int ERR_CODE_INVALID_CC_EXP_DATE = 1029;
    int ERR_CODE_ERROR_SUSPENDING_UPO = 1030;
    int ERR_CODE_ERROR_ENABLING_UPO = 1031;
    int ERR_CODE_INVALID_START_IDX = 1032;
    int ERR_CODE_INVALID_END_IDX = 1033;
    int ERR_CODE_INVALID_CONFIGURATION = 1034;
    int ERR_CODE_NOT_FINALIZED_WD_ORDERS_EXIST = 1035;
    int ERR_CODE_OUTSTANDING_NET_DPOSIT_EXIST = 1036;
    int ERR_CODE_WD_ORDERS_AND_NET_DPOSIT_EXIST = 1037;
    int ERR_CODE_COMMUNICATION_ERROR = 1038;
    int ERR_CODE_INVALID_SBSCR_ID = 1039;
    int ERR_CODE_INVALID_AMOUNT = 1040;
    int ERR_CODE_INVALID_CURRENCY = 1041;
    int ERR_CODE_INVALID_RBL_PAYMENT_TYPE = 1042;
    int ERR_CODE_INVALID_RBL_TRX_SEQUENCE = 1043;
    int ERR_CODE_INVALID_SBSCR_STATUS = 1044;
    int ERR_CODE_INVALID_ACTIVE_TRX_ID = 1045;
    int ERR_CODE_ERROR_RISK_ONLY_CREATING_UPO = 1046;

    String CHARSET_UTF8 = "UTF-8";

    char[] HEXADECIMAL = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

}