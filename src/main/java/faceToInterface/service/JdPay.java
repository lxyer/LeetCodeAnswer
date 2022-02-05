package faceToInterface.service;

/**
 * date 2022/1/29 5:56 PM
 */
public interface JdPay extends Pay {
    /**
     * pay to JD
     *
     * @param money
     */
    void payToJd(Integer money);
}
