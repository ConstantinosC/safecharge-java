package com.safecharge.request.model;


import javax.validation.Valid;
import java.util.Map;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 * Holder for a Payment option(PM) data.
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 5/21/2019
 */
public class PaymentOption {

    @Valid
    private Card card;

    private Map<String, String> alternativePaymentMethod;

    private String userPaymentOptionId;

    @Valid
    private SubMethod subMethod;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Map<String, String> getAlternativePaymentMethod() {
        return alternativePaymentMethod;
    }

    public void setAlternativePaymentMethod(Map<String, String> alternativePaymentMethod) {
        this.alternativePaymentMethod = alternativePaymentMethod;
    }

    public String getUserPaymentOptionId() {
        return userPaymentOptionId;
    }

    public void setUserPaymentOptionId(String userPaymentOptionId) {
        this.userPaymentOptionId = userPaymentOptionId;
    }


    public SubMethod getSubMethod() {
        return subMethod;
    }

    public void setSubMethod(SubMethod subMethod) {
        this.subMethod = subMethod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentOption{");
        sb.append("card=").append(card);
        sb.append(", alternativePaymentMethod=").append(alternativePaymentMethod);
        sb.append(", userPaymentOptionId='").append(userPaymentOptionId).append('\'');
        sb.append(", subMethod=").append(subMethod);
        sb.append('}');
        return sb.toString();
    }
}
