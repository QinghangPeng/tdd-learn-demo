package tdd.learn.card.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tdd.learn.card.user.model.CardDetails;
import tdd.learn.card.user.repository.entity.CardDetailsEntity;

import java.util.Optional;

public interface CardDetailsRepository extends JpaRepository<CardDetailsEntity, String> {
    Optional<CardDetails> findOneByCardNumberAndPin(String cardNumber, String pin);
}
