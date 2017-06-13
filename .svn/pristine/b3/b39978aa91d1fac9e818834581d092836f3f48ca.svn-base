/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.modelo.template;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * Modelo a ser utilizado nas classes de repositório
 *
 * @author Rodrigo
 * @param <tipo> Tipo de dado a ser tratado no repositório
 */
public abstract class ModeloRepositorio<tipo>{

    /**
     * Gerenciador de entidades
     */
    private EntityManager gerenciador;

    /**
     * Retorna o gerenciador de entidade do repositório
     *
     * @return Gerencioador de entidade
     */
    public EntityManager getGerenciador() {
        return this.gerenciador;
    }

    /**
     * Defini o gerenciador de entidade para o repositório
     *
     * @param novoGerenciador Gerenciador de entidade
     */
    public void setGerenciador(EntityManager novoGerenciador) {
        this.gerenciador = novoGerenciador;
    }

    /**
     * Retorna todos os dados conforme entidade informada
     *
     * @return Todos os dados da entidade
     */
    public abstract List<tipo> buscaTodos();
    
    /**
     * Retorna o registro conforme a chave primária
     * @param chavePrimaria chave primária do registro
     * @return registro conforme chave primária, null caso não encontre
     */
    public abstract tipo buscarRegistro(Long[] chavePrimaria);

    /**
     * Inclui um registro no banco de dados
     *
     * @param novoRegistro Registro a ser incluido
     */
    public void incluir(tipo novoRegistro) {
        gerenciador.persist(novoRegistro);
    }

    /**
     * Atualiza os dados do registro no banco de dados
     *
     * @param registroAtualizar registro a ser atualizado
     */
    public void atualizar(tipo registroAtualizar) {
        gerenciador.merge(registroAtualizar);
    }
}
