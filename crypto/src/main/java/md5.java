/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matts207
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
public class md5 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
//        try {
            //        String message = "I want tofucking sleep!!!%";
//        try {
//            MessageDigest digestedmessage = MessageDigest.getInstance("SHA-256");
//            digestedmessage.update(message.getBytes());
//            
//            byte[] digest = digestedmessage.digest();
//            
//            StringBuffer hexsb = new StringBuffer();
//            for (int i = 0;i<digest.length;i++) {
//                hexsb.append(Integer.toHexString(0xFF & digest[i]));
//             }
//            System.out.println("HASH: " + hexsb.toString());
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(md5.class.getName()).log(Level.SEVERE, null, ex);
//          }
        EncryptAndCreateFile f = new EncryptAndCreateFile();
        f.encryptmd5("HELLO".getBytes());
        f.setFileName("ciphertext2.txt");
        f.writeToFile();
            
        GuiReal n = new GuiReal();
        n.runGui();
            
            
    }
    
    /**
     *
     * @param pt
     * @return
     * @throws NoSuchAlgorithmException
     * @throws NoSuchPaddingException
     * @throws InvalidKeyException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public static String encrypt(String pt) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
        String ciphertext = "";

        try {
            KeyGenerator kg = KeyGenerator.getInstance("AES");
            kg.init(128);
            SecretKey sk = kg.generateKey();
            System.out.println(sk.toString());
            
            byte[] ptba = pt.getBytes("UTF8");
            
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, sk);
            byte[] ct = cipher.doFinal(ptba);
            
            for(byte b: ct){
                ciphertext += b;
                System.out.println(b);
            }
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(md5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ciphertext;

    }
    
    
}
