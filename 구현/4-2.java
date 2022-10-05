import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int result = 0;
    for(int i=0; i<=n; i++){
      for(int j=0; j<60; j++){
        for(int k=0; k<60; k++){
          String str = i+""+j+""+k;
          if(str.contains("3")){
            result++;
          }
        }
      }
    }

    System.out.println(result);
  }
}
