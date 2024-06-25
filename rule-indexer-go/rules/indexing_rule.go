package rules

type IndexingRule interface {
    ApplyRule(content string)
}