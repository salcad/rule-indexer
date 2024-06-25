package main

import (
    "rule-indexer-go/processors"
    "rule-indexer-go/rules"
)

func main() {
    ruleRegistry := rules.NewIndexingRuleRegistry()

    ruleRegistry.RegisterRule(rules.NewCapitalizedWordsRule())
    ruleRegistry.RegisterRule(rules.NewLongWordsRule())

    fileProcessor := processors.NewFileProcessor(ruleRegistry.GetRules())
    exampleFilePaths := []string{"./samples/file1.txt", "./samples/file2.html"}
    fileProcessor.ProcessFiles(exampleFilePaths)
}
