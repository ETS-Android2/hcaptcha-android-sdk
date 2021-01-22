package com.hcaptcha.sdk.tasks;

import com.hcaptcha.sdk.HCaptchaException;


/**
 * A failure listener class
 */
public interface OnFailureListener {

    /**
     * Called whenever there is a hCaptcha error or user closed the challenge dialog
     *
     * @param hCaptchaException the exception
     */
    void onFailure(HCaptchaException hCaptchaException);

}
