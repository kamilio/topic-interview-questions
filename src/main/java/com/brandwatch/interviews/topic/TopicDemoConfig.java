package com.brandwatch.interviews.topic;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.converters.FileConverter;

import java.io.File;

public class TopicDemoConfig {
    @Parameter(names = "-input", converter = FileConverter.class)
    File file;
}
