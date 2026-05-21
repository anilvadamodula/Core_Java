package ArrayList;

import java.util.ArrayList;

public class Program1 {
      public static void main(String args[]){
          ArrayList<Integer> arr = new ArrayList<>();
          arr.add(10);
          arr.add(20);
          arr.add(30);
          arr.add(40);
          arr.add(50);

          for(Integer it : arr)
          {
              System.out.print(it+" ");
          }
      }
}
