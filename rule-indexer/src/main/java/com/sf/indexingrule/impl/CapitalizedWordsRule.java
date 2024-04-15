package com.sf.indexingrule.impl;

import com.sf.indexingrule.IndexingRule;
import com.sf.rulelogic.RuleLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CapitalizedWordsRule implements IndexingRule {
    private final RuleLogic<Integer> ruleLogic;

    @Autowired
    public CapitalizedWordsRule(RuleLogic<Integer> ruleLogic) {
        this.ruleLogic = ruleLogic;
    }

    @Override
    public void applyRule(String content) {
        int count = ruleLogic.apply(content);
        printResult(count);
    }

    private void printResult(int count) {
        System.out.println("Number of capitalized words: " + count);
    }
}


