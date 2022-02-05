package faceToInterface.service;

/**
 * date 2022/1/29 5:58 PM
 */
public interface AliPay extends Pay {
    /**
     * pay to ali
     *
     * @param money
     */
    void payToAli(Integer money);

}
