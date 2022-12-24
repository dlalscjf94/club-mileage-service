package com.canbu.mileageservice.dao;

import lombok.RequiredArgsConstructor;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static com.canbu.mileageservice.domain.QPoint.point;

@Repository
@RequiredArgsConstructor
public class UserPointRepositoryImpl implements UserPointRepository {

    private final JPAQueryFactory query;

    @Override
    public Long getAllUserPoints(UUID userId) {
        return query
                .select(point.amount.sum().coalesce(0L))
                .from(point)
                .where(point.user_id.eq(userId))
                .fetchOne();
    }
}
