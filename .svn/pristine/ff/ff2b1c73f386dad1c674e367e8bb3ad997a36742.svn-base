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
public class UFRepositorio extends ModeloRepositorio<UF>{

    @Override
    public List<UF> buscaTodos() {
        ArrayList<UF> lista = null;
        if (this.getGerenciador() != null) {
            Query consulta = this.getGerenciador().createQuery("select d from UF d");
            lista = (ArrayList<UF>) consulta.getResultList();
        }
        return lista;
    }

    @Override
    public UF buscarRegistro(Long[] chavePrimaria) {
        UF registro = null;

        if (chavePrimaria.length > 0) {
            Query consulta = this.getGerenciador().createQuery("select d from UF d where d.id = " + chavePrimaria[0]);
            List<UF> lista = (ArrayList<UF>) consulta.getResultList();
            if (lista.size() > 0) {
                registro = lista.get(0);
            }
        }

        return registro;
    }    
}