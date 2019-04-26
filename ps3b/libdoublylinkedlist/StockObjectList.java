package ps3b.libdoublylinkedlist;

import java.util.Scanner;

/**
 * Created by jessicasutd on 2017/11/4.
 */

/*  Class Node  */
class Node4  {
    protected String name;
    protected Node4 next, prev;

    /* Constructor */
    public Node4()     {
        next = null;
        prev = null;
        name = "";
    }
    /* Constructor */
    public Node4(String s, Node4 n, Node4 p)    {
        name = s;
        next = n;
        prev = p;
    }
    /* Function to set link to next node */
    public void setLinkNext(Node4 n)    {
        next = n;
    }
    /* Function to set link to previous node */
    public void setLinkPrev(Node4 p)    {
        prev = p;
    }
    /* Funtion to get link to next node */
    public Node4 getLinkNext()    {
        return next;
    }
    /* Function to get link to previous node */
    public Node4 getLinkPrev()    {
        return prev;
    }
    /* Function to set data to node */
    public void setData(String s)    {
        name = s;
    }
    /* Function to get data from node */
    public String getData()    {
        return name;
    }
}

class LinkedList3 {
    protected Node4 start;
    protected Node4 end ;
    public int size;

    /* Constructor */
    public LinkedList3()    {
        start = null;
        end = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()     {
        return start == null;
    }
    /* Function to get size of list */
    public int getSize()     {
        return size;
    }
    /* Function to insert element at begining */
    /*public void insertAtStart(String val)    {
        Node4 nptr = new Node4(val, null, null);

        start.setLinkPrev(nptr);
        nptr.setLinkNext(start);
        start = nptr;

        size++;
    }*/
    /* Function to insert element at end *//*
    public void insertAtEnd(String val)    {
        Node4 nptr = new Node4(val, null, null);

        nptr.setLinkPrev(end);
        end.setLinkNext(nptr);
        end = nptr;

        size++;
    }

    /* Function to insert element */
    public void enterObject(String val) {
        Node4 nptr = new Node4(val, null, null);
        if (start == null) {
            start = nptr;
            end = start;

        }
        else {

            Node4 ptr = start;
            if (val.length() <= ptr.getData().length()) {
                ptr.setLinkPrev(nptr);
                nptr.setLinkNext(ptr);
                start = nptr;
            } else {
                while (ptr != null && val.length() > ptr.getData().length()) {
                    ptr = ptr.getLinkNext();
                }
                if(ptr!=null) {
                    Node4 temp=ptr.getLinkPrev();
                    temp.setLinkNext(nptr);
                    nptr.setLinkPrev(temp);
                    nptr.setLinkNext(ptr);
                    ptr.setLinkPrev(nptr);
                }
                else {
                    end.setLinkNext(nptr);
                    nptr.setLinkPrev(end);
                    end = nptr;
                }
            }
        }
        size++;
    }

    public String displayObject(int pos) {
        pos=pos-1;
        Node4 ptr=start;
        for(int i=0;i<size;i++){
            if(pos==i){
                return ptr.getData();
            }else{
                ptr=ptr.getLinkNext();
            }
        }
        return null;
    }

    public void dumpObjects() {
        System.out.print("\nStock Object List = ");
        if (size == 0)        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null)        {
            System.out.println(start.getData()+" Header"+": "+start.getData().length());
            return;
        }
        Node4 ptr=start;
        System.out.print(start.getData()+ " Header: "+ptr.getData().length()+" <-> ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext()!= null)        {
            System.out.print(ptr.getData()+ " Header: "+ptr.getData().length()+ " <-> ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+" Header: "+ptr.getData().length()+ "\n");
    }

}



public class StockObjectList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of linkedList */
        LinkedList3 list = new LinkedList3();
        //System.out.println("Doubly Linked List Test\n");
        char ch;
        /*  Perform list operations  */
        do        {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. enter an object");
            System.out.println("2. print out object at a specific position");
            System.out.println("3. print out all objects");
            System.out.println("4. check empty");


            int choice = scan.nextInt();
            switch (choice)            {
                case 1 :
                    System.out.println("Enter a string to insert");
                    list.enterObject( scan.next() );
                    break;
                case 2 :
                    System.out.println("Print the obeject at position:");
                    System.out.println(list.displayObject( scan.nextInt()) );

                    break;
                case 3 :
                    System.out.println("Print out all objects");
                    list.dumpObjects();
                    break;
                case 4 :
                    System.out.println("Empty status = "+list.isEmpty());
                    break;

                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            //list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');
    }

}
