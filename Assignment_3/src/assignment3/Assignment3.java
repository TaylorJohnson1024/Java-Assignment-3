package assignment3;

import javax.swing.JDialog;

/**
 * Main file.
 * 
 * @author Taylor Johnson
 */
public class Assignment3 {

    private static BinaryForm myFrame;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        instantiateGUI();
    }
    
    /**
     * Instantiates GUI.
     */
    private static void instantiateGUI() {
        myFrame = new BinaryForm();
        myFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        myFrame.pack();
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }
}
