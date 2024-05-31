package com.github.expo94718.object;

import com.github.expo94718.enums.PayMethod;
import com.github.expo94718.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 결제 정보를 담고 있는 객체입니다. 결제 한 건의 결제 상태, 결제 취소 기록, 매출 전표, 현금영수증 정보 등을 자세히 알 수 있습니다.
 */
@Getter
@AllArgsConstructor
public class Payment {
    private final String paymentKey;
    private final PaymentType paymentType;
    private final String orderId;
    private final String orderName;
    private final String mId;
    private final String currency;
    private final PayMethod method;
    private final double totalAmount;
    private final double balanceAmount;
    private final Status status;

    public enum Status {
        READY, IN_PROGRESS, WAITING_FOR_DEPOSIT, DONE, CANCELED, PARTIAL_CANCELED, ABORTED, EXPIRED
    }
}
