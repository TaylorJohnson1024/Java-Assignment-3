/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 * Class which acts as the node for the binary tree (BSTNode). It contains String data
 * housed in the data variable. Connections to other nodes are housed in the 
 * left and right variables. A variable named duplicates counts the number
 * of occurrences of the string data within the assignment file for the project, 
 * this variable will be used primarily in the BST class.
 * 
 * Class methods include constructors, gets, and sets.
 * 
 * @author Taylor Johnson
 * @author Manish Bhojasia - http://www.sanfoundry.com/java-program-implement-binary-search-tree/
 */
public class BSTNode {
    private String data;
    protected BSTNode left, right;
    protected int duplicates = 0;
    
    /**
     * Constructor method. Creates instance of the class with data, left, and
     * right set to null.
     */
    public BSTNode() {
        data = null;
        left = null;
        right = null;
    }
    
    /**
     * Constructor method which takes a String parameter. Creates instance of
     * the class with data set to the word parameter and sets left and right
     * to null.
     * 
     * @param word String data housed in the node
     */
    public BSTNode(String word) {
        data = word;
        left = null;
        right = null;
    }
    
    /**
     * Set method which takes a BSTNode parameter. 
     * Sets the left variable to the BSTNode parameter provided.
     * 
     * @param node BSTNode which will have a node set to the left of it
     */
    public void setLeft(BSTNode node) {
        left = node;
    }
    
    /**
     * Set method which takes a BSTNode parameter. 
     * Sets the right variable to the BSTNode parameter provided.
     * 
     * @param node BSTNode which will have a node set to the right of it
     */
    public void setRight(BSTNode node) {
        right = node;
    }
    
    /**
     * Set method which takes a String parameter.
     * Sets the data variable to the String parameter provided.
     * 
     * @param word String data which will be set in the node
     */
    public void setData(String word) {
        data = word;
    }
    
    /**
     * Get method.
     * Returns the left BSTNode.
     * 
     * @return left
     */
    public BSTNode getLeft() {
        return left;
    }
    
    /**
     * Get method.
     * Returns the right BSTNode.
     * 
     * @return right
     */
    public BSTNode getRight() {
        return right;
    }
    
    
    /**
     * Get method.
     * Returns the data housed within the node.
     * 
     * @return data
     */
    public String getData() {
        return data;
    }
}
