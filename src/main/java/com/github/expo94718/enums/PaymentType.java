package com.github.expo94718.enums;

import java.io.Serializable;

/**
 * NORMAL - 일반결제<br>
 * BILLING - 자동결제<br>
 * BRANDPAY - <a href="https://docs.tosspayments.com/guides/brandpay/overview">브랜드페이</a> 결제<br>
 */
public enum PaymentType implements Serializable {
    NORMAL, BILLING, BRANDPAY
}
