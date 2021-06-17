/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Cliente;
import models.Usuario;

/**
 *
 * @author amaury
 */
public class UsuarioDB {
    private Connection conn;
    private Conexao conexao = new Conexao();
    private ResultSet rs;
    private PreparedStatement ps;
   
    public ArrayList<Usuario> listarUsuariosAtivos() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        try{
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select id, username, date_format(users.createdAt,'%d/%m/%y às %Hh%i') as createdAt , IsActive from users where IsActive=1;");
            rs = ps.executeQuery();
            
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            
            while(rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setCreatedAt(rs.getString("createdAt"));
                u.setIsActive(rs.getBoolean("IsActive"));
                
                lista.add(u);
            }
            
            ps.close();
            return lista;
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
    }
    
    public ArrayList<Usuario> listarUsuariosInativos() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        try{
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select id, username, date_format(users.createdAt,'%d/%m/%y às %Hh%i') as createdAt , IsActive from users where IsActive=0;");
            rs = ps.executeQuery();
            
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            
            while(rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setCreatedAt(rs.getString("createdAt"));
                u.setIsActive(rs.getBoolean("IsActive"));
                
                lista.add(u);
            }
            
            ps.close();
            return lista;
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
    }
    
    public boolean desativarUsuario(Usuario u) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update users set IsActive=0 where id=?;");
            ps.setInt(1, u.getId());
            ps.executeUpdate();
            
            
            ok = true;
        } catch(Exception e) {
            e.printStackTrace();
            
            ok = false;
        } finally {
            conexao.desconectar();
        }
        
        if(ok) 
            return true;
        
        return false;
    }
    
    public boolean ativarUsuario(Usuario u) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update users set IsActive=1 where id=?;");
            ps.setInt(1, u.getId());
            ps.executeUpdate();
            
            
            ok = true;
        } catch(Exception e) {
            e.printStackTrace();
            
            ok = false;
        } finally {
            conexao.desconectar();
        }
        
        if(ok) 
            return true;
        
        return false;
    }
    
    public Usuario signIn(String username, String password) {
        Usuario user = new Usuario();
        String dbPassword;
        
        try {
            this.conn = conexao.conectar();
//            ps = conn.prepareStatement("select *From users where username=? and password=?");
//            ps.setString(2, user.md5(password));
            ps = conn.prepareStatement("select *From users where username=? and IsActive=1");
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                dbPassword = rs.getString("password");
                boolean ok = user.verifyBcryptHash(password, dbPassword);
                
                if (ok) {
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username")); 
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return user;
    }
    
    
    public Usuario findUserByUsername(String username) {
        Usuario user = new Usuario();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select *From users where username=?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username")); 
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return user;
    }
    
    public boolean inserir(Usuario u) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("insert into users (username, password) values (?,?)");
            ps.setString(1, u.getUsername());
            ps.setString(2, u.bcryptHash(u.getPassword()));
            ps.executeUpdate();
            
            ok = true;
        } catch(Exception e) {
            e.printStackTrace();
            
            ok = false;
        } finally {
            conexao.desconectar();
        }
        
        if(ok) 
            return true;
        
        return false;
    }
    
}
