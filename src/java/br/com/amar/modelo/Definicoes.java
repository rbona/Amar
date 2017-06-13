/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Contém as definições do sistema
 *
 * @author Rodrigo
 */
@Entity
public class Definicoes {

    /**
     * Identificador das definições
     */
    @Id
    @GeneratedValue
    private Long Id;

    /**
     * Retorna o Id da definição atual
     *
     * @return Id da definições atual
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Contém a chave da definição que identifica qual é a definição
     */
    @Column(nullable = false, length = 100)
    private String chave;

    /**
     * Retorna a chave atual da definição
     *
     * @return Chave atual da definição
     */
    public String getChave() {
        return this.chave;
    }

    /**
     * Defini uma nova chave para a definição
     *
     * @param novaChave Nova chave para a definição
     */
    public void setChave(String novaChave) {
        this.chave = novaChave;
    }

    /**
     * Valor da definição
     */
    private String valor;

    /**
     * Retorna o valor da definição
     *
     * @return Valor da definição
     */
    public String getValor() {
        return this.valor;
    }

    /**
     * Defini um novo valor para a definição
     *
     * @param novoValor Novo valor para a definição
     */
    public void setValor(String novoValor) {
        this.valor = novoValor;
    }
}