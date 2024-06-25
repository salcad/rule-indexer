package rules

type IndexingRuleRegistry struct {
    rules []IndexingRule
}

func NewIndexingRuleRegistry() *IndexingRuleRegistry {
    return &IndexingRuleRegistry{}
}

func (r *IndexingRuleRegistry) RegisterRule(rule IndexingRule) {
    r.rules = append(r.rules, rule)
}

func (r *IndexingRuleRegistry) GetRules() []IndexingRule {
    return r.rules
}
