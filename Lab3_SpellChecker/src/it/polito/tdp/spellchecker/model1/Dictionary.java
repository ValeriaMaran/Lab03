package it.polito.tdp.spellchecker.model1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Dictionary {
	public void loadDictionary(String Language) {
		List<String> Dizionario = new ArrayList <String>();
		
		if(Language.toLowerCase().compareTo("italian") == 0) {
			
			try {
				FileReader fr = new FileReader("rsc/Italian.txt");
				BufferedReader br = new BufferedReader(fr);
				String word;
				while((word = br.readLine())!=null) {
					Dizionario.add(word);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(Language.toLowerCase().compareTo("english") == 0) {
			
			try {

				FileReader fr = new FileReader("rsc/English.txt");
				BufferedReader br = new BufferedReader(fr);
				String word;
				while((word = br.readLine())!= null) {
					Dizionario.add(word);
				}
			}
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
	
			
		}
		
	}


