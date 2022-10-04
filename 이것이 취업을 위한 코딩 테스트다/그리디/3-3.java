import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int result = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
      int min = Integer.MAX_VALUE;
      for(int j=0; j<m; j++){
        int num = scanner.nextInt();
        if( min > num){
          min = num;
        }
      }
      if(result < min){
        result = min;
      }
    }

    System.out.println(result);
  }
}
