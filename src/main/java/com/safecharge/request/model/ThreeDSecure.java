package com.safecharge.request.model;

import javax.validation.constraints.Size;

public class ThreeDSecure {

    @Size(max = 5)
    private String version;

    @Size(max = 2)
    private String challengePreference;

    @Size(max = 256)
    private String notificationURL;

    @Size(max = 2048)
    private String merchantURL;

    @Size(max = 2)
    private String platformType;

    @Size(max = 2)
    private String appSdkInterface;

    @Size(max = 2)
    private String appsSdkUIType;

    @Size(max = 254)
    private String deliveryEmail;

    @Size(max = 2)
    private String deliveryTimeFrame;

    @Size(max = 15)
    private String giftCardAmount;

    @Size(max = 2)
    private String giftCardCount;

    @Size(max = 3)
    private String giftCardCurrency;

    @Size(max = 8)
    private String preOrderDate;

    @Size(max = 2)
    private String preOrderPurchaseInd;

    @Size(max = 2)
    private String reorderItemsInd;

    @Size(max = 2)
    private String shipIndicator;

    @Size(max = 8)
    private String rebillExpiry;

    @Size(max = 4)
    private String rebillFrequency;

    @Size(max = 2)
    private String challengeWindowSize;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getChallengePreference() {
        return challengePreference;
    }

    public void setChallengePreference(String challengePreference) {
        this.challengePreference = challengePreference;
    }

    public String getNotificationURL() {
        return notificationURL;
    }

    public void setNotificationURL(String notificationURL) {
        this.notificationURL = notificationURL;
    }

    public String getMerchantURL() {
        return merchantURL;
    }

    public void setMerchantURL(String merchantURL) {
        this.merchantURL = merchantURL;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getAppSdkInterface() {
        return appSdkInterface;
    }

    public void setAppSdkInterface(String appSdkInterface) {
        this.appSdkInterface = appSdkInterface;
    }

    public String getAppsSdkUIType() {
        return appsSdkUIType;
    }

    public void setAppsSdkUIType(String appsSdkUIType) {
        this.appsSdkUIType = appsSdkUIType;
    }

    public String getDeliveryEmail() {
        return deliveryEmail;
    }

    public void setDeliveryEmail(String deliveryEmail) {
        this.deliveryEmail = deliveryEmail;
    }

    public String getDeliveryTimeFrame() {
        return deliveryTimeFrame;
    }

    public void setDeliveryTimeFrame(String deliveryTimeFrame) {
        this.deliveryTimeFrame = deliveryTimeFrame;
    }

    public String getGiftCardAmount() {
        return giftCardAmount;
    }

    public void setGiftCardAmount(String giftCardAmount) {
        this.giftCardAmount = giftCardAmount;
    }

    public String getGiftCardCount() {
        return giftCardCount;
    }

    public void setGiftCardCount(String giftCardCount) {
        this.giftCardCount = giftCardCount;
    }

    public String getGiftCardCurrency() {
        return giftCardCurrency;
    }

    public void setGiftCardCurrency(String giftCardCurrency) {
        this.giftCardCurrency = giftCardCurrency;
    }

    public String getPreOrderDate() {
        return preOrderDate;
    }

    public void setPreOrderDate(String preOrderDate) {
        this.preOrderDate = preOrderDate;
    }

    public String getPreOrderPurchaseInd() {
        return preOrderPurchaseInd;
    }

    public void setPreOrderPurchaseInd(String preOrderPurchaseInd) {
        this.preOrderPurchaseInd = preOrderPurchaseInd;
    }

    public String getReorderItemsInd() {
        return reorderItemsInd;
    }

    public void setReorderItemsInd(String reorderItemsInd) {
        this.reorderItemsInd = reorderItemsInd;
    }

    public String getShipIndicator() {
        return shipIndicator;
    }

    public void setShipIndicator(String shipIndicator) {
        this.shipIndicator = shipIndicator;
    }

    public String getRebillExpiry() {
        return rebillExpiry;
    }

    public void setRebillExpiry(String rebillExpiry) {
        this.rebillExpiry = rebillExpiry;
    }

    public String getRebillFrequency() {
        return rebillFrequency;
    }

    public void setRebillFrequency(String rebillFrequency) {
        this.rebillFrequency = rebillFrequency;
    }

    public String getChallengeWindowSize() {
        return challengeWindowSize;
    }

    public void setChallengeWindowSize(String challengeWindowSize) {
        this.challengeWindowSize = challengeWindowSize;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ThreeDSecure{");
        sb.append("version='").append(version).append('\'');
        sb.append(", challengePreference='").append(challengePreference).append('\'');
        sb.append(", notificationURL='").append(notificationURL).append('\'');
        sb.append(", merchantURL='").append(merchantURL).append('\'');
        sb.append(", platformType='").append(platformType).append('\'');
        sb.append(", appSdkInterface='").append(appSdkInterface).append('\'');
        sb.append(", appsSdkUIType='").append(appsSdkUIType).append('\'');
        sb.append(", deliveryEmail='").append(deliveryEmail).append('\'');
        sb.append(", deliveryTimeFrame='").append(deliveryTimeFrame).append('\'');
        sb.append(", giftCardAmount='").append(giftCardAmount).append('\'');
        sb.append(", giftCardCount='").append(giftCardCount).append('\'');
        sb.append(", giftCardCurrency='").append(giftCardCurrency).append('\'');
        sb.append(", preOrderDate='").append(preOrderDate).append('\'');
        sb.append(", preOrderPurchaseInd='").append(preOrderPurchaseInd).append('\'');
        sb.append(", reorderItemsInd='").append(reorderItemsInd).append('\'');
        sb.append(", shipIndicator='").append(shipIndicator).append('\'');
        sb.append(", rebillExpiry='").append(rebillExpiry).append('\'');
        sb.append(", rebillFrequency='").append(rebillFrequency).append('\'');
        sb.append(", challengeWindowSize='").append(challengeWindowSize).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
