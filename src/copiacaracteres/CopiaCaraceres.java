/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiacaracteres;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class CopiaCaraceres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("texto11.txt");
            FileReader f2 = new FileReader("texto10.txt");
            int fichleer = 0;
            while ((fichleer = f2.read()) != -1) {
                f1.write(fichleer);
            }
            f1.close();
            f2.close();
        } catch (IOException ex) {
            Logger.getLogger(CopiaCaraceres.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
