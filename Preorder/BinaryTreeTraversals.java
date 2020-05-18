//keperluan untuk class node
import java.util.*;

class node{
    public int data;
    public node left,right;
    public node(){
        data=0;
        left=right=null;
    }
}

//class untuk mengimplementasikan algoritma binary tree transversal

public class BinaryTreeTraversals {

    static Scanner in = new Scanner(System.in);

    static node inputTree() {

        node temp=new node();
        System.out.print("Masukan Angka: ");
        temp.data=in.nextInt();
        
        System.out.print("Ketik y jika simpul "+temp.data+" memiliki subtree kiri: ");

        if(in.next().charAt(0)=='y') {
            temp.left=inputTree();
        }
        else {
            temp.left=null;
        }
        
        System.out.print("Masukan y jika simpul "+temp.data+" memiliki subtree kanan: ");
        
        if(in.next().charAt(0)=='y') {
            temp.right=inputTree();
        }
        else {
            temp.right=null;
        }
        return temp;
    }
    static void inorder(node tree) {
        
        if(tree==null) {
            return;
        }
        inorder(tree.left);
        System.out.print(tree.data+"\t");
        inorder(tree.right);
    }

    static void preorder(node tree) {
        
        if(tree==null) {
            return;
        }
        System.out.print(tree.data+"\t");
        preorder(tree.left);
        preorder(tree.right);
    }

    static void postorder(node tree) {
        
        if(tree==null) {
            return;
        }
        postorder(tree.left);
        postorder(tree.right);
        System.out.print(tree.data+"\t");
    }

    public static void main(String[] args) {

        System.out.println("Masukan binary tree ");
        node tree = new node();
        tree = inputTree();
        System.out.println("Inorder traversal ");
        inorder(tree);
        System.out.println("\nPreorder traversal ");
        preorder(tree);
        System.out.println("\nPostorder traversal ");
        postorder(tree);

    }
}