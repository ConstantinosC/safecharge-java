package com.safecharge.model;

import com.safecharge.model.builder.NestedBuilder;
import com.safecharge.request.model.ThreeD;
import javax.validation.constraints.Size;

public class BrowserDetails {

    @Size(max = 2048)
    private String acceptHeader;

    @Size(max = 45)
    private String ip;

    private String javaEnabled;

    private String javaScriptEnabled;

    @Size(max = 8)
    private String language;

    @Size(max = 2)
    private String colorDepth;

    @Size(max = 6)
    private String screenHeight;

    @Size(max = 6)
    private String screenWidth;

    @Size(max = 5)
    private String timeZone;

    @Size(max = 2048)
    private String userAgent;

    private BrowserDetails(Builder builder) {
        setAcceptHeader(builder.acceptHeader);
        setIp(builder.ip);
        setJavaEnabled(builder.javaEnabled);
        setJavaScriptEnabled(builder.javaScriptEnabled);
        setLanguage(builder.language);
        setColorDepth(builder.colorDepth);
        setScreenHeight(builder.screenHeight);
        setScreenWidth(builder.screenWidth);
        setTimeZone(builder.timeZone);
        setUserAgent(builder.userAgent);
    }

    public static BrowserDetails.Builder builder() {
        return new Builder();
    }

    public String getAcceptHeader() {
        return acceptHeader;
    }

    public void setAcceptHeader(String acceptHeader) {
        this.acceptHeader = acceptHeader;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getJavaEnabled() {
        return javaEnabled;
    }

    public void setJavaEnabled(String javaEnabled) {
        this.javaEnabled = javaEnabled;
    }

    public String getJavaScriptEnabled() {
        return javaScriptEnabled;
    }

    public void setJavaScriptEnabled(String javaScriptEnabled) {
        this.javaScriptEnabled = javaScriptEnabled;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getColorDepth() {
        return colorDepth;
    }

    public void setColorDepth(String colorDepth) {
        this.colorDepth = colorDepth;
    }

    public String getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(String screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(String screenWidth) {
        this.screenWidth = screenWidth;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent)  {
        this.userAgent = userAgent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BrowserDetails{");
        sb.append("acceptHeader='").append(acceptHeader).append('\'');
        sb.append(", ip='").append(ip).append('\'');
        sb.append(", javaEnabled='").append(javaEnabled).append('\'');
        sb.append(", javaScriptEnabled='").append(javaScriptEnabled).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", colorDepth='").append(colorDepth).append('\'');
        sb.append(", screenHeight='").append(screenHeight).append('\'');
        sb.append(", screenWidth='").append(screenWidth).append('\'');
        sb.append(", timeZone='").append(timeZone).append('\'');
        sb.append(", userAgent='").append(userAgent).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder extends NestedBuilder<ThreeD.Builder, BrowserDetails> {
        private String acceptHeader;
        private String ip;
        private String javaEnabled;
        private String javaScriptEnabled;
        private String language;
        private String colorDepth;
        private String screenHeight;
        private String screenWidth;
        private String timeZone;
        private String userAgent;

        public Builder addAcceptHeader(String acceptHeader) {
            this.acceptHeader = acceptHeader;
            return this;
        }

        public Builder addIp(String ip) {
            this.ip = ip;
            return this;
        }

        public Builder addJavaEnabled(String javaEnabled) {
            this.javaEnabled = javaEnabled;
            return this;
        }

        public Builder addJavaScriptEnabled(String javaScriptEnabled) {
            this.javaScriptEnabled = javaScriptEnabled;
            return this;
        }

        public Builder addLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder addColorDepth(String colorDepth) {
            this.colorDepth = colorDepth;
            return this;
        }

        public Builder addScreenHeight(String screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }

        public Builder addScreenWidth(String screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }

        public Builder addTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder addUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public BrowserDetails build() {
            return new BrowserDetails(this);
        }
    }
}
