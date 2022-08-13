/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lern.und.arbeitsauftrag.la_411_1015_baeume;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author Hisho
 */
public class Main {

    /**
     * @param args the command line arguments .... .. ... .... --- .-.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        MorseTree x = new MorseTree();
        System.out.println("Enter Morsecode");
        String str  = myObj.nextLine();
        System.out.println(x.decryption(str));
    }

}
