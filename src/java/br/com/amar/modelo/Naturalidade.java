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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mapeamento da tabela Naturalidade
 *
 * @author Rodrigo
 */
@Entity
public class Naturalidade extends ModeloEntidade {

    /**
     * Identificador da Naturalidade
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Retorna o identificador da naturalidade
     *
     * @return Número que identifica a naturalidade
     */
    public Long getId() {
        return id;
    }

    /**
     * Descrição da naturalidade
     */
    @Column(nullable = false, length = 100)
    private String descricao;
    
    /**
     * Unidade da federação
     */
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = UF.class)
    @JoinColumn(name = "ufId", referencedColumnName = "id")
    private UF uf;
    
    /**
     * Retorna a descrição atual da naturalidade
     *
     * @return Descrição atual da naturalidade
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Defini uma nova descrição para a naturalidade
     *
     * @param novaDescricao Nova descrição para a naturalidade
     */
    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }
    
    /**
     * Retorna a UF relacionada a naturalidade
     * @return UF
     */
    public UF getUf(){
        return this.uf;
    }
    
    /**
     * Defini uma UF para a naturalidade
     * @param ufRelacionar UF a ser relacionada
     */
    public void setUf(UF ufRelacionar){
        this.uf = ufRelacionar;
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
