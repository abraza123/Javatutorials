// This Java file was made by: Abdul and Omran.

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMap_Test {

   public static void main(String args[]) {

      System.out.println("Which numbers are even?  Let's find out!\n");

      /* Here we declare our HashMap, iseven. */
     HashMap <Integer,Boolean> iseven = new HashMap <Integer,Boolean>();

      /* Here we add elements to our HashMap iseven. */
      iseven.put(3, false);
      iseven.put(8, true);
      iseven.put(45, false);
      iseven.put(84, true);
      iseven.put(100, true);

      /* Here we display our content using Iterator. */
      Set set = iseven.entrySet();
      Iterator iterator = set.iterator();
      while (iterator.hasNext()) {
         Map.Entry mapentry = (Map.Entry)iterator.next();
         System.out.print("Key is "+ mapentry.getKey() + " and value is ");
         System.out.println(mapentry.getValue() + ".\n");
      }

      /* Here we get values based on key. */
      Boolean getBool = iseven.get(45);
      int exkey = 45;
      System.out.println("It's " + iseven.get(exkey) + " that " + exkey + " is even.\n");

      /* Here we remove values based on key. */
      iseven.remove(100);
      System.out.println("Map key and values after removal: \n");
      iterator = set.iterator(); 
      while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry)iterator.next();
          System.out.print("Key is "+ mapentry.getKey() + " and value is ");
         System.out.println(mapentry.getValue() + ".\n"); 
         

      }
   
   }
}
