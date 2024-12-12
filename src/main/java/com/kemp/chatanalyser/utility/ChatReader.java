package com.kemp.chatanalyser.utility;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.*;

@Component
public class ChatReader{

    private final Resource resource;

    public ChatReader() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        resource = ctx.getResource("classpath:static/chat.txt");
    }

    public Optional<List<String>> readResource() {
        List<String> list = new ArrayList<String>();
        try {
            InputStream is = this.resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
            return Optional.of(list);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
