/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 * Class which acts as the Binary Search Tree (BST). 
 * The class contains a BSTNode as the root and is labeled as such, an int variable named wordCountTotal
 * which keeps track of the total amount of words and an int variable named wordCountUnique that keeps
 * track of the total amount of unique words, and a String variable named outputString which will
 * house the String which will be outputted to a GUI object. There is heavy use of the 
 * BSTNode class, so knowledge of that class is required to understand and use this class.
 * 
 * This class contains the following methods: constructors, insertion, counting, 
 * inOrder traversal, and get.
 * 
 * @author Taylor Johnson
 * @author Manish Bhojasia - http://www.sanfoundry.com/java-program-implement-binary-search-tree/
 */
public class BST {
    private BSTNode root;
    private int wordCountTotal = 0;
    private int wordCountUnique = 0;
    private String outputString;
    
    /**
     * Constructor method.
     * Creates instance of the class with root set to null.
     */
    public BST() {
        root = null;
    }
        
    /**
     * Method which takes a String parameter.
     * Method sets the root variable to the value returned by the 
     * recursive overloaded insert method.
     * 
     * @param data String data desired to be stored in node
     */
    public void insert(String data) {
        root = insert(root, data);
    }
    
    /**
     * Recursive method which takes a BSTNode and String parameter.
     * This is a private method and is only called by the overloaded
     * insert method, which only takes a String parameter. Method checks
     * the current node and creates a BSTNode if no node exists and sets
     * the data of that node to the String parameter provided and ends the method. If the node does
     * exist then it compares the value of the data to the String parameter provided, 
     * if the String value is larger then it makes a recursive call to the right node, 
     * less then makes a recursive call to the left node, if the same value then the node's duplicate variable
     * is incremented and ends the recursive call. The wordCountTotal variable is 
     * placed at the end of the two exit points to count each parameter as it exits.
     * 
     * @param node BSTNode which will house the data
     * @param data STring data which will be stored
     * @return node of data insertion
     */
    private BSTNode insert(BSTNode node, String data) {
        if (node == null) {
            node = new BSTNode(data);
            wordCountTotal += 1;
        }
        else {
            if (data.compareToIgnoreCase(node.getData()) < 0)
                node.left = insert(node.left, data);
            else if (data.compareToIgnoreCase(node.getData()) > 0)
                node.right = insert(node.right, data);
            else {
                node.duplicates += 1;
                wordCountTotal += 1;
            }               
        }
        
        return node;
    }
    
    /**
     * Method which counts the number of nodes in the binary tree. 
     * The method calls the overloaded countNodes method with the root argument.
     * 
     * @return int of number of nodes
     */
    public int countNodes() {
        return countNodes(root);
    }
    
    /**
     * Recursive method which counts the number of nodes in the binary tree. 
     * This method is private and takes a BSTNode parameter from the overloaded countNodes method.
     * Method instantiates a local variable to keep track of the count of nodes.
     * If the node provided is null, then return 0.
     * Otherwise, set count to 1 and recursive call the left and right nodes, 
     * while incrementing the local variable count by the recursive return.
     * 
     * @param node BST root
     * @return int of number of nodes
     */
    private int countNodes(BSTNode node) {
        int count;
        
        if (node == null)
            return 0;
        else
            count = 1;
            count += countNodes(node.getLeft());
            count += countNodes(node.getRight());
            return count;
    }
    
    /**
     * Constructor method which sets the wordCountUnique variable to the 
     * return value of countNodes() and creates the sets the initial values 
     * of the outputString.
     */
    public void constructOutput() {
        wordCountUnique = countNodes();
        outputString = "NUMBER OF WORDS: " + wordCountTotal + 
            "\nNUMBER OF UNIQUE WORDS: " + wordCountUnique + "\n\n";
    }
    
    /**
     * Method which traverses the binary tree in order and sets the outputString for display. 
     * Method calls the constructorOutput method and the overloaded inOrder method.
     */
    public void inOrder() {
        constructOutput();
        inOrder(root);
    }
    
    /**
     * Recursive method which traverses the binary tree in order and sets
     * the data of each node, along with its duplicate variable in the outputString
     * variable. This method is private and can only be used by the overloaded inOrder method.
     * The method takes a BSTNode parameter. If the node exists then it checks the left node recursively.
     * The output string is populated with relevant data and information.
     * The right node is then checked recursively.
     * 
     * @param node BSTNode root
     */
    private void inOrder(BSTNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            outputString += node.getData() + ": duplicates - " + node.duplicates + "\n";
            inOrder(node.getRight());
        }
    }
    
    /**
     * Return the outputString.
     * 
     * @return outputString containing results of binary tree in order traversal
     */
    public String getOutputString() {
        return outputString;
    }
}
