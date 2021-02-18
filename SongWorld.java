/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introarrays;



import java.util.Scanner; // Importing a Scanner

/**
 * Client class That plays lyrics via a karaoke machine
 *  To the tune of "Fly me to the Moon" by Frank Sinatra 
 * @author Joshua Deniziuk with assistance from Eric Darsow
 */
public class SongWorld {
    public static void main(String[] args) {

        buildLyricLineArray(); // calling a method
   
    } // closing main method
    
    
    public static void buildLyricLineArray(){
       
        
        /** 
        * The song contains three verses 
        *Verses One and two have 6 Lines and the final has 7
        * Therefore I will set up the arrays as such
        * We must use lyric Line class to set this up
        */
        
        
        // The first verse will be placed here, along with timings in milliseconds
        LyricLine[] firstVerse = new LyricLine[6];
        firstVerse[0] = new LyricLine("Fly me to the moon", 2320);
        firstVerse[1] = new LyricLine("Let me play among the stars", 4090);
        firstVerse[2] = new LyricLine("Let me see what spring is like", 2660);
        firstVerse[3] = new LyricLine("On a, Jupiter and Mars", 3590);
        firstVerse[4] = new LyricLine("In other words, hold my hand", 7430);
        firstVerse[5] = new LyricLine("In other words, baby, kiss me", 6460);
        
        // The second verse will be placed here, along with timings in milliseconds
        LyricLine[] secondVerse = new LyricLine[6];
        secondVerse[0] = new LyricLine("Fill my heart with song",2640);
        secondVerse[1] = new LyricLine("And let me sing for ever more", 4200);
        secondVerse[2] = new LyricLine("You are all I long for", 3500);
        secondVerse[3] = new LyricLine("All I worship and adore", 3450);
        secondVerse[4] = new LyricLine("In other words, please be true", 5700);
        secondVerse[5] = new LyricLine("In other words, I love you", 5380);
        
        // The Third verse will be placed here, along with timings in milliseconds
        LyricLine[] thirdVerse = new LyricLine[7];
        thirdVerse[0] = new LyricLine("Fill my heart with song", 2640);
        thirdVerse[1] = new LyricLine("Let me sing for ever more", 3530);
        thirdVerse[2] = new LyricLine("You are all I long for", 2900);
        thirdVerse[3] = new LyricLine("All I worship and adore", 3660);
        thirdVerse[4] = new LyricLine("In other words, please be true", 8600);
        thirdVerse[5] = new LyricLine("In other words, in other words", 7520);
        thirdVerse[6] = new LyricLine("I love you", 8460);
                
         // Printing all three verses       
         karaokeSimulation(firstVerse);
         System.out.println("");
         karaokeSimulation(secondVerse);
         System.out.println("");
         karaokeSimulation(thirdVerse);
         System.out.println("");
                
                                              // public static void buildLyricLineArray()
                                            } // closing the three verse arrays
    
    
    /**
     * Displays lines of lyrics with timings
     * @param kTape Array of instantiated LyricLine objects
     */
    
    
    public static void karaokeSimulation(LyricLine[] kTape){
        
        
        // iterate over our incoming array of LyricLines, one at a time
        for(int line = 0; line < kTape.length; line++){
                // Extract the LyricLine object from our current row
                // and store temporarily
                LyricLine tempLine = kTape[line];
                // dump lyric to console
                System.out.println(tempLine.lineText);
                try {
                    Thread.sleep(tempLine.timeToDisplayMilli);
                }catch (InterruptedException ex) {
                    // do nothing
                }
            } // close for
            
    } // close Karaoke
    
    /**
     * Utility methods for displaying guts of a lyric line
     * @param line 
     */
    private static void displayLyricLineInfo(LyricLine line){
        System.out.println("Text: " + line.lineText);
        System.out.println("Time to display: " + line.timeToDisplayMilli);
    } // close utility methods
    
} // Close Class
