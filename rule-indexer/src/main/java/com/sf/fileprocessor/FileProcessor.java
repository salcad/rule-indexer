package com.sf.fileprocessor;

import com.sf.indexingrule.IndexingRule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileProcessor {
    private final List<IndexingRule> rules;

    @Autowired
    public FileProcessor(List<IndexingRule> rules) {
        this.rules = rules;
    }

    public void processFiles(String[] filePaths) {
        for (String path : filePaths) {
            try {
                String content = new String(Files.readAllBytes(Paths.get(path)));
                System.out.println("Processing " + path);
                for (IndexingRule rule : rules) {
                    rule.applyRule(content);
                }
            } catch (IOException e) {
                System.out.println("Failed to read " + path);
            }
        }
    }
}
