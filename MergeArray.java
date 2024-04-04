import java.util.Arrays;

public class MergeArray {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Move all elements of X to the end
        int index = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[index] = X[i];
                index--;
            }
        }
        
        int i = index + 1;
        int j = 0;
        int k = 0;
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }
        
        // Copy remaining elements of Y[] if any
        while (j < n) {
            X[k++] = Y[j++];
        }
        
        Arrays.stream(X).forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        mergeArrays(X, Y);
    }
}
