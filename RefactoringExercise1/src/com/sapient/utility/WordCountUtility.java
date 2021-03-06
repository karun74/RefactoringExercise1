package com.sapient.utility;

import java.util.HashMap;
import java.util.Scanner;

public class WordCountUtility {

	private HashMap<String, Integer> makeWordMap(String text, String delimiter) throws EmptyTextException {
		if ("".equals(text))
			throw new EmptyTextException();
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		Scanner scan = getScanner(text, delimiter);
		try {
			scanAndGetUpdatedMap(wordCountMap, scan);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
		return wordCountMap; // return the HashMap you made of distinct words
	}

	private Scanner getScanner(String text, String delimiter) {
		Scanner scan = new Scanner(text);
		scan.useDelimiter(delimiter);
		return scan;
	}

	private HashMap<String, Integer> scanAndGetUpdatedMap(HashMap<String, Integer> wordCountMap, Scanner scan) {
		while (scan.hasNext()) {
			String word = scan.next(); // scanner automatically uses " " as a
										// delimeter
			int countWord = 0;
			if (!wordCountMap.containsKey(word)) { // add word if it isn't added
													// already
				wordCountMap.put(word, 1); // first occurance of this word
			} else {
				countWord = wordCountMap.get(word) + 1; // get current count and
														// increment
				// now put the new value back in the HashMap
				wordCountMap.remove(word); // first remove it (can't have
											// duplicate keys)
				wordCountMap.put(word, countWord); // now put it back with new
													// value
			}
		}
		return wordCountMap;
	}

	private int getDistinctWordCount(HashMap<String, Integer> list) {
		return list.size();
	}

	// get the frequency of the given word
	public Integer getFrequencyForWord(String word, String text, String delimiterPattern) {
		HashMap<String, Integer> list = makeWordMap(text, delimiterPattern);
		System.out.println("Size of WordMap: "+list);
		Integer freq = list.get(word);
		return freq;
	}

	public Integer getCountOfDistinctWordsInText(String text, String delimiterPattern) throws EmptyTextException {
		HashMap<String, Integer> countMap = makeWordMap(text, delimiterPattern);
		return getDistinctWordCount(countMap);
	}
}
