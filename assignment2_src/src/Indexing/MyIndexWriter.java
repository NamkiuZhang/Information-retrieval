package Indexing;

import java.io.IOException;
/**
 * Please construct your code efficiently, otherwise, your memory cannot hold the whole corpus...
 *
 * Class for Assignment 2 of INFSCI2140, 2016 Spring.
 */
public class MyIndexWriter {

	
	
    /**
     This constructor should initiate the FileWriter to output your index files
     remember to close files if you finish writing the index
    */
	public MyIndexWriter(String type) throws IOException {
	}
	
    /**
     you are strongly suggested to build the index by installments
     in your implementation of the index, you should transform your string docnos into non-negative integer docids !!!
     In MyIndexReader, you will need to request the integer docid for docnos.
    */
	public void index(String docno, String content) throws IOException {
	}
	
	/**
	 *   close the index writer, and you should output all the buffered content (if any).
     *   and if you write your index into several files, you need to fuse them here.
	 */
	public void close() throws IOException {
	}
	
}
