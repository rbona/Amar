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
public class PaisRepositorio extends ModeloRepositorio<Pais>{

    @Override
    public List<Pais> buscaTodos() {
        ArrayList<Pais> lista = null;
        if (this.getGerenciador() != null) {
            Query consulta = this.getGerenciador().createQuery("select d from Pais d");
            lista = (ArrayList<Pais>) consulta.getResultList();
        }
        return lista;
    }

    @Override
    public Pais buscarRegistro(Long[] chavePrimaria) {
        Pais registro = null;

        if (chavePrimaria.length > 0) {
            Query consulta = this.getGerenciador().createQuery("select d from Pais d where d.id = " + chavePrimaria[0]);
            List<Pais> lista = (ArrayList<Pais>) consulta.getResultList();
            if (lista.size() > 0) {
                registro = lista.get(0);
            }
        }

        return registro;
    }    
}