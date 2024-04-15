package com.sf.ruleindexer;

import com.sf.rulelogic.impl.LongWordListLogic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class LongWordsTest {

    @Autowired
    private LongWordListLogic logic;

    @Test
    void shouldFindLongWordsCorrectly() {
        // Given
        String content = "Here are some very simple words and some exceptionally long words.";

        // When
        List<String> result = logic.apply(content);

        // Then
        assertAll("Should find all long words",
                () -> assertTrue(result.contains("exceptionally"), "Should contain 'exceptionally'"),
                () -> assertTrue(result.contains("simple"), "Should contain 'simple'"),
                () -> assertEquals(2, result.size(), "There should be exactly two long words")
        );
    }
}