
import java.util.ArrayList;
import java.util.List;
// Question 3
// total: 5 points

//===============================================
// todo: complete the following program
//===============================================

public class IteratingExamples_foreach {

      public static int Act2ForEach(List<Integer> integers) {
            int res=0;
            for(int i: integers) {
                  res+=i;
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

