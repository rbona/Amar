/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle.Conversores;

import br.com.amar.controle.*;
import br.com.amar.modelo.*;
import br.com.amar.modelo.template.ModeloEntidade;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class BuscaRegistro {

    /**
     * Retorna o registro conforme o tipo da entidade e o Id informado
     *
     * @param entidade Entidade a ser verificado o tipo
     * @param id id do registro a ser buscado
     * @return Registro consultado, retorna null caso não encontre nada
     */
    public static Object PorEntidade(ModeloEntidade entidade, Long id) {
        Object retorno = null;
        Long[] chave = new Long[]{id};
        if (entidade instanceof Igreja) {
            IgrejaBean bean = new IgrejaBean();
            retorno = bean.getDado(chave);
        } else if (entidade instanceof Naturalidade) {
            NaturalidadeBean bean = new NaturalidadeBean();
            retorno = bean.getDado(chave);
        } else if (entidade instanceof UF) {
            UnidadeFederacaoBean bean = new UnidadeFederacaoBean();
            retorno = bean.getDado(chave);
        } else {
            Logger.getLogger(BuscaRegistro.class.getName()).log(Level.SEVERE, "Não foi definida configuração de busca de dados para a classe " + entidade.getClass().getName());
        }

        return retorno;
    }
}
