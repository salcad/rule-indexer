from .base import IndexingRule
from logics.capitalized_word_count_logic import CapitalizedWordCountLogic

class CapitalizedWordsRule(IndexingRule):
    def __init__(self):
        self.logic = CapitalizedWordCountLogic()
    
    def apply_rule(self, content):
        count = self.logic.apply(content)
        print(f"Number of capitalized words: {count}")
