package logics

import (
    "regexp"
)

type CapitalizedWordCountLogic struct{}

func NewCapitalizedWordCountLogic() *CapitalizedWordCountLogic {
    return &CapitalizedWordCountLogic{}
}

func (c *CapitalizedWordCountLogic) Apply(content string) int {
    if content == "" {
        return 0
    }
    pattern := regexp.MustCompile(`\b[A-Z][a-z]*\b`)
    matches := pattern.FindAllString(content, -1)
    return len(matches)
}
