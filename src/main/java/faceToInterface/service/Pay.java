package faceToInterface.service;

/**
 * @author lixiangyang51@jd.com
 * date 2022/1/29 5:54 PM
 * Copyright © 2004-2022 JD.COM. All Rights Reserved.
 */
public interface Pay {
    /**
     * 付款
     *
     * @param money
     */
    default void toPay(Integer money) {
        System.out.println("pay default method!");
    }
}
