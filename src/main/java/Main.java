// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class Main {
  public static void main(String[] args) {
    
    // MergeSort 
    int[] arr = {5, 2, 4, 6, 1, 3};
    MergeSort.mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
    
    System.out.println("Hello world!");
  }
}