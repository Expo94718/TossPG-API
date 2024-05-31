package com.github.expo94718.enums;

import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

public enum PayMethod implements Serializable {
    CARD("카드"),EASY_PAY("간편결제"),VIRTUAL_ACCOUNT("가상계좌"),MOBILE_PHONE("휴대폰"),
    TRANSFER("계좌이체"),CULTURE_GIFT_CERTIFICATE("문화상품권"),BOOK_GIFT_CERTIFICATE("도서문화상품권"),
    GAME_GIFT_CERTIFICATE("게임문화상품권");

    private final String koreanName;

    PayMethod(String name) {
        this.koreanName = name;
    }

    /**
     * 한글이름을 통해 해당하는 결제수단의 열거형을 찾습니다.
     * @param s 결제수단의 한글 이름
     * @return 한글 이름에 해당하는 결제수단의 열거형
     */
    public static PayMethod getByString(String s) {
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
