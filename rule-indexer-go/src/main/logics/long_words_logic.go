package logics

import (
    "regexp"
)

type LongWordListLogic struct{}

func NewLongWordListLogic() *LongWordListLogic {
    return &LongWordListLogic{}
}

func (l *LongWordListLogic) Apply(content string) []string {
    if content == "" {
        return []string{}
    }
    pattern := regexp.MustCompile(`\b\w{6,}\b`)
    matches := pattern.FindAllString(content, -1)
    return matches
}
