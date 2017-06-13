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
public class NaturalidadeRepositorio  extends ModeloRepositorio<Naturalidade> {

    @Override
    public List<Naturalidade> buscaTodos() {
        ArrayList<Naturalidade> lista = null;
        if (this.getGerenciador() != null) {
            Query consulta = this.getGerenciador().createQuery("select d from Naturalidade d");
            lista = (ArrayList<Naturalidade>) consulta.getResultList();
        }
        return lista;
    }

    @Override
    public Naturalidade buscarRegistro(Long[] chavePrimaria) {
        Naturalidade registro = null;

        if (chavePrimaria.length > 0) {
            Query consulta = this.getGerenciador().createQuery("select d from Naturalidade d where d.id = " + chavePrimaria[0]);
            List<Naturalidade> lista = (ArrayList<Naturalidade>) consulta.getResultList();
            if (lista.size() > 0) {
                registro = lista.get(0);
            }
        }

        return registro;
    }
    
}
