package com.sf.ruleindexer;

import com.sf.rulelogic.impl.CapitalizedWordCountLogic;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CapitalizedWordsTest {

    @Autowired
    private CapitalizedWordCountLogic logic;
    @Test
    void shouldCountFiveCapitalizedWords() {
        // Given
        String content = "Hello World, this is a Test of the Emergency broadcast System.";

        // When
        int result = logic.apply(content);

        // Then
        assertEquals(5, result, "The count of capitalized words should be correct.");
    }

    @Test
    void shouldCountZeroCapitalizedWordsWhenNoneArePresent() {
        // Given
        String content = "hello world, everything is lowercase.";

        // When
        int result = logic.apply(content);

        // Then
        assertEquals(0, result, "There should be no capitalized words.");
    }

    @Test
    void shouldCountZeroCapitalizedWordsForEmptyContent() {
        // Given
        String content = "";

        // When
        int result = logic.apply(content);

        // Then
        assertEquals(0, result, "Empty content should result in zero capitalized words.");
    }
}
