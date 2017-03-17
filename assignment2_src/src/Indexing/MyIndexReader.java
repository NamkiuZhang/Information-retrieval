package Indexing;

import java.io.IOException;

/**
 *  Class for Assignment 2 of INFSCI2140, 2016 Spring.
 */
public class MyIndexReader {
	//you are suggested to write efficient code here, otherwise, your memory cannot hold the whole corpus...

	
	public MyIndexReader( String type ) throws IOException {
		//read the index files you generated in task 1
		//remember to close reader when you finish using them
		//use appropriate structure to maintain the index
		
	}
	
	//get the non-negative integer dociId for the requested docNo
	//If the requested docno does not exist in the index, return -1
	public int getDocid( String docno ) {
		return -1;
	}

	// Retrieve the docno given the integer docid
	public String getDocno( int docid ) {
		return null;
	}
	
	/**
	 * Get the posting list for the requested token.
	 * 
	 * The posting list records 1.the documents' docids which contain given token and 2.corresponding frequencies of the term, such as:
	 *  
	 *  [docid]		[freq]
	 *  1			3
	 *  5			7
	 *  9			11
	 *  13			19
	 * 
	 * ...
	 * 
	 * In the returned 2-dimension array, the first dimension refers to each document, and the second dimension records the docid and frequency.
	 * 
	 * For example:
	 * array[0][0] records the docid of the first document the token appears.
	 * array[0][1] records the frequency of the token in the documents with docid = array[0][0]
	 * ...
	 * 
	 * NOTE that the returned posting list should be ranked by docid from the smallest to the largest.
	 * 
	 * @param token
	 */
	public int[][] getPostingList( String token ) throws IOException {
		return null;
	}

	// Return the number of documents that contain the given token.
	public int DocFreq( String token ) throws IOException {
		return 0;
	}
	
	// Return the total number of times the token appears in the collection.
	public long CollectionFreq( String token ) throws IOException {
		return 0;
	}
	
	public void close() throws IOException {
	}
	
}