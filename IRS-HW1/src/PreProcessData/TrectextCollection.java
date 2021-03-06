package PreProcessData;

import java.io.IOException;
import java.util.Map;
import Classes.Path;
import static Classes.Path.DataTextDir;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

/**
 * This file is for the assignment of INFSCI 2140 in 2016 Spring
 *
 * Implementation of DocumentCollection
 *
 */
public class TrectextCollection implements DocumentCollection {
	//you can add essential private methods or variables
    
	private Map<String,Object> documents;
        private FileInputStream fis;
        private BufferedReader reader;
        
	// YOU SHOULD IMPLEMENT THIS METHOD
	public TrectextCollection() throws IOException {
		// This constructor should open the file in Path.DataTextDir
		// and also should make preparation for function nextDocument()
                // Do not load the whole corpus into memory!!!       
                     
            fis = new FileInputStream(DataTextDir);
            reader = new BufferedReader(new InputStreamReader(fis));                               
         }
	
	// YOU SHOULD IMPLEMENT THIS METHOD	
	public Map<String, Object> nextDocument() throws IOException {
		// this method should load one document from the corpus, and return this document's number and content.
		// the returned document should never be returned again.
		// when no document left, return null
		// NTT: remember to close the file that you opened, when you do not use it any more
                documents = new HashMap<String, Object>();
                String line = reader.readLine(); 
                String text = "";
                String dname = "";  
                while(line!= null){
                    if(line.equals("<DOC>")){
                        line = reader.readLine();
                        int beginIdx = "<DOCNO>".length();
                        int endIdx = line.indexOf("</D");
                        //To get the docno
                        dname = line.substring(beginIdx,endIdx);

                        while (line != null && !line.equals("<TEXT>"))
                            line=reader.readLine();
                        line = reader.readLine();

                        while(line!= null && !line.equals("</TEXT>")){
                            text+= line;
                            line=reader.readLine(); 
                        }                    
                        documents.put(dname,text.toString().toCharArray());
                        return documents;             
                    }
                    //to step tags like </BODY> </DOC> Between two documents
                    line = reader.readLine(); 
                }
                reader.close();
                fis.close();                             
		return null;
        }     
}

