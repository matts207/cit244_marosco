
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matts207
 */
public class EncryptAndCreateFile implements Encrypt {
    private String hashedtext;
    private String fileName;
    
    
 
    /**
     *
     * @param plaintext
     */
    @Override
    public void encryptmd5(String plaintext){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] messageba = md5.digest(plaintext.getBytes());
            BigInteger bi = new BigInteger(1, messageba);
            hashedtext = bi.toString(16);
            while(hashedtext.length() < 32){
                hashedtext = "0" + hashedtext;
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(md5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHashedText(){
        return this.hashedtext;
    }
    
    public void writeToFile() throws IOException{
        try (FileWriter file = new FileWriter(this.fileName)) {
            file.write(this.hashedtext);
            file.close();
        }
    }
    
    public void setFileName(String filename){
        this.fileName = filename;
    }
    
    public String getFileName(){
        return this.fileName;
    }
}
