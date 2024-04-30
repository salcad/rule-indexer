class IndexingRuleRegistry:
    def __init__(self):
        self.rule_classes = []

    def register_rule(self, cls):
        self.rule_classes.append(cls)
        return cls

    def get_rules(self):
        return [cls() for cls in self.rule_classes]
