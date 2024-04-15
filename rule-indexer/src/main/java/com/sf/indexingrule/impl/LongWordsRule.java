package com.sf.indexingrule.impl;

import com.sf.indexingrule.IndexingRule;
import com.sf.rulelogic.RuleLogic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LongWordsRule implements IndexingRule {
    private final RuleLogic<List<String>> ruleLogic;

    @Autowired
    public LongWordsRule(RuleLogic<List<String>> ruleLogic) {
        this.ruleLogic = ruleLogic;
    }

    @Override
    public void applyRule(String content) {
        List<String> longWords = ruleLogic.apply(content);
        printLongWords(longWords);
    }

    private void printLongWords(List<String> longWords) {
        System.out.println("Words longer than 5 characters:");
        longWords.forEach(System.out::println);
    }
}
