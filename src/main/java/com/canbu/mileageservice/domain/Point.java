package com.canbu.mileageservice.domain;

import com.canbu.mileageservice.global.domain.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Point extends BaseTimeEntity {

    @Id
    // auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(columnDefinition = "BINARY(16)")
    private UUID user_id;

    @NotNull
    @Column(columnDefinition = "BINARY(16)")
    private UUID review_id;

    // 포인트 증감량 +1 -1 ...
    @NotNull
    private Long amount;

    @Builder
    public Point(Long id, UUID user_id, UUID review_id, Long amount) {
        this.id = id;
        this.user_id = user_id;
        this.review_id = review_id;
        this.amount = amount;

    }


}
