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
public class TipoDataRepositorio extends ModeloRepositorio<TipoData> {

    /**
     * Retorna todos os tipos de datas armazenados
     *
     * @return Lista dos tipos de datas
     */
    @Override
    public List<TipoData> buscaTodos() {
        ArrayList<TipoData> lista = null;
        if (this.getGerenciador() != null) {
            Query consulta = this.getGerenciador().createQuery("select td from TipoData td");
            lista = (ArrayList<TipoData>) consulta.getResultList();
        }
        return lista;
    }

    /**
     * Retorna o tipo de data conforme a chave primária informada
     * @param chavePrimaria chave primária do tipo de data
     * @return tipo de data conforme chave primária
     */
    @Override
    public TipoData buscarRegistro(Long[] chavePrimaria) {
        TipoData registro = null;

        if (chavePrimaria.length > 0) {
            Query consulta = this.getGerenciador().createQuery("select td from TipoData td where td.id = " + chavePrimaria[0]);
            List<TipoData> lista = (ArrayList<TipoData>) consulta.getResultList();
            if (lista.size() > 0) {
                registro = lista.get(0);
            }
        }

        return registro;
    }
}
