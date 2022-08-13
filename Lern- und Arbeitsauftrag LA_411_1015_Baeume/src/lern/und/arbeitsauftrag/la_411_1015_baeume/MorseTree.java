/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lern.und.arbeitsauftrag.la_411_1015_baeume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hisho
 */
public class MorseTree {

    MorseNode root;

    public MorseTree() {
        root = new MorseNode();

        put('0', "-----");

        put('1', ".----");

        put('2', "..---");

        put('3', "...--");

        put('4', "....-");

        put('5', ".....");

        put('6', "-....");

        put('7', "--...");

        put('8', "---..");

        put('9', "----.");

// English alphabet
//----------------------------------------------------------------------
        put('A', ".-");

        put('B', "-...");

        put('C', "-.-.");

        put('D', "-..");

        put('E', ".");

        put('F', "..-.");

        put('G', "--.");

        put('H', "....");

        put('I', "..");

        put('J', ".---");

        put('K', "-.-");

        put('L', ".-..");

        put('M', "--");

        put('N', "-.");

        put('O', "---");

        put('P', ".--.");

        put('Q', "--.-");

        put('R', ".-.");

        put('S', "...");

        put('T', "-");

        put('U', "..-");

        put('V', "...-");

        put('W', ".--");

        put('X', "-..-");

        put('Y', "-.--");

        put('Z', "--..");

// Punctuation
//----------------------------------------------------------------------
        put('.', ".-.-.-");

        put(',', "--..--");

        put('?', "..--..");

        put('\'', ".----."); // apostrophe

        put('/', "-..-.");

        put('\"', ".-..-."); // quotation mark

        put(':', "---...");

        put('=', "-...-");

        put('-', "-....-");

        put('(', "-.--.-");

        put(')', "-.--.-");

        put('@', ".--.-.");

    }

    private void put(char c, String s) {
        MorseNode temp = root;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('.')) {
                if (temp.getNextPoint() == null) {
                    temp.setNextPoint(new MorseNode());
                    temp = temp.getNextPoint();
                } else {
                    temp = temp.getNextPoint();
                }
            } else {
                if (temp.getNextDash() == null) {
                    temp.setNextDash(new MorseNode());
                    temp = temp.getNextDash();
                } else {
                    temp = temp.getNextDash();
                }
            }
        }
        temp.setC(c);
    }
    
    public char getChar(String s){
           MorseNode temp = root;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('.')) {
                if (temp.getNextPoint() == null) {
                    temp.setNextPoint(new MorseNode());
                    temp = temp.getNextPoint();
                } else {
                    temp = temp.getNextPoint();
                }
            } else {
                if (temp.getNextDash() == null) {
                    temp.setNextDash(new MorseNode());
                    temp = temp.getNextDash();
                } else {
                    temp = temp.getNextDash();
                }
            }
        }
        
        return temp.getC();
    }
    
    public String decryption(String string){
        String output = "";
    
            String [] x = string.split("\\s+");
            for ( String string2 : x) {
            if(string2.equals("/")){
                 output+=" ";
            }else{
            output+=getChar(string2);
            }
  
        }
        
        return output;
    }
}

