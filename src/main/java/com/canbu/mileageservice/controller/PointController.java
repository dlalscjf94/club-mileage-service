package com.canbu.mileageservice.controller;

import com.canbu.mileageservice.dto.response.UserPointTotalResponseDto;
import com.canbu.mileageservice.service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/points")
@RequiredArgsConstructor
public class PointController {

    private final PointService pointService;

    /*
    * events
     */


    /*
    * points  점수 sum 가져오기
     */
    @GetMapping
    public ResponseEntity<UserPointTotalResponseDto> getPointTotal(
            @RequestParam("user-id") String userId) {
        UUID uuidUserId = UUID.fromString(userId);
        Long pointsTotal = pointService.getUserPointsTotal(uuidUserId);

        UserPointTotalResponseDto response = UserPointTotalResponseDto.builder()
                .userId(uuidUserId)
                .points(pointsTotal)
                .build();

        return ResponseEntity.ok(response);
    }

    /*
    * point-histories
    * */
}

