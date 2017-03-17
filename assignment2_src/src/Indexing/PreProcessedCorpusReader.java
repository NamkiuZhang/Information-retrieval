package Indexing;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * This is a simple corpus reader
 * Class for Assignment 2 of INFSCI2140, 2016 Spring.
 */
public class PreProcessedCorpusReader {

	
    /*
     This constructor should open the pre-processed corpus file, Path.ResultHM1 + type
     which was generated in assignment 1
     remember to close the file that you opened, when you do not use it any more
     */
	public PreProcessedCorpusReader(String type) throws IOException {
	}
	

	/*
     read a line for docNo, then read another line for the word list
     put them in a map, and return it
    */
	public Map<String, String> nextDocument() throws IOException {
		Map<String, String> doc = new HashMap<String, String>();
		return doc;
	}

}
