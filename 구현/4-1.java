import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int x = 1;
    int y = 1;
    
    for(int i=0; i<=n; i++){
      String str = scanner.next();
      if(str.equals("L")){
        if(x > 1) x--;
      }else if(str.equals("R")){
        if(x < 5) x++;
      }else if(str.equals("U")){
        if(y > 1) y--;
      }else if(str.equals("D")){
        if(y < 5) y++;
      }
      
    }

    System.out.println(y + " " + x);
    

    
  }
}
