package com.leandroSS.chatBot_Gemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ChatBotGeminiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatBotGeminiApplication.class, args);
	}

}
