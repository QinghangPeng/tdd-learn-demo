package tdd.learn.card.user.controller.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CardVerificationRequest {
    private String cardNo;
    private String pin;
}
