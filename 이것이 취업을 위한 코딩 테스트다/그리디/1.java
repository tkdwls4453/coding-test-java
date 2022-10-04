import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++){
      arr[i] = scanner.nextInt();
    }

    Arrays.sort(arr);
    
    int currCnt = 0;
    int currMax = -1;
    int result = 0; 
    for(int i=0; i<n; i++){
      if(arr[i] > currMax){
        currMax = arr[i];
      }
      currCnt ++;
      if(currMax == currCnt){
        result++;
        currCnt = 0;
        currMax = -1;
      }
    }

    System.out.println(result);
  }
}
