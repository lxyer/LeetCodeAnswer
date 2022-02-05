package faceToInterface.service;

import faceToInterface.service.impl.AliPayImpl;
import faceToInterface.service.impl.JdPayImpl;

/**
 * date 2022/2/5 7:32 PM
 */
public class PayFactory {
    public static Pay getPay(PayType type) {
        Pay pay = null;
        switch (type) {
            case JD:
                pay = new JdPayImpl();
                break;
            case Ali:
                pay = new AliPayImpl();
                break;
            default:
                break;
        }
        return pay;
    }
}
