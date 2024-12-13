package com.kemp.chatanalyser;

import com.kemp.chatanalyser.utility.ResourceReaderService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ChatanalyserApiApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();

		ResourceReaderService resourceReaderService = new ResourceReaderService();

		Optional<List<String>> allMessages = resourceReaderService.readResource(ctx.getResource("classpath:static/chat.txt"));
		 if (allMessages.isPresent()) {
			 List<String> messages = allMessages.get();
			 System.out.println(messages);
		 }
	}

}
