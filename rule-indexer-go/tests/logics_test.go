package tests

import (
    "reflect"
    "rule-indexer-go/logics"
    "testing"
)

func TestCapitalizedWordCountLogic(t *testing.T) {
    logic := logics.NewCapitalizedWordCountLogic()

    t.Run("should return zero for empty string", func(t *testing.T) {
        // Given
        inputText := ""

        // When
        result := logic.Apply(inputText)

        // Then
        if result != 0 {
            t.Errorf("Expected 0, got %d", result)
        }
    })

    t.Run("should return zero for none input", func(t *testing.T) {
        // Given
        var inputText string

        // When
        result := logic.Apply(inputText)

        // Then
        if result != 0 {
            t.Errorf("Expected 0, got %d", result)
        }
    })

    t.Run("should correctly count capitalized words", func(t *testing.T) {
        // Given
        inputText := "Hello there, how Are you Doing today?"

        // When
        result := logic.Apply(inputText)

        // Then
        if result != 3 {
            t.Errorf("Expected 3, got %d", result)
        }
    })
}

func TestLongWordListLogic(t *testing.T) {
    logic := logics.NewLongWordListLogic()

    t.Run("should return empty list for empty string", func(t *testing.T) {
        // Given
        inputText := ""

        // When
        result := logic.Apply(inputText)

        // Then
        if !reflect.DeepEqual(result, []string{}) {
            t.Errorf("Expected empty list, got %v", result)
        }
    })

    t.Run("should return empty list for none input", func(t *testing.T) {
        // Given
        var inputText string

        // When
        result := logic.Apply(inputText)

        // Then
        if !reflect.DeepEqual(result, []string{}) {
            t.Errorf("Expected empty list, got %v", result)
        }
    })

    t.Run("should find long words correctly", func(t *testing.T) {
        // Given
        inputText := "Python is a widely used high-level programming language."

        // When
        result := logic.Apply(inputText)

        // Then
        expected := []string{"Python", "widely", "programming", "language"}
        if !reflect.DeepEqual(result, expected) {
            t.Errorf("Expected %v, got %v", expected, result)
        }
    })
}
