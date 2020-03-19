package linearSearch;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast en value at søge efter imellem 10-19:");
        int num = input.nextInt();

        LinearSearch newArray = new LinearSearch();

        newArray.generateRandomArray();

        newArray.printArray();

        newArray.linearSearchForValue(num);
    }


    private int[] theArray = new int[50]; // Creates an array with 50 indexes

    //Antallet af indexes i theArray
    private int arraySize = 20;


    // Generere tilfældige tal fra 10 til 19 og tilføjer dem til theArray
    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){

            theArray[i] = (int)(Math.random()*10)+10;
        }
    }


    // Printer Array i console : indexes til venstre og værdi til højre

    public void printArray(){

        System.out.println("----------");

        for(int i = 0; i < arraySize; i++){

            System.out.print("| " + i + " | ");

            System.out.println(theArray[i] + " |");

            System.out.println("----------");

        }
    }


    /* Linear Search metode : søger kronologisk igennem array et tal af gangen
    og retunere indexes som indeholder tallet */

    public String linearSearchForValue(int value){

        boolean valueInArray = false;

        String indexsWithValue = "";

        System.out.print("Din søgte value blev fundet i de følgende indexes: ");

        for(int i = 0; i < arraySize; i++){

            if(theArray[i] == value) {
                valueInArray = true;

                System.out.print(i + " ");

                indexsWithValue+= i + " ";
            }
        }
        if(!valueInArray){
            indexsWithValue = "None";

            System.out.print(indexsWithValue);
        }

        System.out.println();

        return indexsWithValue;

    }
}


