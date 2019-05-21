package com.safecharge.model;

/**
 * Copyright (C) 2007-2019 SafeCharge International Group Limited.
 * <p>
 *
 * @author <a constantinosco@safecharge.com>Constantinos Constantinides</a>
 * @since 5/21/2019
 */
public class ThreeD {

    private String threeDReason;
    private String threeDFlow;
    private String paRequest;
    private String acsUrl;
    private String eci;
    private String acsChallengeMandated;
    private String cReq;
    private String authenticationType;
    private String cardHolderInfoText;
    private String whiteListStatus;
    private String cavv;
    private String authenticationStatus;
    private String acsSignedContent;

    public String getThreeDReason() {
        return threeDReason;
    }

    public void setThreeDReason(String threeDReason) {
        this.threeDReason = threeDReason;
    }

    public String getThreeDFlow() {
        return threeDFlow;
    }

    public void setThreeDFlow(String threeDFlow) {
        this.threeDFlow = threeDFlow;
    }

    public String getPaRequest() {
        return paRequest;
    }

    public void setPaRequest(String paRequest) {
        this.paRequest = paRequest;
    }

    public String getAcsUrl() {
        return acsUrl;
    }

    public void setAcsUrl(String acsUrl) {
        this.acsUrl = acsUrl;
    }

    public String getEci() {
        return eci;
    }

    public void setEci(String eci) {
        this.eci = eci;
    }

    public String getAcsChallengeMandated() {
        return acsChallengeMandated;
    }

    public void setAcsChallengeMandated(String acsChallengeMandated) {
        this.acsChallengeMandated = acsChallengeMandated;
    }

    public String getcReq() {
        return cReq;
    }

    public void setcReq(String cReq) {
        this.cReq = cReq;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getCardHolderInfoText() {
        return cardHolderInfoText;
    }

    public void setCardHolderInfoText(String cardHolderInfoText) {
        this.cardHolderInfoText = cardHolderInfoText;
    }

    public String getWhiteListStatus() {
        return whiteListStatus;
    }

    public void setWhiteListStatus(String whiteListStatus) {
        this.whiteListStatus = whiteListStatus;
    }

    public String getCavv() {
        return cavv;
    }

    public void setCavv(String cavv) {
        this.cavv = cavv;
    }

    public String getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(String authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public String getAcsSignedContent() {
        return acsSignedContent;
    }

    public void setAcsSignedContent(String acsSignedContent) {
        this.acsSignedContent = acsSignedContent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ThreeD{");
        sb.append("threeDReason='").append(threeDReason).append('\'');
        sb.append(", threeDFlow='").append(threeDFlow).append('\'');
        sb.append(", paRequest='").append(paRequest).append('\'');
        sb.append(", acsUrl='").append(acsUrl).append('\'');
        sb.append(", eci='").append(eci).append('\'');
        sb.append(", acsChallengeMandated='").append(acsChallengeMandated).append('\'');
        sb.append(", cReq='").append(cReq).append('\'');
        sb.append(", authenticationType='").append(authenticationType).append('\'');
        sb.append(", cardHolderInfoText='").append(cardHolderInfoText).append('\'');
        sb.append(", whiteListStatus='").append(whiteListStatus).append('\'');
        sb.append(", cavv='").append(cavv).append('\'');
        sb.append(", authenticationStatus='").append(authenticationStatus).append('\'');
        sb.append(", acsSignedContent='").append(acsSignedContent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
