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
 * Mapeamento da tabela EstadoCivil
 *
 * @author Rodrigo
 */
@Entity
public class EstadoCivil extends ModeloEntidade {

    /**
     * Identificador do estado civil
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Retorna o identificador do estado civil
     *
     * @return Número que identifica o estado civil
     */
    public Long getId() {
        return id;
    }

    /**
     * Descrição do estado civil
     */
    @Column(nullable = false, length = 100)
    private String descricao;

    /**
     * Retorna a descrição atual do estado civil
     *
     * @return Descrição atual do estado civil
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Defini uma nova descrição para o estado civil
     *
     * @param novaDescricao Nova descrição para o estado civil
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

    @Override
    public Long[] getChavePrimaria() {
        return new Long[]{this.getId()};
    }

}
