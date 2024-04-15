package com.sf.rulelogic.impl;

import com.sf.rulelogic.RuleLogic;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

@Component
public class CapitalizedWordCountLogic implements RuleLogic<Integer> {
    @Override
    public Integer apply(String content) {
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(pattern.matcher(content).results().iterator(),
                        Spliterator.ORDERED), false)
                .mapToInt(matchResult -> 1)
                .sum();
    }
}

