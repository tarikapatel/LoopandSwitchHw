public class PracticeTwoDimensionArray {
    //two Dimension array & print here value

    public static void main(String args[]) {
// {{rows},{rows},{rows} when declaring eg 1,2 in curley braces it columns that we are referring to. so below example 2 columns}
        int arr[][] = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}