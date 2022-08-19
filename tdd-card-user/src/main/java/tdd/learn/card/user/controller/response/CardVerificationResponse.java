package tdd.learn.card.user.controller.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CardVerificationResponse {
    private String code;
    private String message;
}
