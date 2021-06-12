package io.mvvm.model;

import lombok.Data;

/**
 * @program: io-admin
 * @description: 验证码实体
 * @author: Mr. Pan
 * @create: 2021-06-12 22:55
 **/
@Data
public class CaptchaVO {

    private String key;
    private String image;

}
