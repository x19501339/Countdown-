/*
C King
CountingApp.java
3 4 2020
*/

import javax.swingJOptionPane;
public class CountingApp.java{
	public static void main (String args[]){

		 String sentence;
		 int spaces;
		 int vowels;
		 int consonants;

		 Countaing myCounting = new Counting();

		 if{

			 sentence = JOptionPane.showInputDialogue(null,"Please enter a sentence");
			 myCounting.setSentence(sentence);

			 myCounting.compute();

			 spaces = myCounting.getSpaces();
			 vowels = myCounting.getVowels();
			 consonants = myCounting.getConsonants();

			 JOptionPane.showMessageDialogue(null,"there are " + spaces+ " spaces " + vowels+ " vowels " + consonantes+ "consonates");

			 word= JOptionPane.showInputDialogue(null,"would you like to do another sentences? Entre yes or no");
			 do while(flag.validity ("yes"));
