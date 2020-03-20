package bubbleSort;


public class BubbleSort {

    public static void main(String[] args) {

        BubbleSort newArray = new BubbleSort();

        newArray.generateRandomArray();

        System.out.println("Array før bubble sort");

        newArray.printArray();

        System.out.println("Array efter bubble sort");

        newArray.bubbleSort();

        newArray.printArray();
    }


    private int[] theArray = new int[50];

    //Antallet af indexes i theArray
    private int arraySize = 10;


    // Generere tilfældige tal fra 10 til 19 og tilføjer dem til theArray
    public void generateRandomArray() {

        for (int i = 0; i < arraySize; i++) {

            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }


    // Printer Array i console
    public void printArray() {

        System.out.println("----------");

        for (int i = 0; i < arraySize; i++) {

            //index nummer
            System.out.print("| " + i + " | ");

            //value
            System.out.println(theArray[i] + " |");

            System.out.println("----------");

        }
    }


    // Bubble sort metode

    public void bubbleSort() {

        int temp = 0;


        /*et nested for loop som sammenligner den første value med den næste value
        er den første value større end den næste bytter de plads.
        loopet starter forfra og tjekker næste value.
         */
        for (int i = 0; i < arraySize; i++) {

            for (int j = 1; j < (arraySize - i); j++) {

                if (theArray[j - 1] > theArray[j]) {

                    temp = theArray[j - 1];
                    theArray[j - 1] = theArray[j];
                    theArray[j] = temp;

                }

            }
        }
    }

}

