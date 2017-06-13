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
 * Mantém o tipo de data
 *
 * @author Rodrigo
 */
@Entity
public class TipoData extends ModeloEntidade {

    /**
     * Identificador do tipo de data
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Retorna o identificador do tipo de data
     *
     * @return Número que identifica o tipo de data
     */
    public Long getId() {
        return id;
    }

    /**
     * Descrição do tipo de data
     */
    @Column(nullable = false, length = 100)
    private String descricao;

    /**
     * Retorna a descrição atual do tipo de data
     *
     * @return Descrição atual do tipo de data
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Defini uma nova descrição para o tipo de data
     *
     * @param novaDescricao Nova descrição para o tipo de data
     */
    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    /**
     * Quando inativo preenche esse campo com a data
     */
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataInativo;

    public boolean validarDados() {
        return false;
    }

    @Override
    public Long[] getChavePrimaria() {
        return new Long[]{id};
    }
}
