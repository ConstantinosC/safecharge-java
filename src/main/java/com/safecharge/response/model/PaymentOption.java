package com.safecharge.response.model;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 * Holder for a Payment option(PM) data.
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 4/7/2017
 */
public class PaymentOption {

    @Size(max = 45)
    private String userPaymentOptionId;
    private String redirectURL;
    @Valid
    private Card card;

    public String getUserPaymentOptionId() {
        return userPaymentOptionId;
    }

    public void setUserPaymentOptionId(String userPaymentOptionId) {
        this.userPaymentOptionId = userPaymentOptionId;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
