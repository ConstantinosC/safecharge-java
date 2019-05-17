package com.safecharge.model;

import javax.validation.Valid;
import java.util.Map;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 * Holder for a Payment option(PM) data.
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 4/7/2017
 */
public class PaymentOption {

    private CardData cardData;

    private Map<String, String> alternativePaymentMethod;

    private String userPaymentOption;

    private SubMethodDetails subMethod;


    public CardData getCardData() {
        return cardData;
    }

    public void setCardData(CardData cardData) {
        this.cardData = cardData;
    }

    public Map<String, String> getAlternativePaymentMethod() {
        return alternativePaymentMethod;
    }

    public void setAlternativePaymentMethod(Map<String, String> alternativePaymentMethod) {
        this.alternativePaymentMethod = alternativePaymentMethod;
    }

    public String getUserPaymentOption() {
         return userPaymentOption;
    }

    public void setUserPaymentOption(String userPaymentOption) {
        this.userPaymentOption = userPaymentOption;
    }

    public SubMethodDetails getSubMethod() {
        return subMethod;
    }

    public void setSubMethod(SubMethodDetails subMethod) {
        this.subMethod = subMethod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentOption{");
        sb.append("cardData=").append(cardData);
        sb.append(", alternativePaymentMethod=").append(alternativePaymentMethod);
        sb.append(", userPaymentOption='").append(userPaymentOption).append('\'');
        sb.append(", subMethod=").append(subMethod);
        sb.append('}');
        return sb.toString();
    }
}
