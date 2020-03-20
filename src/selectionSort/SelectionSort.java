package selectionSort;


public class SelectionSort {

    public static void main(String[] args) {

        SelectionSort newArray = new SelectionSort();

        newArray.generateRandomArray();

        System.out.println("Array før selection sort");

        newArray.printArray();

        System.out.println("Array efter selection sort");

        newArray.selectionSort();

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


    /* Selection sort metode : der sorterer array fra lille til stor value
    ved at finde det laveste tal i theArray og placere det i det første index
     */

    public void selectionSort() {

        for (int i = 0; i < (arraySize - 1); i++) {

            int currentMin = theArray[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < arraySize; j++) {
                if (currentMin > theArray[j]) {
                    currentMin = theArray[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != 1) {
                theArray[currentMinIndex] = theArray[i];
                theArray[i] = currentMin;
            }

        }

    }
}
