package com.safecharge.model;

import com.safecharge.util.APIConstants;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 5/21/2019
 */
public class Card {

    private ExternalToken externalToken;

    /**
     * A valid credit card number.
     */
    @Size(max = 20, message = "ccCardNumber size must be up to 20 characters long!")
    private String ccCardNumber;

    /**
     * The credit card’s bin number.
     */
    @Size(max = 6, message = "bin size must be up to 6 characters long!")
    private String bin;

    /**
     * The last four digits of the credit card number.
     */
    private String last4Digits;

    /**
     * Two digit value that is the expiration month.
     */
    @Pattern(regexp = APIConstants.EXP_MONTH_REGEX, message = "Expiration month must have a valid value")
    private String ccExpMonth;

    /**
     * Four digit value that is the expiration year. When the value provided is two digits,
     * the year is assumed to be 2000 + ccExpYear; ccExpMonth and ccExpYear must be a date that is after the current date.
     * The year may not exceed 10 years in to the future.
     */
    @Pattern(regexp = APIConstants.EXP_YEAR_REGEX, message = "Expiration year must be 2 or 4 digits")
    private String ccExpYear;

    /**
     * The acquirer Id that the merchant would like to process with.
     * If sent, then will override the gateway routing configuration/mechanism.
     */
    @Size(max = 2, message = "acquirerId size must be up to 2 characters long!")
    private String acquirerId;

    /**
     * "The CVV2 response.
     * Possible values:
     * M = CVV2 Match.
     * N = CVV2 No Match.
     * P = Not Processed.
     * U = Issuer is not certified and/or has not. provided Visa the encryption keys.
     * S = CVV2 processor is unavailable."
     */
    private String cvv2Reply;

    /**
     * "The AVS response.
     * Possible values:
     * A = The street address matches, the zip code does not.
     * W = Whole 9-digits zip code match, the street address does not.
     * Y = Both the 5-digits zip code and the street address match.
     * X = An exact match of both the 9-digits zip code and the street address.
     * Z = Only the 5-digits zip code match, the street code does not.
     * U = Issuer is unavailable.
     * S = Not Supported.
     * R = Retry.
     * B = Not authorized (declined).
     * N = Both street address and zip code do not match."
     */
    private String avsCode;

    private ThreeD threeD;

    @Size(max = 20)
    private String status;

    @Size(max = 20)
    private String transactionStatus;

    public ExternalToken getExternalToken() {
        return externalToken;
    }

    public void setExternalToken(ExternalToken externalToken) {
        this.externalToken = externalToken;
    }

    public String getCcCardNumber() {
        return ccCardNumber;
    }

    public void setCcCardNumber(String ccCardNumber) {
        this.ccCardNumber = ccCardNumber;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getLast4Digits() {
        return last4Digits;
    }

    public void setLast4Digits(String last4Digits) {
        this.last4Digits = last4Digits;
    }

    public String getCcExpMonth() {
        return ccExpMonth;
    }

    public void setCcExpMonth(String ccExpMonth) {
        this.ccExpMonth = ccExpMonth;
    }

    public String getCcExpYear() {
        return ccExpYear;
    }

    public void setCcExpYear(String ccExpYear) {
        this.ccExpYear = ccExpYear;
    }

    public String getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    public String getCvv2Reply() {
        return cvv2Reply;
    }

    public void setCvv2Reply(String cvv2Reply) {
        this.cvv2Reply = cvv2Reply;
    }

    public String getAvsCode() {
        return avsCode;
    }

    public void setAvsCode(String avsCode) {
        this.avsCode = avsCode;
    }

    public ThreeD getThreeD() {
        return threeD;
    }

    public void setThreeD(ThreeD threeD) {
        this.threeD = threeD;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
