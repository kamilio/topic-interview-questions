package com.brandwatch.interviews.topic;

import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class TextProvider {

    public String readText(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        return builder.toString();
    }

}
