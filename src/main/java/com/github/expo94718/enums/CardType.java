package com.github.expo94718.enums;

import java.io.Serializable;
import java.util.Arrays;

public enum CardType implements Serializable {

    CREDIT("신용"),CHECK("체크"),GIFT("기프트");

    private final String koreanName;

    CardType(String name) {
        this.koreanName = name;
    }

    /**
     * 한글이름을 통해 해당하는 결제수단의 열거형을 찾습니다.
     * @param s 결제수단의 한글 이름
     * @return 한글 이름에 해당하는 결제수단의 열거형
     */
    public static CardType getByString(String s) {
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
