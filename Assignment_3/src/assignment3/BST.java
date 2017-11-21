/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Taylor, Manish Bhojasia @ http://www.sanfoundry.com/java-program-implement-binary-search-tree/
 */
public class BST {
    private BSTNode root;
    private int wordCountTotal = 0;
    private int wordCountUnique = 0;
    private String outputString;
    
    /**
     * 
     */
    public BST() {
        root = null;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isEmpty() {
        return root == null;
    }
    
    /**
     * 
     * @param data 
     */
    public void insert(String data) {
        root = insert(root, data);
    }
    
    /**
     * 
     * @param node
     * @param data
     * @return 
     */
    private BSTNode insert(BSTNode node, String data) {
        if (node == null)
            node = new BSTNode(data);
        else {
            if (data.compareToIgnoreCase(node.getData()) < 0)
                node.left = insert(node.left, data);
            else if (data.compareToIgnoreCase(node.getData()) < 0)
                node.right = insert(node.right, data);
            else
                node.duplicates += 1;
        }
        
        wordCountTotal += 1;
        return node;
    }
    
    /**
     * 
     * @return 
     */
    public int countNodes() {
        return countNodes(root);
    }
    
    /**
     * 
     * @param node
     * @return 
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
     * 
     */
    public void constructOutput() {
        wordCountUnique = countNodes();
        outputString = "NUMBER OF WORDS: " + wordCountTotal + 
            "\nNUMBER OF UNIQUE WORDS: " + wordCountUnique + "\n\n";
    }
    
    /**
     * 
     */
    public void inOrder() {
        constructOutput();
        inOrder(root);
    }
    
    /**
     * 
     * @param node 
     */
    private void inOrder(BSTNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            outputString += node.getData() + ": duplicates - " + node.duplicates + "\n";
            inOrder(node.getRight());
        }
    }
    
    /**
     * 
     * @return 
     */
    public String getOutputString() {
        return outputString;
    }
}
