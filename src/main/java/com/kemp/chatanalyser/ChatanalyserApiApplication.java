package com.kemp.chatanalyser;

import com.kemp.chatanalyser.utility.ChatReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ChatanalyserApiApplication {

	public static void main(String[] args) {


		ChatReader reader = new ChatReader();

		Optional<List<String>> allMessages = reader.readResource();
		 if (allMessages.isPresent()) {
			 List<String> messages = allMessages.get();
			 System.out.println(messages);
		 }
	}

}
