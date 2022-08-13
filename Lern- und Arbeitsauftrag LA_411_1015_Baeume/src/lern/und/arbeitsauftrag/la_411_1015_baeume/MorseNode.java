/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lern.und.arbeitsauftrag.la_411_1015_baeume;



/**
 *
 * @author Hisho
 */
public class MorseNode {
    private char c;
    private MorseNode nextPoint;
    private MorseNode nextDash;
    public void setC(char c) {
        this.c = c;
    }

    public MorseNode(char c) {
        this.c = c;
        this.nextPoint = null;
        this.nextDash = null;
    }
    
    public MorseNode() {
        nextDash=null;
        nextPoint=null;
    }
    
            
    
    

    public void setNextDash(MorseNode nextDash) {
        this.nextDash = nextDash;
    }

    public void setNextPoint(MorseNode nextPoint) {
        this.nextPoint = nextPoint;
    }

    public char getC() {
        return c;
    }

    public MorseNode getNextDash() {
        return nextDash;
    }

    public MorseNode getNextPoint() {
        return nextPoint;
    }
    
    
   
}
