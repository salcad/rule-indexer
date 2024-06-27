package main

import (
    "rule-indexer-go/src/main/processors"
    "rule-indexer-go/src/main/rules"
)

func main() {
    ruleRegistry := rules.NewIndexingRuleRegistry()

    ruleRegistry.RegisterRule(rules.NewCapitalizedWordsRule())
    ruleRegistry.RegisterRule(rules.NewLongWordsRule())

    fileProcessor := processors.NewFileProcessor(ruleRegistry.GetRules())
    exampleFilePaths := []string{"./samples/file1.txt", "./samples/file2.html"}
    fileProcessor.ProcessFiles(exampleFilePaths)
}
