package com.leandroSS.chatBot_Gemini.service;

import com.leandroSS.chatBot_Gemini.client.GeminiClient;
import com.leandroSS.chatBot_Gemini.dto.requestDto.PartsDTO;
import com.leandroSS.chatBot_Gemini.dto.requestDto.TextDTO;
import com.leandroSS.chatBot_Gemini.dto.requestDto.UserRequest;
import com.leandroSS.chatBot_Gemini.dto.responseDto.GeminiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatBatService {

    @Autowired
    private GeminiClient geminiClient;

    public String RequestIA(TextDTO userRequest) {

        var request = new UserRequest(
                new PartsDTO(
                        userRequest
                )
        );

        var response = geminiClient.chatIA(request);

        return response.candidates().getFirst().content().parts().getFirst().text();
    }
}
