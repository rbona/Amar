/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.modelo;

import br.com.amar.modelo.template.ModeloEntidade;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rodrigo
 */
@Entity
public class Secao extends ModeloEntidade {

    // <editor-fold desc="Atributos">
    /**
     * Identificador do seção
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Descrição do seção
     */
    @Column(nullable = false, length = 100)
    private String descricao;

    /**
     * Quando inativo preenche esse campo com a data
     */
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataInativo;

    // </editor-fold>
    // <editor-fold  defaultstate="collapsed" desc="Gets e Sets">    
    /**
     * Retorna o identificador do seção
     *
     * @return Número que identifica o seção
     */
    public Long getId() {
        return id;
    }

    /**
     * Retorna a descrição atual do seção
     *
     * @return Descrição atual do seção
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Defini uma nova descrição para o seção
     *
     * @param novaDescricao Nova descrição para o seção
     */
    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    @Override
    public Long[] getChavePrimaria() {
        return new Long[]{getId()};
    }

    // </editor-fold>
}
