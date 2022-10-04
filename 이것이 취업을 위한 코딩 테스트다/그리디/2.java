import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();

    int result = Character.getNumericValue(str.charAt(0));

    for(int i=1; i<str.length(); i++){
      int num = Character.getNumericValue(str.charAt(i));
      if(result + num >= result * num){
        result += num;
      }else{
        result *= num;
      }
      
    }
    System.out.println(result);
  }
}
