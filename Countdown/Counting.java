/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingapp;

/**
 *
 * @author gjkin_000
 */
public class Counting {
    //declaring
    private String Input;
    private int Letters;
    private int Con;
    private int Vowels;
    private int Words;
    
    //constructor
    public Counting (){
        Input = "";
        Letters = 0;
        Vowels = 0;
        Con = 0;
        Words = 0;
    }
    
    //setters
    public void setInput(String Input){
        this.Input = Input;
        
    }
    
    //compute
    public void compute(){
        for(int i = 0; i <Input.length();i++){
            if(Input.charAt(i)=="a"||Input.charAt(i)=="i"||Input.charAt(i)=="o"||Input.charAt(i)=="u"){
                
            }
        }
    }
    
    //getters one for every output

    public int getLetters() {
        return Letters;
    }

    public int getCon() {
        return Con;
    }

    public int getVowels() {
        return Vowels;
    }

    public int getWords() {
        return Words;
    }

}
