package com.safecharge.request.model;



import com.safecharge.model.UserPaymentOption;
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

    private UserPaymentOption userPaymentOption;

    @Valid
    private SubMethod subMethod;

    private PaymentOption(Builder builder) {
        setCard(builder.card);
        setAlternativePaymentMethod(builder.alternativePaymentMethod);
        setUserPaymentOption(builder.userPaymentOption);
        setSubMethod(builder.subMethod);
    }

    public static PaymentOption.Builder builder() {
        return new Builder();
    }

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

    public UserPaymentOption getUserPaymentOption() {
        return userPaymentOption;
    }

    public void setUserPaymentOption(UserPaymentOption userPaymentOption) {
        this.userPaymentOption = userPaymentOption;
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
        sb.append(", userPaymentOptionId='").append(userPaymentOption).append('\'');
        sb.append(", subMethod=").append(subMethod);
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder {
        private Card card;
        private Map<String, String> alternativePaymentMethod;
        private UserPaymentOption userPaymentOption;
        private SubMethod subMethod;

        public Builder addCard(Card card) {
            this.card = card;
            return this;
        }

        public Card.Builder withCard() {
            return Card.builder().withParentBuilder(this);
        }

        public Builder addAlternativePaymentMethod(Map<String, String> alternativePaymentMethod) {
            this.alternativePaymentMethod = alternativePaymentMethod;
            return this;
        }

        public Builder addUserPaymentOptionId(String userPaymentOptionId) {
            UserPaymentOption userPaymentOption = new UserPaymentOption();
            userPaymentOption.setUserPaymentOptionId(userPaymentOptionId);
            this.userPaymentOption = userPaymentOption;
            return this;
        }

        public Builder addSubMethod(SubMethod subMethod) {
            this.subMethod = subMethod;
            return this;
        }

        public SubMethod.Builder withSubMethod() {
            return SubMethod.builder().withParentBuilder(this);
        }

        public PaymentOption build() {
            return new PaymentOption(this);
        }
    }
}
