package com.sf.ruleindexer;

import com.sf.fileprocessor.FileProcessor;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sf", "com.sf.fileprocessor"})
public class RuleIndexerApplication implements CommandLineRunner {

    private final FileProcessor processor;

    @Autowired
    public RuleIndexerApplication(FileProcessor processor) {
        this.processor = processor;
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RuleIndexerApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) {
        processor.processFiles(args);
    }
}

