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

/**
 *
 * @author amaury
 */
public class ClienteDB {
    private Connection conn;
    private Conexao conexao = new Conexao();
    private ResultSet rs;
    private PreparedStatement ps;
    
    
//    public ArrayList<Cliente> findAll() {
    
    
    public ArrayList<Cliente> listarClientesAtivos() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select * from cliente where IsActive=1");
            rs = ps.executeQuery();
            
            ArrayList<Cliente> lista = new ArrayList<Cliente>();

            
            while(rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getString("CPF"));
                c.setEndereco(rs.getString("Endereco"));
                c.setTelefone(rs.getString("Telefone"));
                c.setEmail(rs.getString("Email"));
                c.setCNH(rs.getString("CNH"));
                c.setIsActive(rs.getBoolean("IsActive"));

                lista.add(c);
                
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
    
    public ArrayList<Cliente> listarClientesInativos() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select * from cliente where IsActive=0");
            rs = ps.executeQuery();
            
            ArrayList<Cliente> lista = new ArrayList<Cliente>();
            
            
            
//            String cliente = rs.getString("Nome");
//            System.out.println(cliente);
            
            while(rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getString("CPF"));
                c.setEndereco(rs.getString("Endereco"));
                c.setTelefone(rs.getString("Telefone"));
                c.setEmail(rs.getString("Email"));
                c.setCNH(rs.getString("CNH"));

                lista.add(c);
                
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
    
    public boolean inserir(Cliente c) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("insert into cliente (Nome, CPF, Endereco, Telefone, Email, CNH) values (?,?,?,?,?,?)");
            ps.setString(1, c.getNome());
            
            
            String CPF_pos1 = c.getCPF().substring(0,3);
            String CPF_pos2 = c.getCPF().substring(4,7);
            String CPF_pos3 = c.getCPF().substring(8,11);
            String CPF_pos4 = c.getCPF().substring(12);     
            String CPF = CPF_pos1 + CPF_pos2 + CPF_pos3 + CPF_pos4;
            
            String Telefone_pos1 = c.getTelefone().substring(1,3);
            String Telefone_pos2 = c.getTelefone().substring(5,6);
            String Telefone_pos3 = c.getTelefone().substring(7,11);
            String Telefone_pos4 = c.getTelefone().substring(12);
            String Telefone = Telefone_pos1 + Telefone_pos2 + Telefone_pos3 + Telefone_pos4;
            
            ps.setString(2, CPF);
            ps.setString(3, c.getEndereco());
            ps.setString(4, Telefone);
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getCNH());
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
    
    public boolean alterar(Cliente c){ 
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update cliente set Nome=? , CPF=? , Endereco=?, Telefone=?, Email=?, CNH=? where idCliente=?;");
            
            ps.setString(1, c.getNome());
            
            
            String CPF_pos1 = c.getCPF().substring(0,3);
            String CPF_pos2 = c.getCPF().substring(4,7);
            String CPF_pos3 = c.getCPF().substring(8,11);
            String CPF_pos4 = c.getCPF().substring(12);     
            String CPF = CPF_pos1 + CPF_pos2 + CPF_pos3 + CPF_pos4;
            
            String Telefone_pos1 = c.getTelefone().substring(1,3);
            String Telefone_pos2 = c.getTelefone().substring(5,6);
            String Telefone_pos3 = c.getTelefone().substring(7,11);
            String Telefone_pos4 = c.getTelefone().substring(12);
            String Telefone = Telefone_pos1 + Telefone_pos2 + Telefone_pos3 + Telefone_pos4;
            
            ps.setString(2, CPF);
            ps.setString(3, c.getEndereco());
            ps.setString(4, Telefone);
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getCNH());
            

            ps.setInt(7, c.getIdCliente());
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
    
    public boolean excluir(Cliente c){ 
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("delete from cliente where idCliente=?;");
            ps.setInt(1, c.getIdCliente());
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
    
    public boolean ativarCliente(Cliente c) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update cliente set IsActive=1 where idCliente=?;");
            ps.setInt(1, c.getIdCliente());
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
    
        public boolean desativarCliente(Cliente c) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update cliente set IsActive=0 where idCliente=?;");
            ps.setInt(1, c.getIdCliente());
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
