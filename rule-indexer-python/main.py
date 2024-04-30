from processors.file_processor import FileProcessor
from indexing_rules.rule_registry import IndexingRuleRegistry

def main():
    rule_registry = IndexingRuleRegistry()
    
    from indexing_rules.capitalized_words_rule import CapitalizedWordsRule
    from indexing_rules.long_words_rule import LongWordsRule
    
    # Registering rules
    rule_registry.register_rule(CapitalizedWordsRule)
    rule_registry.register_rule(LongWordsRule)

    file_processor = FileProcessor(rule_registry.get_rules())
    example_file_paths = ['./samples/file1.txt', './samples/file2.html']
    file_processor.process_files(example_file_paths)

if __name__ == '__main__':
    main()
