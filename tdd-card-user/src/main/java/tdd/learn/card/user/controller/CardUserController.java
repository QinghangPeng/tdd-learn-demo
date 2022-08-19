package tdd.learn.card.user.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tdd.learn.card.user.controller.request.CardVerificationRequest;
import tdd.learn.card.user.controller.response.CardVerificationResponse;
import tdd.learn.card.user.service.CardUserService;

import javax.validation.Valid;

@RestController
@RequestMapping("/card")
@RequiredArgsConstructor
public class CardUserController {

    private final CardUserService cardUserService;

    @PostMapping("/validate")
    public CardVerificationResponse cardVerify(@Valid @RequestBody CardVerificationRequest request) {
        return cardUserService.cardVerify(request);
    }
}
