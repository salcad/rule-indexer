package rules

import (
    "fmt"
    "rule-indexer-go/src/main/logics"
)

type CapitalizedWordsRule struct {
    logic *logics.CapitalizedWordCountLogic
}

func NewCapitalizedWordsRule() *CapitalizedWordsRule {
    return &CapitalizedWordsRule{
        logic: logics.NewCapitalizedWordCountLogic(),
    }
}

func (c *CapitalizedWordsRule) ApplyRule(content string) {
    count := c.logic.Apply(content)
    fmt.Printf("Number of capitalized words: %d\n", count)
}
