package com.github.expo94718.enums;

import java.io.Serializable;
import java.util.Arrays;

public enum EasyPay implements Serializable {

    TOSSPAY("토스페이"),NAVERPAY("네이버페이"),SAMSUNGPAY("삼성페이"),LPAY("엘페이"),KAKAOPAY("카카오페이"),PAYCO("페이코"),SSG("SSG페이"),APPLEPAY("애플페이"),PINPAY("핀페이");

    private final String koreanName;

    EasyPay(String name) {
        this.koreanName = name;
    }

    /**
     * 한글이름을 통해 해당하는 결제수단의 열거형을 찾습니다.
     * @param s 결제수단의 한글 이름
     * @return 한글 이름에 해당하는 결제수단의 열거형
     */
    public static EasyPay getByString(String s) {
        return Arrays.stream(values()).filter(payMethod -> payMethod.koreanName.equalsIgnoreCase(s)).findFirst().orElse(null);
    }

    /**
     * 결제수단의 한글 이름을 반환합니다.
     * @return 해당 결제수단의 한글 이름
     */
    public String getKoreanName() {
        return koreanName;
    }

}
