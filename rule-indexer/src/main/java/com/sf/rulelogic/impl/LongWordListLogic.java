package com.sf.rulelogic.impl;

import com.sf.rulelogic.RuleLogic;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;
import java.util.regex.MatchResult;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class LongWordListLogic implements RuleLogic<List<String>> {
    @Override
    public List<String> apply(String content) {
        Pattern pattern = Pattern.compile("\\b\\w{6,}\\b");
        return pattern.matcher(content).results()
                .map(MatchResult::group)
                .collect(Collectors.toList());
    }
}
