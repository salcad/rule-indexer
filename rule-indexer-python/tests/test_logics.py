import unittest
from logics.capitalized_word_count_logic import CapitalizedWordCountLogic
from logics.long_word_list_logic import LongWordListLogic

class TestCapitalizedWordCountLogic(unittest.TestCase):
    def setUp(self):
        self.logic = CapitalizedWordCountLogic()

    def test_should_return_zero_for_empty_string(self):
        # Given
        input_text = ''

        # When
        result = self.logic.apply(input_text)

        # Then
        self.assertEqual(result, 0, "Should be 0 for empty string")

    def test_should_return_zero_for_none_input(self):
        # Given
        input_text = None

        # When
        result = self.logic.apply(input_text)

        # Then
        self.assertEqual(result, 0, "Should be 0 for None input")

    def test_should_correctly_count_capitalized_words(self):
        # Given
        input_text = "Hello there, how Are you Doing today?"

        # When
        result = self.logic.apply(input_text)

        # Then
        self.assertEqual(result, 3, "Should count capitalized words correctly")

class TestLongWordListLogic(unittest.TestCase):
    def setUp(self):
        self.logic = LongWordListLogic()

    def test_should_return_empty_list_for_empty_string(self):
        # Given
        input_text = ''

        # When
        result = self.logic.apply(input_text)

        # Then
        self.assertEqual(result, [], "Should be empty list for empty string")

    def test_should_return_empty_list_for_none_input(self):
        # Given
        input_text = None

        # When
        result = self.logic.apply(input_text)

        # Then
        self.assertEqual(result, [], "Should be empty list for None input")

    def test_should_find_long_words_correctly(self):
        # Given
        input_text = "Python is a widely used high-level programming language."

        # When
        result = self.logic.apply(input_text)

        # Then
        self.assertEqual(result, ['Python', 'widely', 'programming', 'language'], "Should find long words correctly")

if __name__ == '__main__':
    unittest.main()
