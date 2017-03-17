package PreProcessData;

import java.io.IOException;
import java.util.Map;
import Classes.Path;
import static Classes.Path.DataWebDir;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

/**
 * This file is for the assignment of INFSCI 2140 in 2016 Spring
 *
 * Implementation of DocumentCollection
 */
public class TrecwebCollection implements DocumentCollection {
	//you can add essential private methods or variables
      
        private Map<String,Object> documents;
        private FileInputStream fis;
        private BufferedReader reader;
	
	// YOU SHOULD IMPLEMENT THIS METHOD
	public TrecwebCollection() throws IOException {
		// This constructor should open the file in Path.DataWebDir
		// and also should make preparation for function nextDocument()
		// Do not load the whole corpus into memory!!!
            fis = new FileInputStream(DataWebDir);
            reader = new BufferedReader(new InputStreamReader(fis));
                      
         }
	
	// YOU SHOULD IMPLEMENT THIS METHOD
	public Map<String, Object> nextDocument() throws IOException {
		// this method should load one document from the corpus, and return this document's number and content.
		// the returned document should never be returned again.
		// when no document left, return null
		// NT: the returned content of the document should be cleaned, all html tags should be removed.
		// NTT: remember to close the file that you opened, when you do not use it any more
		
            documents = new HashMap<String, Object>();         
            String line = reader.readLine();
            String content = "";
            String dname = "";
            while(line != null){               
                if(line.equals("<DOC>")){
                    line = reader.readLine();
                    int beginIdx = "<DOCNO>".length();
                    int endIdx = line.indexOf("</D");
                    dname = line.substring(beginIdx,endIdx); 
                    
                    content = "";
                    while (line != null && !line.equals("</DOCHDR>"))
                        line=reader.readLine();
                    line = reader.readLine();

                    while(line!= null && !line.equals("</DOC>")){
                        content+= line;
                        line=reader.readLine(); 
                    } 
                    //remove all html tags
                    String contents = content.replaceAll("<[^>]*>","");
                    documents.put(dname,contents.toString().toCharArray());
                    return documents; 
                }
                //to step the </BODY> </DOC>tags between two documents
                line = reader.readLine();              
           }   
            
            reader.close();
            fis.close();     	
            return null;
	}
	
}
