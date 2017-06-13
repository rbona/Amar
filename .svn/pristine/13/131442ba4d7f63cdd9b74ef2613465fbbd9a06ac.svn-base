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
public class UF extends ModeloEntidade {

    // <editor-fold desc="Atributos">
    /**
     * Identificador
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Descrição
     */
    @Column(nullable = false, length = 100)
    private String descricao;

    /**
     * Sigla
     */
    @Column(nullable = false, length = 2)
    private String sigla;

    /**
     * Quando inativo preenche esse campo com a data
     */
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataInativo;

    // </editor-fold>
    // <editor-fold  defaultstate="collapsed" desc="Gets e Sets">    
    /**
     * Retorna o identificador
     *
     * @return Número que identifica o registro no banco de dados
     */
    public Long getId() {
        return id;
    }

    /**
     * Retorna o valor do campo descrição
     *
     * @return Valor do Descrição
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Defini uma nova descrição
     *
     * @param novaDescricao Nova descrição
     */
    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    /**
     * Retorna o valor do campo sigla
     *
     * @return Sigla
     */
    public String getSigla() {
        return this.sigla;
    }

    /**
     * Defini uma nova sigla
     *
     * @param novaSigla Sigla a ser definida
     */
    public void setSigla(String novaSigla) {
        this.sigla = novaSigla;
    }

    @Override
    public Long[] getChavePrimaria() {
        return new Long[]{getId()};
    }

    // </editor-fold>
}
