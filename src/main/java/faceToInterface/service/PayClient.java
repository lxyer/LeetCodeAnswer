package faceToInterface.service;

/**
 * date 2022/2/5 8:08 PM
 */
public class PayClient {
    public static void main(String[] args) {
        Pay pay = PayFactory.getPay(PayType.JD);
        pay.toPay(2);
        UnionAdater unionAdater = new UnionAdater();
        unionAdater.getOrder(3);
    }
}
