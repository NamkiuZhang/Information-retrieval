package PreProcessData;

import java.util.ArrayList;

/**
 * This file is for the assignment of INFSCI 2140 in 2016 Spring
 * 
 * TextTokenizer can split a sequence of text into individual word tokens, the delimiters can be any common punctuation marks(space, period etc.).
 */
public class WordTokenizer {
	//you can add any essential private method or variable
        private ArrayList<char[]> contents;
        private int j;
	// YOU MUST IMPLEMENT THIS METHOD
	public WordTokenizer( char[] texts ) {
		// this constructor will tokenize the input texts (usually it is the char array for a whole document)
                j = 0;
                contents = new ArrayList<char[]>();
                String text = new String(texts);
                //split based on punctions and space         
                String[] tokens = text.split("[\\s\\p{P}]");
                for(int i = 0; i< tokens.length; i++)
                    contents.add(tokens[i].toCharArray());       
        }
	
	// YOU MUST IMPLEMENT THIS METHOD
	public char[] nextToken() {
		// read and return the next word of the document
		// or return null if it reaches the end of the document
                if(j< contents.size())
                    return contents.get(j++);
                else
                    return null;
                
        }
	
}
