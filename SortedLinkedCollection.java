// create a new collection class that named SortedLinkedCollection<T> that implements a collection using a sorted linked list.
// include a toString method and test driver application.

import ch05.collections.*;
import support.LLNode;

public class SortedLinkedCollection<T> extends LinkedCollection<T>  {
   
   // Adds element to this collection.
   public boolean add(T element)
   {
      LLNode<T> newNode = new LLNode<T>(element);
      LLNode<T> currNode = head;
      int compare;
      
      if ( this.isEmpty() ) {
         head = newNode;
         numElements++;
         
      } else {
         while (currNode != null) {
            compare = Integer.compare((int)newNode.getInfo(), (int)currNode.getInfo());
   
            // if they're equal attach to currNode
            if (compare == 0) {
               newNode.setLink(currNode.getLink());
               currNode.setLink(newNode);
               numElements++;
               break;

            // if less than, attach to previous
            } else if (compare < 0) {
               newNode.setLink(currNode);
               if (previous == null) {
                  head = newNode;
               } else {
                  previous.setLink(newNode);
               }
               numElements++;
               break;

            // if there's no child and it's greater than, attach to currNode 
            } else if (currNode.getLink() == null) {
               currNode.setLink(newNode);
               break;
            }
            previous = currNode;
            currNode = currNode.getLink();
         }
      }
      return true;
   }

   //to String method to create and return a string that represents the current queue
   public String toString() {
      String result = "";
      if (isEmpty()) {
         return "The List is empty.";
      }  
      LLNode<T> currNode = head;
       
       while(currNode != null){
         result += currNode.getInfo().toString() + ", ";
         currNode = currNode.getLink();
      }
      return result;
   }
}