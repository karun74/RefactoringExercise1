package com.sapient.utility;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class WordCountUnitTest {

	private static final WordCountUtility wcUtil = new WordCountUtility();

	@Test
	public void should_verify_distinct_words_count() {
		String wordCountInput = "Simple Example for word count Simple testing";
		Integer actualCount = wcUtil.getCountOfDistinctWordsInText(wordCountInput,"\\p{javaWhitespace}+");
		  assertThat(actualCount, is(6));
	}

	@Test
	public void should_verify_frequency_of_a_word_in_a_text() {
		String frequencyFindingWord = "Simple";
		String wordCountInput = "Simple Example for word count Simple testing";

		Integer actualFrequencyOfWord = wcUtil.getFrequencyForWord(frequencyFindingWord, wordCountInput,"\\p{javaWhitespace}+");
		assertThat(actualFrequencyOfWord.intValue(),is(2));

	}
	
	@Test
	public void should_verify_frequency_of_a_non_existing_word_in_a_text(){
		String frequencyFindingWord = "Complete";
		String wordCountInput = "Simple Example for word count Simple testing";

		Integer actualFrequencyOfWord = wcUtil.getFrequencyForWord(frequencyFindingWord, wordCountInput,"\\p{javaWhitespace}+");
		assertNull(actualFrequencyOfWord);
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
		assertThat( actualCount,is(6));

	}

}
