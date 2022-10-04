import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int result;
    int n = scanner.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    int target = 1;
    for(int i=0; i<n; i++){
      list.add(scanner.nextInt());  
    }

    Collections.sort(list);

    for(int data : list){
      if(target < data){
        break;
      }

      target+=data;
    }

    System.out.println(target);
  }
}
