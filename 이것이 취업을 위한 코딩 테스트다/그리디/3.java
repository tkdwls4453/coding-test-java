import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();

    int allZero = 0;
    int allOne = 0;

    if(str.charAt(0) == '0'){
      allZero++;
    }else{
      allOne++;
    }
    // 전부 0으로
    for(int i=1; i<str.length(); i++){
      if(str.charAt(i) == '1' && str.charAt(i-1) == '0'){
        allZero++;
      }
    }

    // 전부 1로 
    for(int i=1; i<str.length(); i++){
      if(str.charAt(i) == '0' && str.charAt(i-1) == '1'){
        allOne++;
      }
    }

    System.out.println(Math.min(allZero, allOne));
  }
}
