/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.modelo;

import br.com.amar.modelo.template.ModeloEntidade;
import java.io.Serializable;
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
public class TipoMembro extends ModeloEntidade {

    /**
     * Identificador para o tipo de membro
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Retorna o ID do tipo de membro
     *
     * @return ID do tipo de membro
     */
    public Long getId() {
        return id;
    }

    /**
     * Descrição do tipo de membro
     */
    @Column(nullable = false, length = 100)
    private String descricao;

    /**
     * Retorna a descrição atual do tipo de membro
     *
     * @return Descrição atual do tipo de membro
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Defini uma nova descrição para o tipo de membro
     *
     * @param novaDescricao Nova descrição para o tipo de membro
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

    /**
     * Retorna as chaves primárias
     *
     * @return lista das chaves primárias
     */
    @Override
    public Long[] getChavePrimaria() {
        return new Long[]{this.id};
    }
}
