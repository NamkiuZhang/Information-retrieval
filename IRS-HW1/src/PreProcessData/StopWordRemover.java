package PreProcessData;
import Classes.Path;
import static Classes.Path.DataTextDir;
import static Classes.Path.StopwordDir;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * This file is for the assignment of INFSCI 2140 in 2016 Spring
 *
 * StopWordRemover is a class takes charge of judging whether a given word
 * is a stopword by calling the method <i>isStopword(word)</i>.
 */
public class StopWordRemover {
	//you can add essential private methods or variables
        private Map<String,Object> words;
        
	public StopWordRemover( ) throws FileNotFoundException, IOException {
		// load and store the stop words from the fileinputstream with appropriate data structure
		// that you believe is suitable for matching stop words.
		// address of stopword.txt should be Path.StopwordDir
                
                //use hashmap to store stopwords
                words = new HashMap<String, Object>();
                FileInputStream fis = null;
                BufferedReader reader = null;           
                fis = new FileInputStream(StopwordDir);
                reader = new BufferedReader(new InputStreamReader(fis));
                String word = reader.readLine();
                while(word!=null){
                    words.put(word,"");
                    word = reader.readLine();
                }
                
	}
	
	// YOU MUST IMPLEMENT THIS METHOD
	public boolean isStopword( char[] word ) {
            // return true if the input word is a stopword, or false if not
		return words.containsKey(word.toString());
	}
}
