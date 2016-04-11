package com.sapient.utility;

import java.util.HashMap;
import static org.junit.Assert.*;
import org.junit.Test;

public class WordCountUnitTest {

	private static final WordCountUtility wcUtil = new WordCountUtility();

	@Test
	public void should_verify_distinct_words_count() {
		String wordCountInput = "Simple Example for word count Simple testing";
		Integer actualCount = wcUtil.getCountOfDistinctWordsInText(wordCountInput,"\\p{javaWhitespace}+");
		assertEquals(new Integer(6), actualCount);
	}

	@Test
	public void should_verify_frequency_of_a_word_in_a_text() {
		String frequencyFindingWord = "Simple";
		String wordCountInput = "Simple Example for word count Simple testing";

		Integer actualFrequencyOfWord = wcUtil.getFrequencyForWord(frequencyFindingWord, wordCountInput,"\\p{javaWhitespace}+");
		assertEquals(2, actualFrequencyOfWord.intValue());

	}

	@Test(expected = EmptyTextException.class)
	public void should_throw_exception_when_empty_text_passed_when_verify_distinct_words() {
		String wordCountInput = "";
		wcUtil.getCountOfDistinctWordsInText(wordCountInput,"\\p{javaWhitespace}+");
	}

	@Test
	public void should_work_with_other_delimiter_when_text_with_other_delimiter() {
		String wordCountInput = "Simple;Example;for;word;count;Simple;testing";
		Integer actualCount =wcUtil.getCountOfDistinctWordsInText(wordCountInput,";");
		assertEquals(new Integer(6), actualCount);

	}

}
