package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class L648ReplaceWordsTest {

    @Test
    void replaceWords() {
        // given
        L648ReplaceWords solution = new L648ReplaceWords();
        List<String> dictionary = List.of("cat","bat","rat");
        String sentence = "the cattle was rattled by the battery";

        // when
        String answer = solution.replaceWords(dictionary, sentence);

        // then
        assertThat(answer).isEqualTo("the cat was rat by the bat");
    }

}
