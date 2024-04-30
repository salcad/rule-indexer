class FileProcessor:
    def __init__(self, rules):
        self.rules = rules

    def process_files(self, file_paths):
        for path in file_paths:
            try:
                with open(path, 'r') as file:
                    content = file.read()
                print(f"Processing {path}")
                for rule in self.rules:
                    rule.apply_rule(content)
            except IOError as e:
                print(f"Failed to read {path}: {e}")
