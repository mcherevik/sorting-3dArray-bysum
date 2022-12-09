package sorting3d_1;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int z = 3;
        int[][][] myArray = new int[z][y][x];
        int[][] temp;
        createArray(myArray);
        System.out.println("Unsorted 3D array: ");
        printArray(myArray);

        for (int out = z - 1; out >= 1 ; out--) {
            for (int in = 0; in < out; in++) {
                if (countSum(myArray[in]) > countSum(myArray[in + 1])) {
                    temp = myArray[in];
                    myArray[in] = myArray[in + 1];
                    myArray[in + 1] = temp;
                }
            }
        }
        System.out.println("Sorted 3D array: ");
        printArray(myArray);
        
    }

    static int countSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    static void createArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    array[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }
    }

    static void printArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
