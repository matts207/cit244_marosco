/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matts207
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class md5 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "I want tofucking sleep!!!%";
        try {
            MessageDigest digestedmessage = MessageDigest.getInstance("SHA-256");
            digestedmessage.update(message.getBytes());
            
            byte[] digest = digestedmessage.digest();
            
            StringBuffer hexsb = new StringBuffer();
            for (int i = 0;i<digest.length;i++) {
                hexsb.append(Integer.toHexString(0xFF & digest[i]));
             }
            System.out.println("HASH: " + hexsb.toString());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(md5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
