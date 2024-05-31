package com.github.expo94718.enums;

import java.io.Serializable;
import java.util.Arrays;

/**
 * NORMAL - 임시적으로 발급되어 고객이 입금한 뒤에는 더 이상 사용할 수 없는 일반적인 가상계좌<br>
 * FIXED - 고객이 같은 계좌로 여러 번 입금할 수 있는 특수 가상계좌입니다.
 */
public enum AccountType implements Serializable {

    NORMAL("일반"),FIXED("고정");

    private final String koreanName;

    AccountType(String name) {
        this.koreanName = name;
    }

    /**
     * 한글이름을 통해 해당하는 결제수단의 열거형을 찾습니다.
     * @param s 결제수단의 한글 이름
     * @return 한글 이름에 해당하는 결제수단의 열거형
     */
    public static AccountType getByString(String s) {
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
