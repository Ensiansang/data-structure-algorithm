package datastructures.tree;

public class Main {

        public static void main(String[] args) {
                BinarySearchTree myTree = new BinarySearchTree();
                myTree.Insert(47);
                myTree.Insert(21);
                myTree.Insert(76);
                myTree.Insert(18);
                myTree.Insert(27);
                myTree.Insert(52);
                myTree.Insert(82);

//                myTree.Insert(27);

                System.out.println(myTree.Contains(82));
                System.out.println(myTree.Contains(57));

//                System.out.println(myTree.root.left.right.value);

              //  System.out.println("root = "+ myTree.root);
        }



}
