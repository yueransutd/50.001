import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Question 2
// total: 5 points

//===============================================
// todo: complete the following program
//===============================================

public class IteratingExamples_iterator {

   public static int Act2Iterator(List<Integer> integers) {

       int res=0;
       Iterator<Integer> i=integers.iterator();
       for(;i.hasNext();) {
           res+=i.next();
       }
       return res;

  }
}




//===============================================
// test case
//===============================================

/*

Input: (1, 2, 3, 4, 5)

Expected Output: 15

Input: (1, 2, 3, 4, 5, 10)

Expected Output: 25

Input: (1, 10, 100)

Expected Output: 111

*/

