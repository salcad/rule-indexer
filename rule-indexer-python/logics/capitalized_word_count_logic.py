import re

class CapitalizedWordCountLogic:
    def apply(self, content):
        if content is None:
            return 0
        pattern = re.compile(r'\b[A-Z][a-z]*\b')
        return sum(1 for _ in pattern.finditer(content))

