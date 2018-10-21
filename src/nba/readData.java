package nba;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;



public class readData {
	
	public static ArrayList<ArrayList<String>> read(String fileName){
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		
		File fileDir = new File(fileName);
		if (!fileDir.exists()){
			System.err.println("Error: the file "+fileDir.getAbsolutePath()+" does not exist.\n");
			System.exit(1);
		}
		if (!fileDir.canRead()){
			System.err.println("Error: the file "+fileDir.getAbsolutePath()+
											" cannot be opened for reading.\n");
			System.exit(1);
		}
		
		BufferedReader in;
		try {
			in = new BufferedReader(
				new InputStreamReader(new FileInputStream(fileDir), "UTF8"));			        
			String str; 
			ArrayList<String> sw = new ArrayList<String>();
			
			while ((str = in.readLine()) != null) {
				try { 
					sw = splitCSVLine(str); 
				}catch (NoSuchElementException ex ) {
					//caused by an incomplete or miss-formatted line in the input file
					System.err.println(str);
					continue; 	
				}
				data.add(sw);
			}
		}catch (IOException e) {
			System.err.println("An IOException was caught :"+e.getMessage());
			System.exit(1);
		}	
		
		return data;
	}
	
	public static ArrayList<String> splitCSVLine(String textLine) {
		if(textLine ==null) {
			return null;
		}
		ArrayList<String> entries =new ArrayList<String>();
		int lineLength = textLine.length();
		StringBuffer nextWord = new StringBuffer();
		char nextChar;
		boolean insideQuotes = false;
		boolean insideEntry = false;
		
		// iterate over all characters in the textLine
		for(int i = 0; i < lineLength; i++) {
			nextChar = textLine.charAt(i);
			
			// handle smart quotes as well as regular quotes
			if(nextChar == '"' || nextChar == '\u201C' || nextChar == '\u201D') {
				
				// change insideQuotes flag when nextChar is a quote
				if(insideQuotes) {
					insideQuotes = false;
					insideEntry =false;
				}else{
					insideQuotes = true;
					insideEntry = true;
				}
			}else if(Character.isWhitespace(nextChar)) {
				if( insideQuotes || insideEntry ) {
					// add it to the current entry
					nextWord.append( nextChar );
				}else{ 
					// skip all spaces between entries
					continue;
				}
			}else if( nextChar == ',') {
				if(insideQuotes){ 
					// comma inside an entry
					nextWord.append(nextChar);
				}else{ 
					// end of entry found
					insideEntry = false;
					entries.add(nextWord.toString());
					nextWord = new StringBuffer();
				}
			}else{
				// add all other characters to the nextWord
				nextWord.append(nextChar);
				insideEntry = true;
			}
		}
		
		// add the last word ( assuming not empty )
		// trim the white space before adding to the list
		if(!nextWord.toString().equals("")) {
			entries.add(nextWord.toString().trim());
		}
		
		int length = textLine.length();
		if (textLine.charAt(length-1) == ',') {
			entries.add(null);
		}
		return entries;
	}
	
}
