package faceToInterface.service;

/**
 * 适配器模式
 * date 2022/2/5 8:36 PM
 */
public class UnionAdater extends UnionPay implements Pay {
    @Override
    public void toPay(Integer money) {
        super.getOrder(1);
    }
}
