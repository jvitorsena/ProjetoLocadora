/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.mindrot.jbcrypt.BCrypt;


/**
 *
 * @author amaury
 */
public class Usuario {
    private int id;
    private String username, password, createdAt;
    private boolean IsActive;
    
    public Usuario() {
        
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String md5(String senha){  
      String sen = "";  
      MessageDigest md = null;  
      try {  
         md = MessageDigest.getInstance("MD5");  
         BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));  
         sen = hash.toString(16);           
      } catch (NoSuchAlgorithmException e) {  
          e.printStackTrace();  
       }       
      return sen;  
    }
    
    public String bcryptHash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public boolean verifyBcryptHash(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }

    /**
     * @return the createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the IsActive
     */
    public boolean isIsActive() {
        return IsActive;
    }

    /**
     * @param IsActive the IsActive to set
     */
    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }
}
