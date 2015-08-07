package com.brandwatch.interviews.topic.printers;

import com.brandwatch.interviews.topic.extractors.Topic;
import com.brandwatch.interviews.topic.extractors.TopicResults;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import org.springframework.stereotype.Component;

@Component
public class SimplePrinter implements TopicResultsPrinter {

    public void print(TopicResults results) {
        ImmutableMultiset<Topic> resultBreakdown = results.getTopics();
        for (Topic topic : Iterables.limit(Multisets.copyHighestCountFirst(resultBreakdown).elementSet(), 10)) {
            System.out.println(topic.getLabel() + " " + resultBreakdown.count(topic));
        }
    }
}
