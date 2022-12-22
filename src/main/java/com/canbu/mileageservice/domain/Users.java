package com.canbu.mileageservice.domain;

import com.canbu.mileageservice.global.domain.entity.BaseTimeEntity;
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
@NoArgsConstructor()
public class Users extends BaseTimeEntity {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    private String tel;

    @Builder
    public Users(UUID id, String name, String password, String tel) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.tel = tel;

    }

}
