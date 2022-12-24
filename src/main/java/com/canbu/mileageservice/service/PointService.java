package com.canbu.mileageservice.service;


import com.canbu.mileageservice.dao.UserPointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PointService {

    private final UserPointRepository userPointRepository;

    public Long getUserPointsTotal(UUID userId) {
        return userPointRepository.getAllUserPoints(userId);
    }
}
