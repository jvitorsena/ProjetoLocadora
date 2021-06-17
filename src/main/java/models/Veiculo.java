/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jvito
 */
public class Veiculo {
    private int idVeiculo, Ano;
    private String Modelo, Cor, Placa, Descricao, Chassi, Fabricante;
    private boolean Disponibilidade, IsActive;
    
    public Veiculo(){
        
    }

    /**
     * @return the idVeiculo
     */
    public int getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * @param idVeiculo the idVeiculo to set
     */
    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    /**
     * @return the Ano
     */
    public int getAno() {
        return Ano;
    }

    /**
     * @param Ano the Ano to set
     */
    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Cor
     */
    public String getCor() {
        return Cor;
    }

    /**
     * @param Cor the Cor to set
     */
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    /**
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the Chassi
     */
    public String getChassi() {
        return Chassi;
    }

    /**
     * @param Chassi the Chassi to set
     */
    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    /**
     * @return the Fabricante
     */
    public String getFabricante() {
        return Fabricante;
    }

    /**
     * @param Fabricante the Fabricante to set
     */
    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
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

    /**
     * @return the Disponibilidade
     */
    public boolean isDisponibilidade() {
        return Disponibilidade;
    }

    /**
     * @param Disponibilidade the Disponibilidade to set
     */
    public void setDisponibilidade(boolean Disponibilidade) {
        this.Disponibilidade = Disponibilidade;
    }
    
}
