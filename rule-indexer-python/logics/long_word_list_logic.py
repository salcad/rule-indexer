import re

class LongWordListLogic:
    def apply(self, content):
        if content is None:
            return []
        pattern = re.compile(r'\b\w{6,}\b')
        return [match.group() for match in pattern.finditer(content)]