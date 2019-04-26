/*
package ps3b.liblinkedlists;

import java.util.ArrayList;
import java.util.Scanner;

*/
/**
 * Created by jessicasutd on 2017/11/2.
 *//*


*/
/* Class linkedList *//*

class LinkedList2
{
    protected Node start;
    protected Node end ;
    public int size ;

    */
/*  Constructor  *//*

    public LinkedList2()    {
        start = null;
        end = null;
        size = 0;
    }
    */
/*  Function to check if list is empty  *//*

    public boolean isEmpty()
    {
        return start == null;
    }
    */
/*  Function to get size of list  *//*

    public int getSize()
    {
        return size;
    }

    */
/*  Function to insert an element at end (enqueue) *//*

    public void enqueue(int val)
    {
        Node nptr = new Node(val,null);
        size++ ;
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLink(start);
            start = nptr;
        }
    }
    */
/*  Function to dequeue (remove at start)  *//*

    public int dequeue(){
        if(start == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            int a=end.getData();
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return a;
        }

    }
    */
/*  Function to display elements  *//*

    public void display()    {
        System.out.print("\nQueue=");
        if (size == 0)        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null)        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)       {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}


public class Queue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        */
/* Creating object of class linkedList *//*

        LinkedList2 list2 = new LinkedList2();
        //System.out.println("Singly Linked List Test\n");
        char ch;
        */
/*  Perform list operations  *//*

        do        {
            System.out.println("\nQueue Operations\n");
            System.out.println("1. insert at rare (enqueue)");
            System.out.println("2. remove at front (dequeue)");
            System.out.println("3. display queue");
            System.out.println("4. check empty");
            int choice = scan.nextInt();
            switch (choice)            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    list2.enqueue( scan.nextInt() );
                    list2.display();
                    break;
                case 2 :
                    System.out.println("Item dequeued: "+list2.dequeue());
                    list2.display();
                    break;
                case 3 :
                    list2.display();
                    break;
                case 4 :
                    System.out.println("Empty status = "+ list2.isEmpty());
                    list2.display();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            */
/*  Display List  *//*

            //list2.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }





}
*/
