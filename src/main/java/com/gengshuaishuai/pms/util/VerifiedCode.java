package com.gengshuaishuai.pms.util;

import com.google.code.kaptcha.Producer;

import javax.annotation.Resource;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/3/21 18:21
 * @description
 */
public class VerifiedCode {
    @Resource(name = "captchaProducer")
    private Producer captchaProducer;

    @Resource(name = "captchaProducerMath")
    private Producer captchaProducerMath;
    private
}
