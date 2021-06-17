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
public class Aluguel {
    private String DtAluguel;
    private String DtDevolucao;
    private String Nome;
    private String CPF;
    private String Telefone;
    private String Modelo;
    private String Placa;
    private Boolean IsActive;
    private float Valor;
    private int Ano;
    private int idAluguel, idCliente, idVeiculo;

    
    /**
     * @return the DtAluguel
     */
    public String getDtAluguel() {
        return DtAluguel;
    }

    /**
     * @param DtAluguel the DtAluguel to set
     */
    public void setDtAluguel(String DtAluguel) {
        this.DtAluguel = DtAluguel;
    }

    /**
     * @return the DtDevolucao
     */
    public String getDtDevolucao() {
        return DtDevolucao;
    }

    /**
     * @param DtDevolucao the DtDevolucao to set
     */
    public void setDtDevolucao(String DtDevolucao) {
        this.DtDevolucao = DtDevolucao;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
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
     * @return the Valor
     */
    public float getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(float Valor) {
        this.Valor = Valor;
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
     * @return the IsActive
     */
    public Boolean getIsActive() {
        return IsActive;
    }

    /**
     * @param IsActive the IsActive to set
     */
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * @return the idAluguel
     */
    public int getIdAluguel() {
        return idAluguel;
    }

    /**
     * @param idAluguel the idAluguel to set
     */
    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
    
    
    
}
