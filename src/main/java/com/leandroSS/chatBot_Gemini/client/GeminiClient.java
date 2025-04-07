package com.leandroSS.chatBot_Gemini.client;

import com.leandroSS.chatBot_Gemini.dto.requestDto.UserRequest;
import com.leandroSS.chatBot_Gemini.dto.responseDto.GeminiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "geminiAPI",
        url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent"
)
public interface GeminiClient {

    @PostMapping("?key=AIzaSyA0UJWvpiGHP-ImTv-MmFgKDoG1a25dcFg")
    GeminiResponse chatIA(@RequestBody UserRequest userRequest);

}













