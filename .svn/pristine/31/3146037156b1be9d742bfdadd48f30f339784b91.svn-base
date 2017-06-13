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
public class UnidadeFederacao extends ModeloEntidade {

    /**
     * Identificador do unidade da federação
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Retorna o identificador do unidade da federação
     *
     * @return Número que identifica o unidade da federação
     */
    public Long getId() {
        return id;
    }

    /**
     * Descrição do unidade da federação
     */
    @Column(nullable = false, length = 100)
    private String descricao;

    /**
     * Retorna a descrição atual do unidade da federação
     *
     * @return Descrição atual do unidade da federação
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Defini uma nova descrição para o unidade da federação
     *
     * @param novaDescricao Nova descrição para o unidade da federação
     */
    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    /**
     * Sigla da unidade da federação
     */
    @Column(nullable = false, length = 3)
    private String sigla;

    /**
     * Retorna a sigla da unidade da federação
     * @return sigla da unidade da federação
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Defini a sigla da unidade da federação
     * @param novaSigla Sigla a ser definida
     */
    public void setSigla(String novaSigla) {
        this.sigla = novaSigla;
    }

    /**
     * Quando inativo preenche esse campo com a data
     */
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataInativo;

    @Override
    public Long[] getChavePrimaria() {
        return new Long[]{getId()};
    }

}
