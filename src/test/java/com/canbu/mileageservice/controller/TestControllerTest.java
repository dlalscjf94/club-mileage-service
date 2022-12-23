package com.canbu.mileageservice.controller;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(TestController.class)
@DisplayName("테스트 API")
class TestControllerTest {

    @Test
    @DisplayName("TestContoller - /test")
    void test() throws Exception {
        
    }
}
