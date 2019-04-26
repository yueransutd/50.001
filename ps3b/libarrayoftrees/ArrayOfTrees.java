package PARTB.ps3b.libarrayoftrees;

/**
 * Created by jessicasutd on 2017/11/4.
 */
class Node{
    String data;
    Node left;
    Node right;
    public Node(String data){
        this.data = data;
        left = null;
        right = null;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
public class ArrayOfTrees {

    Node[] nodess = new Node[26];
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public ArrayOfTrees() {
        this.nodess=nodess;
    }

    public void editString(String string) {
        if (!Character.isLetter(string.charAt(0))) return;
        string = string.replaceAll("[^a-zA-Z \\-]", "");
        for (String word : string.split(" ")) insert(word);
    }


    public void insert2(String inp, Node node) {
        Node newNode = new Node(inp);
        if (inp.equals(node.data) && node.left != null) {
            insert2(inp, node.left);
        }
        else if (inp.equals(node.data) && node.left == null) {
            node.setLeft(newNode);
        }
        else if (node.right == null) {
            node.setRight(newNode);
        }
        else insert2(inp, node.right);
    }

    public void insert(String inp) {
        int i=alphabet.indexOf(Character.toLowerCase(inp.charAt(0)));
        if (nodess[i] == null) {
            nodess[i] = new Node(inp);
        }
        else {
            insert2(inp, nodess[i]);
        }
    }

    public String traversal(Node node){
        int c = 0;
        Node node2 = node;
        if(node!=null){
            while (node2 != null) {
                node2 = node2.left;
                c++;
            }
            return node.data + "("+c+")" + traversal(node.right);
        }
        return "";
    }

    public static void main(String[] args) {
        ArrayOfTrees tr=new ArrayOfTrees();
        String s="This is a piece of text from which hopefully you will make some trees.";
        tr.editString(s);
        for(Node node: tr.nodess) {
            if(node!= null) System.out.println("Inorder Traversal: " + tr.traversal(node));
        }


    }



}
