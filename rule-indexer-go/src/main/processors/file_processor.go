package processors

import (
	"fmt"
	"os"
	"rule-indexer-go/src/main/rules"
)

type FileProcessor struct {
    rules []rules.IndexingRule
}

func NewFileProcessor(rules []rules.IndexingRule) *FileProcessor {
    return &FileProcessor{rules: rules}
}

func (fp *FileProcessor) ProcessFiles(filePaths []string) {
    for _, path := range filePaths {
        content, err := os.ReadFile(path)
        if err != nil {
            fmt.Printf("Failed to read %s: %v\n", path, err)
            continue
        }
        fmt.Printf("Processing %s\n", path)
        for _, rule := range fp.rules {
            rule.ApplyRule(string(content))
        }
    }
}

