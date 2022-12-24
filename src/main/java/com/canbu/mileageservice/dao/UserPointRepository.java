package com.canbu.mileageservice.dao;


import com.canbu.mileageservice.domain.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

import java.util.UUID;

public interface UserPointRepository {

    Long getAllUserPoints(UUID userId);
}
