package com.sf.rulelogic;

public interface RuleLogic<T> {
    T apply(String content);
}

