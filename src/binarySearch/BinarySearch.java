package binarySearch;


import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast en value at søge efter imellem 10-19:");
        int num = input.nextInt();

        BinarySearch newArray = new BinarySearch();

        newArray.generateRandomArray();

        newArray.printArray();

        newArray.binarySearchForValue(num);
    }


    private int[] theArray = new int[50];

    //Antallet af indexes i theArray
    private int arraySize = 10;


    // Generere tilfældige tal fra 10 til 19 og tilføjer dem til theArray
    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){

            theArray[i] = (int)(Math.random()*10)+10;
        }
    }


    // Printer Array i console
    public void printArray(){

        System.out.println("----------");

        for(int i = 0; i < arraySize; i++){

            //index nummer
            System.out.print("| " + i + " | ");

            //value
            System.out.println(theArray[i] + " |");

            System.out.println("----------");

        }
    }


    /* Binary search metode (divide and conquer) : finder en value ved at afgører om den større eller mindre
    en den mindste value og halvere derfor mulige index for hver gang while-loopet køre
    fungere bedst hvis der ikke er nogle duplicates (løsning endnu ikke fundet) */

    public void binarySearchForValue(int value){

        int lowestIndex = 0;
        int middleIndex;
        int highestIndex = arraySize -1;

        while (lowestIndex <= highestIndex){

            middleIndex = (highestIndex + lowestIndex) / 2;

            if (theArray[middleIndex] < value){
                lowestIndex = middleIndex + 1;

            }else if (theArray[middleIndex] > value){
                highestIndex = middleIndex -1;

            }else{
                System.out.println("Et match for value " + value + " blev fundet i index " + middleIndex);
                lowestIndex = highestIndex + 1;

            }
        }
    }
}