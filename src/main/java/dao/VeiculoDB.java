/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Veiculo;

/**
 *
 * @author jvito
 */
public class VeiculoDB {
    private Connection conn;
    private Conexao conexao = new Conexao();
    private ResultSet rs;
    private PreparedStatement ps;
    
    public ArrayList<Veiculo> readAll(){
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select * from veiculo");
            rs = ps.executeQuery();
            
            ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
            
            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setIdVeiculo(rs.getInt("idVeiculo"));
                v.setModelo(rs.getString("Modelo"));
                v.setCor(rs.getString("Cor"));
                v.setPlaca(rs.getString("Placa"));
                v.setDescricao(rs.getString("Descricao"));
                v.setChassi(rs.getString("Chassi"));
                v.setFabricante(rs.getString("Fabricante"));
                v.setAno(rs.getInt("Ano"));
                v.setIsActive(rs.getBoolean("IsActive"));
                v.setDisponibilidade(rs.getBoolean("Disponibilidade"));
                
                lista.add(v);
                
            }
            
            ps.close();
            return lista;
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
        
    }
    
    public ArrayList<Veiculo> listarVeiculosAtivos(){
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select * from veiculo where IsActive=1");
            rs = ps.executeQuery();
            
            ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
            
            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setIdVeiculo(rs.getInt("idVeiculo"));
                v.setModelo(rs.getString("Modelo"));
                v.setCor(rs.getString("Cor"));
                v.setPlaca(rs.getString("Placa"));
                v.setDescricao(rs.getString("Descricao"));
                v.setChassi(rs.getString("Chassi"));
                v.setFabricante(rs.getString("Fabricante"));
                v.setAno(rs.getInt("Ano"));
                v.setDisponibilidade(rs.getBoolean("Disponibilidade"));
                
                lista.add(v);
                
            }
            
            ps.close();
            return lista;
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
        
    }
    
    public ArrayList<Veiculo> listarVeiculosInativos(){
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select * from veiculo where IsActive=0");
            rs = ps.executeQuery();
            
            ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
            
            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setIdVeiculo(rs.getInt("idVeiculo"));
                v.setModelo(rs.getString("Modelo"));
                v.setCor(rs.getString("Cor"));
                v.setPlaca(rs.getString("Placa"));
                v.setDescricao(rs.getString("Descricao"));
                v.setChassi(rs.getString("Chassi"));
                v.setFabricante(rs.getString("Fabricante"));
                v.setAno(rs.getInt("Ano"));
                v.setDisponibilidade(rs.getBoolean("Disponibilidade"));
                
                lista.add(v);
                
            }
            
            ps.close();
            return lista;
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
        
    }
    
    public ArrayList<Veiculo> listarVeiculosDisponiveis(){
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select * from veiculo where Disponibilidade=1 and IsActive=1");
            rs = ps.executeQuery();
            
            ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
            
            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setIdVeiculo(rs.getInt("idVeiculo"));
                v.setModelo(rs.getString("Modelo"));
                v.setCor(rs.getString("Cor"));
                v.setPlaca(rs.getString("Placa"));
                v.setDescricao(rs.getString("Descricao"));
                v.setChassi(rs.getString("Chassi"));
                v.setFabricante(rs.getString("Fabricante"));
                v.setAno(rs.getInt("Ano"));
                v.setDisponibilidade(rs.getBoolean("Disponibilidade"));
                
                lista.add(v);
                
            }
            
            ps.close();
            return lista;
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
        
    }
    
    public ArrayList<Veiculo> listarVeiculosIndisponiveis(){
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("select * from veiculo where Disponibilidade=0 and IsActive=1");
            rs = ps.executeQuery();
            
            ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
            
            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setIdVeiculo(rs.getInt("idVeiculo"));
                v.setModelo(rs.getString("Modelo"));
                v.setCor(rs.getString("Cor"));
                v.setPlaca(rs.getString("Placa"));
                v.setDescricao(rs.getString("Descricao"));
                v.setChassi(rs.getString("Chassi"));
                v.setFabricante(rs.getString("Fabricante"));
                v.setAno(rs.getInt("Ano"));
                v.setDisponibilidade(rs.getBoolean("Disponibilidade"));
                
                lista.add(v);
                
            }
            
            ps.close();
            return lista;
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
        
    }
    
    public boolean inserir(Veiculo v) {
        boolean ok;
        
            try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("insert into veiculo (Modelo, Cor, Placa, Descricao, Chassi, Fabricante, Ano) values (?,?,?,?,?,?,?)");
            
            ps.setString(1, v.getModelo());
            ps.setString(2, v.getCor());
            ps.setString(3, v.getPlaca());
            ps.setString(4, v.getDescricao());
            ps.setString(5, v.getChassi());
            ps.setString(6, v.getFabricante());
            ps.setInt(7, v.getAno());
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
    
    public boolean alterar(Veiculo v) {
        boolean ok;
        
            try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update veiculo set Modelo=? , Cor=? , Placa=?, Descricao=?, Chassi=?, Fabricante=?, Ano=? where idVeiculo=?;");
            
            ps.setString(1, v.getModelo());
            ps.setString(2, v.getCor());
            ps.setString(3, v.getPlaca());
            ps.setString(4, v.getDescricao());
            ps.setString(5, v.getChassi());
            ps.setString(6, v.getFabricante());
            ps.setInt(7, v.getAno());
            ps.setInt(8, v.getIdVeiculo());
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
    
    public boolean excluir (Veiculo v) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("delete from veiculo where idVeiculo=?;");
            ps.setInt(1, v.getIdVeiculo());
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
    
    public boolean ativarVeicculo(Veiculo v) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update veiculo set IsActive=1 where idVeiculo=?;");
            ps.setInt(1, v.getIdVeiculo());
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
    
    public boolean desativarVeiculo(Veiculo v) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update veiculo set IsActive=0 where idVeiculo=?;");
            ps.setInt(1, v.getIdVeiculo());
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
