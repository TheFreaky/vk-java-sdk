// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

public class ApiCaptchaException extends ApiException {
    private String sid;
    private String image;

    public ApiCaptchaException(String message, String sid, String image) {
        super(14, "Captcha needed", message);
        this.sid = sid;
        this.image = image;
    }

    public String getSid() {
        return this.sid;
    }

    public String getImage() {
        return this.image;
    }
}
