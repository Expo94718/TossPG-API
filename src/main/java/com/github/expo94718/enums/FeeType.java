package com.github.expo94718.enums;

import java.io.Serializable;

/**
 * BASE - 기본 수수료<br>
 * INSTALLMENT_DISCOUNT - 카드사 혹은 토스페이먼츠 부담 무이자 할부 수수료<br>
 * INSTALLMENT - 가맹점 부담 무이자 할부 수수료<br>
 * POINT_SAVING - 카드사 포인트 적립 수수료<br>
 * ETC - 기타 수수료
 */

public enum FeeType implements Serializable {
    BASE,INSTALLMENT_DISCOUNT,POINT_SAVING,ETC;
}
