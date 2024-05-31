package com.github.expo94718.enums;

import java.io.Serializable;
import java.util.Arrays;

/**
 * INDIVIDUAL - 개인이 발급 받을 수 있는 개인 카드 및 가족카드<br>
 * CORPORATE - 기업, 기관, 협회 등 사업자에서 발급 받을 수 있는 카드<br>
 * UNKNOWN - 비여신 거래 또는 해외 카드 거래로 카드 소유자 정보를 알 수 없음
 */
public enum CardOwner implements Serializable {

    INDIVIDUAL("개인"),CORPORATE("법인"),UNKNOWN("미확인");

    private final String koreanName;

    CardOwner(String name) {
        this.koreanName = name;
    }

    /**
     * 한글이름을 통해 해당하는 결제수단의 열거형을 찾습니다.
     * @param s 결제수단의 한글 이름
     * @return 한글 이름에 해당하는 결제수단의 열거형
     */
    public static CardOwner getByString(String s) {
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
