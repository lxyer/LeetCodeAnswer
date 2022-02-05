package faceToInterface.service.impl;

import faceToInterface.service.AliPay;

/**
 * date 2022/2/5 7:52 PM
 */
public class AliPayImpl implements AliPay {
    @Override
    public void payToAli(Integer money) {
        System.out.println("ali pay!");
    }

    @Override
    public void toPay(Integer money) {
        System.out.println("ali pay " + money);
    }
}
