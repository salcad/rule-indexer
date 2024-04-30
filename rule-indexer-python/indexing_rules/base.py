from abc import ABC, abstractmethod

class IndexingRule(ABC):
    @abstractmethod
    def apply_rule(self, content):
        pass
