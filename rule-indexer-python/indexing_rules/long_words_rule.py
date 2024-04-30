from .base import IndexingRule
from logics.long_word_list_logic import LongWordListLogic

class LongWordsRule(IndexingRule):
    def __init__(self):
        self.logic = LongWordListLogic()
    
    def apply_rule(self, content):
        long_words = self.logic.apply(content)
        print("Words longer than 5 characters:")
        for word in long_words:
            print(word)
