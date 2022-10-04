import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int result = 0;

    while(n != 1){
      if(n%k == 0){
        n /= k;
      }else{
        n -= 1;
      }

      result += 1;
    }

    System.out.println(result);
  }
}
