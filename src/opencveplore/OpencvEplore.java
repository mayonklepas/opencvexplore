/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opencveplore;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.opencv.core.Core;

/**
 *
 * @author mulyadi
 */
public class OpencvEplore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MainFrame mf = new MainFrame();
            mf.setLocationRelativeTo(null);
            mf.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(OpencvEplore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
