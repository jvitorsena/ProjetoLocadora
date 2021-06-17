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
import models.Aluguel;
import models.Cliente;
import models.Veiculo;

/**
 *
 * @author jvito
 */
public class AluguelDB {
    private Connection conn;
    private Conexao conexao = new Conexao();
    private ResultSet rs;
    private PreparedStatement ps;
    
    public ArrayList<Aluguel> listarAlugueis() {
        ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement(""
                                     + "select"
                                            + " date_format(aluguel.DtDevolucao,'%d/%m/%y') as DtDevolucao, date_format(aluguel.DtAluguel,'%d/%m/%y') as DtAluguel, aluguel.Valor, cliente.Nome, cliente.CPF, cliente.Telefone, cliente.idCliente, veiculo.idVeiculo, veiculo.Modelo, veiculo.Placa, veiculo.Ano, aluguel.IsActive, aluguel.idAluguel"
                                    + " from"
                                        + "	aluguel"
                                      + " INNER JOIN cliente ON (aluguel.idCliente = cliente.idCliente)"
                                     + " INNER JOIN veiculo ON (aluguel.idVeiculo = veiculo.idVeiculo)"
                    + "ORDER BY "
                    + "aluguel.IsActive DESC;"
            );
            rs = ps.executeQuery();
            
            ArrayList<Aluguel> lista = new ArrayList<Aluguel>();
            
                while(rs.next()) {
                Cliente c = new Cliente();
                Veiculo v = new Veiculo();
                Aluguel a = new Aluguel();
                
                a.setDtAluguel(rs.getString("DtAluguel"));
                a.setValor(rs.getFloat("Valor"));
                a.setDtDevolucao(rs.getString("DtDevolucao"));
                a.setNome(rs.getString("Nome"));
                a.setCPF(rs.getString("CPF"));
                a.setTelefone(rs.getString("Telefone"));
                a.setModelo(rs.getString("Modelo"));
                a.setPlaca(rs.getString("Placa"));
                a.setAno(rs.getInt("Ano"));
                a.setIsActive(rs.getBoolean("IsActive"));
                a.setIdAluguel(rs.getInt("idAluguel"));
                a.setIdVeiculo(rs.getInt("idVeiculo"));
                a.setIdCliente(rs.getInt("idCliente"));

                lista.add(a);
                
            }
            ps.close();
            return lista;
            
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
    }
    
    public ArrayList<Aluguel> listarAlugueisAtivos() {
        ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
        
        try {
            this.conn = conexao.conectar();
//            ps = conn.prepareStatement("select aluguel.DtAluguel, aluguel.Valor, aluguel.DtDevolucao, cliente.Nome, cliente.CPF, cliente.Telefone, veiculo.Modelo, veiculo.Placa, veiculo.Ano from aluguel INNER JOIN cliente ON (aluguel.idCliente = cliente.idCliente) INNER JOIN veiculo ON (aluguel.idVeiculo = veiculo.idVeiculo);");
            ps = conn.prepareStatement(""
                                     + "select"
                                            + " date_format(aluguel.DtDevolucao,'%d/%m/%y') as DtDevolucao, date_format(aluguel.DtAluguel,'%d/%m/%y') as DtAluguel, aluguel.Valor, cliente.Nome, cliente.CPF, cliente.Telefone, cliente.idCliente, veiculo.Modelo, veiculo.Placa, veiculo.Ano, veiculo.idVeiculo, aluguel.IsActive, aluguel.idAluguel"
                                    + " from"
                                        + "	aluguel"
                                      + " INNER JOIN cliente ON (aluguel.idCliente = cliente.idCliente)"
                                     + " INNER JOIN veiculo ON (aluguel.idVeiculo = veiculo.idVeiculo) "
                                    + "where"
                                    + " aluguel.IsActive=1;"
            );
            rs = ps.executeQuery();
            
            ArrayList<Aluguel> lista = new ArrayList<Aluguel>();
            
                while(rs.next()) {
                Cliente c = new Cliente();
                Veiculo v = new Veiculo();
                Aluguel a = new Aluguel();
                
                a.setDtAluguel(rs.getString("DtAluguel"));
                a.setValor(rs.getFloat("Valor"));
                a.setDtDevolucao(rs.getString("DtDevolucao"));
                a.setNome(rs.getString("Nome"));
                a.setCPF(rs.getString("CPF"));
                a.setTelefone(rs.getString("Telefone"));
                a.setModelo(rs.getString("Modelo"));
                a.setPlaca(rs.getString("Placa"));
                a.setAno(rs.getInt("Ano"));
                a.setIsActive(rs.getBoolean("IsActive"));
                a.setIdAluguel(rs.getInt("idAluguel"));
                a.setIdCliente(rs.getInt("idCliente"));
                a.setIdVeiculo(rs.getByte("idVeiculo"));

                lista.add(a);
                
            }
            ps.close();
            return lista;
            
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
    }
    
    public ArrayList<Aluguel> listarAlugueisInativos() {
        ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement(""
                                     + "select"
                                            + " date_format(aluguel.DtDevolucao,'%d/%m/%y') as DtDevolucao, date_format(aluguel.DtAluguel,'%d/%m/%y') as DtAluguel, aluguel.Valor, cliente.Nome, cliente.CPF, cliente.Telefone, veiculo.Modelo, veiculo.Placa, veiculo.Ano, aluguel.IsActive, aluguel.idAluguel"
                                    + " from"
                                        + "	aluguel"
                                      + " INNER JOIN cliente ON (aluguel.idCliente = cliente.idCliente)"
                                     + " INNER JOIN veiculo ON (aluguel.idVeiculo = veiculo.idVeiculo) "
                                    + "where"
                                    + " aluguel.IsActive=0;"
            );
            rs = ps.executeQuery();
            
            ArrayList<Aluguel> lista = new ArrayList<Aluguel>();
            
                while(rs.next()) {
                Cliente c = new Cliente();
                Veiculo v = new Veiculo();
                Aluguel a = new Aluguel();
                
                a.setDtAluguel(rs.getString("DtAluguel"));
                a.setValor(rs.getFloat("Valor"));
                a.setDtDevolucao(rs.getString("DtDevolucao"));
                a.setNome(rs.getString("Nome"));
                a.setCPF(rs.getString("CPF"));
                a.setTelefone(rs.getString("Telefone"));
                a.setModelo(rs.getString("Modelo"));
                a.setPlaca(rs.getString("Placa"));
                a.setAno(rs.getInt("Ano"));
                a.setIsActive(rs.getBoolean("IsActive"));
                a.setIdAluguel(rs.getInt("idAluguel"));

                lista.add(a);
                
            }
            ps.close();
            return lista;
            
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        
        return null;
    }
    
    
    
    public boolean realizarAluguel(Cliente c, Veiculo v, Aluguel a){
        boolean ok;
        
        try {
            
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("insert into aluguel (idCliente, idVeiculo, Valor, DtDevolucao, DtAluguel) values (?,?,?,?,?);");          
            
            ps.setInt(1, c.getIdCliente());
            ps.setInt(2, v.getIdVeiculo());
            ps.setFloat(3, a.getValor());        
            ps.setString(4, a.getDtDevolucao());
            ps.setString(5, a.getDtAluguel());
            ps.executeUpdate();
            
            ps = conn.prepareStatement("update veiculo set veiculo.Disponibilidade=0 where veiculo.idVeiculo=?;");
            ps.setInt(1, v.getIdVeiculo());
            ps.executeUpdate();
            
            ok = true;
            
        } catch (Exception e){
            e.printStackTrace();
            ok = false;
        } finally {
            conexao.desconectar();
        }
        
        if(ok) 
            return true;
        
        return false;
    }
    
    public boolean realizarDevolucao(Veiculo v, Aluguel a){
        boolean ok;
        
        try {
            
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update aluguel set IsActive=0 where idAluguel=?;");                    
            ps.setInt(1, a.getIdAluguel());       

            ps.executeUpdate();
            
            ps = conn.prepareStatement("update veiculo set veiculo.Disponibilidade=1 where veiculo.idVeiculo=?;");
            ps.setInt(1, v.getIdVeiculo());
            ps.executeUpdate();
            
            ok = true;
            
        } catch (Exception e){
            e.printStackTrace();
            ok = false;
        } finally {
            conexao.desconectar();
        }
        
        if(ok) 
            return true;
        
        return false;
    }
    
    public boolean desativarAluguel(Aluguel a) {
        boolean ok;
        
        try {
            this.conn = conexao.conectar();
            ps = conn.prepareStatement("update aluguel set IsActive=0 where idAluguel=?;");
            ps.setInt(1, a.getIdAluguel());
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
