/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author KRISHNA
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if ((new File("C:\\Krishna\\Krishna\\App\\Bills"+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler C:\\Krishna\\Krishna\\App\\Bills"+id+".pdf");
            }
            else
                JOptionPane.showMessageDialog(null, "File is not Exist");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
