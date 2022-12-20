package com.canbu.mileageservice.global.domain.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;

import java.time.LocalDateTime;


/* 공통으로 사용될 regdate, moddate를 위한 BaseTimeEntity 생성 */
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
@Getter
public class BaseTimeEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

}
