package com.canbu.mileageservice.domain;

import com.canbu.mileageservice.global.domain.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review extends BaseTimeEntity {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private String content;

    @NotNull
    @Column(columnDefinition = "BINARY(16)")
    private UUID user_id;

    @NotNull
    @Column(columnDefinition = "BINARY(16)")
    private UUID place_id;

    public Review(UUID id, String content, UUID user_id, UUID place_id) {
        this.id = id;
        this.content = content;
        this.user_id = user_id;
        this.place_id = place_id;
    }
}
