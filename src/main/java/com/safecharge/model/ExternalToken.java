package com.safecharge.model;

/**
 * Copyright (C) 2007-2017 SafeCharge International Group Limited.
 * <p>
 * Holder for Cashier's Payment Gateway external token data.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @since 5/21/2019
 */
public class ExternalToken {

    private String blockedCard;
    private String cardAcquirerId;
    private String cardAcquirerName;
    private String cardBin;
    private String cardBrandId;
    private String cardBrandName;
    private String cardExpiration;
    private String cardLength;
    private String cardMask;
    private String cardName;
    private String cardTypeId;
    private String cardTypeName;
    private String clubName;
    private String creditCompanyId;
    private String creditCompanyName;
    private String extendedCardType;
    private String Indication;
    private String tokenValue;
    private String tokenProvider;

    public String getBlockedCard() {
        return blockedCard;
    }

    public void setBlockedCard(String blockedCard) {
        this.blockedCard = blockedCard;
    }

    public String getCardAcquirerId() {
        return cardAcquirerId;
    }

    public void setCardAcquirerId(String cardAcquirerId) {
        this.cardAcquirerId = cardAcquirerId;
    }

    public String getCardAcquirerName() {
        return cardAcquirerName;
    }

    public void setCardAcquirerName(String cardAcquirerName) {
        this.cardAcquirerName = cardAcquirerName;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getCardBrandId() {
        return cardBrandId;
    }

    public void setCardBrandId(String cardBrandId) {
        this.cardBrandId = cardBrandId;
    }

    public String getCardBrandName() {
        return cardBrandName;
    }

    public void setCardBrandName(String cardBrandName) {
        this.cardBrandName = cardBrandName;
    }

    public String getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public String getCardLength() {
        return cardLength;
    }

    public void setCardLength(String cardLength) {
        this.cardLength = cardLength;
    }

    public String getCardMask() {
        return cardMask;
    }

    public void setCardMask(String cardMask) {
        this.cardMask = cardMask;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(String cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getCreditCompanyId() {
        return creditCompanyId;
    }

    public void setCreditCompanyId(String creditCompanyId) {
        this.creditCompanyId = creditCompanyId;
    }

    public String getCreditCompanyName() {
        return creditCompanyName;
    }

    public void setCreditCompanyName(String creditCompanyName) {
        this.creditCompanyName = creditCompanyName;
    }

    public String getExtendedCardType() {
        return extendedCardType;
    }

    public void setExtendedCardType(String extendedCardType) {
        this.extendedCardType = extendedCardType;
    }

    public String getIndication() {
        return Indication;
    }

    public void setIndication(String indication) {
        Indication = indication;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public String getTokenProvider() {
        return tokenProvider;
    }

    public void setTokenProvider(String tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExternalToken{");
        sb.append("blockedCard='").append(blockedCard).append('\'');
        sb.append(", cardAcquirerId='").append(cardAcquirerId).append('\'');
        sb.append(", cardAcquirerName='").append(cardAcquirerName).append('\'');
        sb.append(", cardBin='").append(cardBin).append('\'');
        sb.append(", cardBrandId='").append(cardBrandId).append('\'');
        sb.append(", cardBrandName='").append(cardBrandName).append('\'');
        sb.append(", cardExpiration='").append(cardExpiration).append('\'');
        sb.append(", cardLength='").append(cardLength).append('\'');
        sb.append(", cardMask='").append(cardMask).append('\'');
        sb.append(", cardName='").append(cardName).append('\'');
        sb.append(", cardTypeId='").append(cardTypeId).append('\'');
        sb.append(", cardTypeName='").append(cardTypeName).append('\'');
        sb.append(", clubName='").append(clubName).append('\'');
        sb.append(", creditCompanyId='").append(creditCompanyId).append('\'');
        sb.append(", creditCompanyName='").append(creditCompanyName).append('\'');
        sb.append(", extendedCardType='").append(extendedCardType).append('\'');
        sb.append(", Indication='").append(Indication).append('\'');
        sb.append(", tokenValue='").append(tokenValue).append('\'');
        sb.append(", tokenProvider='").append(tokenProvider).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
