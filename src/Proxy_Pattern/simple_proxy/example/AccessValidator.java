package Proxy_Pattern.simple_proxy.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * 身份验证类，业务类，它提供方法Validate()来实现身份验证
 */
public class AccessValidator {

    public static boolean validator(String userId) {
        return true;
    }
}
