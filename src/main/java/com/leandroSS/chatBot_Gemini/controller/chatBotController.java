package com.leandroSS.chatBot_Gemini.controller;

import com.leandroSS.chatBot_Gemini.dto.requestDto.TextDTO;
import com.leandroSS.chatBot_Gemini.service.ChatBatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chatbot")
public class chatBotController {

    @Autowired
    private ChatBatService chatBatService;

    @PostMapping("/")
    public ResponseEntity<String> chatBotIA(@RequestBody TextDTO userRequest) {
        var response = chatBatService.RequestIA(userRequest);
        return ResponseEntity.ok(response);
    }

}

















