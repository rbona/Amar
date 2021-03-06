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
public class SexoRepositorio extends ModeloRepositorio<Sexo>{

    @Override
    public List<Sexo> buscaTodos() {
        ArrayList<Sexo> lista = null;
        if (this.getGerenciador() != null) {
            Query consulta = this.getGerenciador().createQuery("select d from Sexo d");
            lista = (ArrayList<Sexo>) consulta.getResultList();
        }
        return lista;
    }

    @Override
    public Sexo buscarRegistro(Long[] chavePrimaria) {
        Sexo registro = null;

        if (chavePrimaria.length > 0) {
            Query consulta = this.getGerenciador().createQuery("select d from Sexo d where d.id = " + chavePrimaria[0]);
            List<Sexo> lista = (ArrayList<Sexo>) consulta.getResultList();
            if (lista.size() > 0) {
                registro = lista.get(0);
            }
        }

        return registro;
    }    
}