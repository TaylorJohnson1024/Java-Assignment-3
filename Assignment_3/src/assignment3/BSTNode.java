/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Taylor Johnson, Manish Bhojasia @ http://www.sanfoundry.com/java-program-implement-binary-search-tree/
 */
public class BSTNode {
    private String data;
    protected BSTNode left, right;
    protected int duplicates = 0;
    
    /**
     * 
     */
    public BSTNode() {
        data = null;
        left = null;
        right = null;
    }
    
    /**
     * 
     * @param word 
     */
    public BSTNode(String word) {
        data = word;
        left = null;
        right = null;
    }
    
    /**
     * 
     * @param node 
     */
    public void setLeft(BSTNode node) {
        left = node;
    }
    
    /**
     * 
     * @param node 
     */
    public void setRight(BSTNode node) {
        right = node;
    }
    
    /**
     * 
     * @return left
     */
    public BSTNode getLeft() {
        return left;
    }
    
    /**
     * 
     * @return right
     */
    public BSTNode getRight() {
        return right;
    }
    
    /**
     * 
     * @param word 
     */
    public void setData(String word) {
        data = word;
    }
    
    /**
     * 
     * @return 
     */
    public String getData() {
        return data;
    }
}
