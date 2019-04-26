/*
package ps3b.liblinkedlists;

*/
/**
 * Created by jessicasutd on 2017/11/2.
 *//*

import java.util.ArrayList;
import java.util.Scanner;
*/
/* Class linkedList *//*

class LinkedList1
{
    protected Node start;
    protected Node end ;
    public int size ;

    */
/*  Constructor  *//*

    public LinkedList1()    {
        start = null;
        end = null;
        size = 0;
    }
    */
/*  Function to check if list is empty  *//*

    public boolean isEmpty()
    {
        return size==0;
    }
    */
/*  Function to get size of list  *//*

    public int getSize()
    {
        return size;
    }
    */
/*  Function to insert an element at end (push) *//*

    public void push(int val)
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
            end.setLink(nptr);
            end = nptr;
        }
    }

    public int top() {
        return end.getData();
    }

    public int pop() {
        if(size==0) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
        Node s = start;
        Node t = start;
        while (s != end)
        {
            t = s;
            s = s.getLink();
        }
        int a =s.getData();
        end = t;
        end.setLink(null);
        size --;
        return a;
    }}

    */
/*  Function to display elements  *//*

    public void display()    {
        System.out.print("\nStack = ");
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




public class Stack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        */
/* Creating object of class ArrayList *//*

        LinkedList1 stack=new LinkedList1();
        char ch;
        */
/*  Perform list operations  *//*

        do {
            System.out.println("\nStack Operations\n");
            System.out.println("1. Push");
            System.out.println("2. Top");
            System.out.println("3. Pop");
            System.out.println("4. Check empty");
            System.out.println("5. Display stack");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to push");
                    stack.push(scan.nextInt());
                    stack.display();
                    break;
                case 2:
                    //System.out.println("Enter integer element to insert");
                    System.out.println("top of stack = "+stack.top());
                    break;
                case 3:
                    System.out.println("item popped = " + stack.pop());
                    stack.display();
                    break;
                case 4:
                    if (stack.isEmpty()) System.out.println("Stack is empty");
                    else System.out.println("Stack is not empty");
                    break;
                case 5:
                    if (stack.isEmpty()) System.out.println("Stack is empty");
                    else stack.display();
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');

    }





}
*/
