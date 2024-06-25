package rules

import (
    "fmt"
    "rule-indexer-go/logics"
)

type LongWordsRule struct {
    logic *logics.LongWordListLogic
}

func NewLongWordsRule() *LongWordsRule {
    return &LongWordsRule{
        logic: logics.NewLongWordListLogic(),
    }
}

func (l *LongWordsRule) ApplyRule(content string) {
    longWords := l.logic.Apply(content)
    fmt.Println("Words longer than 5 characters:")
    for _, word := range longWords {
        fmt.Println(word)
    }
}
