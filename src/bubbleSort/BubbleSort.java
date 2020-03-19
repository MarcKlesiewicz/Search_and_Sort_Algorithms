package bubbleSort;


public class BubbleSort {

    public static void main(String[] args){

        BubbleSort newArray = new BubbleSort();

        newArray.generateRandomArray();

        newArray.printArray();

        newArray.bubbleSort();
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


    /* Bubble sort metode :  */

    public void bubbleSort() {

        for (int i = arraySize - 1; i > 1; i--) {

            for (int j = 0; j < i; j++) {

                if (theArray[j] > theArray[j + 1]) {

                    swapValues(j,j+1);

                }

            }
        }
    }

    public void swapValues(int indexOne, int indexTwo){

        int temp = theArray[indexOne];
        theArray[indexOne] = theArray [indexTwo];
        theArray[indexTwo] = temp;
    }
}
