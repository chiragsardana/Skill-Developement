package CollectionFramework;


/*
 Write a program that implements a simple spell checker using a hash table. Your spell-checker
will be reading from two input files.
The first file is a dictionary "dictionary.txt". The program should read the dictionary and insert
the words into a hash table. After reading the dictionary, it will read a list of words from a second
file. The goal of the spell-checker is to determine the misspelled words in the second file by
looking each word up in the dictionary. The program should output each misspelled word.
Definition of Done:
i. Program should read two files namely, “dictionary.txt” and “words.txt”
ii. It should check the mis-spelled words given in “words.txt” and display such words
iii. Use the appropriate Collection that implements the hashtable for storing items
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;

public class Q7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File file_dictionary = new File("dictionary.txt"); 
		  
		BufferedReader br = new BufferedReader(new FileReader(file_dictionary)); //Chirag19CSU071
		
		
		HashSet<String> dictionary_hashSet = new HashSet<String>();
		String st; 
		while ((st = br.readLine()) != null) {
			dictionary_hashSet.add(st);
		} 
		
		
		File file_word = new File("word.txt");
		br = new BufferedReader(new FileReader(file_word));
		HashSet<String> word_hashSet = new HashSet<String>();
		
		while ((st = br.readLine()) != null) {
			word_hashSet.add(st);
		}
		
//		I have add only One Incorrect word!!!
		System.out.println("The Word hash Set: "+word_hashSet);
		Iterator<String> itr = word_hashSet.iterator();
		
		System.out.print("Incorrected Spelled Words: ");
		while(itr.hasNext()) {
			st = itr.next();
			if(!dictionary_hashSet.contains(st)) {
				System.out.print(st+" "); 
			}
		}
		br.close();
	}

}