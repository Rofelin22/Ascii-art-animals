/*Directions:
        take this ASCII cat code and put it in a method
        create another method to do a different animal
        ask the user which animal to print, and print the correct animal based on the answer
        reminder: import the scanner
        */

import java.util.Scanner;

public class AsciiArtAnimals {
    public static void printCat(){

        System.out.println("--- CAT ---");
        System.out.println(" /\\_/\\ ");
        System.out.println("(=^.^=)");
        System.out.println(" (\")(\")__/"); 

    }
    public static void printCow(){
        System.out.println("--- COW ---");
        System.out.println("          (___)");
        System.out.println("          (o o)");
        System.out.println("  /-------\\ / ");
        System.out.println(" / ||    ||O");
        System.out.println("*  ||,---||    "); 

    }
    public static void main(String[] args) {
       
        Scanner myScanner = new Scanner (System.in);
        System.out.println( "Enter your animal");
        String animal = myScanner.nextLine();

        if(animal.equals( "cat"));{
            printCat();
        }
        elif(animal.equals( "cow"));{
           printCow();
        
        }
        else{
            printCat()
        }
    }
}

    
    


    


