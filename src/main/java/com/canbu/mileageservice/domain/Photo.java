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
public class Photo extends BaseTimeEntity{


    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @NotNull
    @Column(columnDefinition = "BINARY(16)")
    private UUID review_id;

    @NotNull
    private String filename;

    @Builder
    public Photo(UUID id, UUID review_id, String filename) {
        this.id = id;
        this.review_id = review_id;
        this.filename = filename;
    }
}
