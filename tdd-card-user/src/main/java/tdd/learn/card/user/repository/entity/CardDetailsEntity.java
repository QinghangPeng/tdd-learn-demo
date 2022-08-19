package tdd.learn.card.user.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import tdd.learn.card.user.model.CardStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.EnumType.STRING;

@Getter
@Builder
@Entity
@Table(name = "card_details")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
public class CardDetailsEntity extends BaseEntity {

    @Id
    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "pin")
    private String pin;

    @Column(name = "status")
    @Enumerated(STRING)
    private CardStatus status;
}
