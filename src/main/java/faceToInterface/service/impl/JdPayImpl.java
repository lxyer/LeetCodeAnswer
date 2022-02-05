package faceToInterface.service.impl;

import faceToInterface.service.JdPay;

/**
 * date 2022/1/29 5:59 PM
 */
public class JdPayImpl implements JdPay {
    @Override
    public void payToJd(Integer money) {
        System.out.println("JD pay!");
    }

    @Override
    public void toPay(Integer money) {
        System.out.println("jd pay " + money);
    }
}
