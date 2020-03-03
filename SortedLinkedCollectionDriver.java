//driver class for SortedLinkedCollection<T>

import ch05.collections.*;
import support.LLNode;

public class SortedLinkedCollectionDriver {

   public static void main(String[] args ) {
      SortedLinkedCollection myList = new SortedLinkedCollection();
      
      System.out.println(myList);
      
      myList.add(100);
      myList.add(22);
      myList.add(350);
      myList.add(45);
      myList.add(55);
      myList.add(1050);
      myList.add(225);
      myList.add(35);
      myList.add(451);
      myList.add(559);
      
      
//       int minNum = 5;
//       int maxNum = 10;
//       for(int i=0; i < maxNum; i++) {
//          myList.add(i*i);
//       }

      System.out.println("\nThe Sorted List contains:  ");
      System.out.println(myList);  
   }
}