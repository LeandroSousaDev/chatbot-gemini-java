package com.leandroSS.chatBot_Gemini.dto.responseDto;

import java.util.List;

public record GeminiResponse(List<ContentDTO> candidates) {
}
