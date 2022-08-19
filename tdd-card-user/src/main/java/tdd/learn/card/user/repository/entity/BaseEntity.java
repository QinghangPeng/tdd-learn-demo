package tdd.learn.card.user.repository.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import java.time.Instant;

@Getter
@Setter
public class BaseEntity {

    @CreatedDate
    @Column(name = "created_time")
    private Instant createdTime;

    @LastModifiedDate
    @Column(name = "last_modified_time")
    private Instant lastModifiedDate;
}
