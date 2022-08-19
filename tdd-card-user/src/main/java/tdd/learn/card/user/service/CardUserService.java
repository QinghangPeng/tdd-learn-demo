package tdd.learn.card.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tdd.learn.card.user.controller.request.CardVerificationRequest;
import tdd.learn.card.user.controller.response.CardVerificationResponse;
import tdd.learn.card.user.model.CardDetails;
import tdd.learn.card.user.repository.CardDetailsRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardUserService {

    private final CardDetailsRepository cardDetailsRepository;

    public CardVerificationResponse cardVerify(CardVerificationRequest request) {
        Optional<CardDetails> OptionalDetails = cardDetailsRepository.findOneByCardNumberAndPin(request.getCardNo(), request.getPin());
        if (OptionalDetails.isEmpty()) {
            return CardVerificationResponse.builder()
                    .code("01")
                    .message("invalid")
                    .build();
        }
        return CardVerificationResponse.builder()
                .code("00")
                .message("success")
                .build();
    }
}
