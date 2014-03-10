package com.brandwatch.interviews.topic;

import com.brandwatch.interviews.topic.extractors.TopicExtractor;
import com.brandwatch.interviews.topic.extractors.TopicResults;
import com.brandwatch.interviews.topic.printers.TopicResultsPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class DemoImpl implements Demo {

    @Autowired
    private TextProvider provider;
    @Autowired
    private TopicExtractor extractor;
    @Autowired
    private TopicResultsPrinter printer;

    @Override
    public void runDemo(TopicDemoConfig config) {
        try {
            String inputText = provider.readText(config.file);
            TopicResults results = extractor.extract(inputText);
            printer.print(results);
        } catch (IOException e) {
            System.err.println("Failed");
        }
    }
}
