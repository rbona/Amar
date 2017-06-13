/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.modelo;

import br.com.amar.modelo.template.ModeloRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Rodrigo
 */
public class TipoMembroRepositorio extends ModeloRepositorio<TipoMembro> {

    /**
     * Retorna todos o tipos de membros cadastrados na base de dados
     * @return Lista dos tipos de membros
     */
    @Override
    public List<TipoMembro> buscaTodos() {
        ArrayList<TipoMembro> lista = null;
        if (this.getGerenciador() != null) {
            Query consulta = this.getGerenciador().createQuery("select d from TipoMembro d");
            lista = (ArrayList<TipoMembro>) consulta.getResultList();
        }
        return lista;
    }

    /**
     * Retorna um único registro conforme a chave primária informada
     * @param chavePrimaria Chave primária a ser consultada
     * @return Registro retornado após consulta
     */
    @Override
    public TipoMembro buscarRegistro(Long[] chavePrimaria) {
        TipoMembro registro = null;

        if (chavePrimaria.length > 0) {
            Query consulta = this.getGerenciador().createQuery("select d from TipoMembro d where d.id = " + chavePrimaria[0]);
            List<TipoMembro> lista = (ArrayList<TipoMembro>) consulta.getResultList();
            if (lista.size() > 0) {
                registro = lista.get(0);
            }
        }

        return registro;
    }

}
