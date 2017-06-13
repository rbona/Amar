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
public class TipoEnderecoRepositorio extends ModeloRepositorio<TipoEndereco>{

    @Override
    public List<TipoEndereco> buscaTodos() {
        ArrayList<TipoEndereco> listaTipoEndereco = null;
        if (this.getGerenciador() != null) {
            Query consulta = this.getGerenciador().createQuery("select td from TipoEndereco td");
            listaTipoEndereco = (ArrayList<TipoEndereco>) consulta.getResultList();
        }
        return listaTipoEndereco;    
    }

    @Override
    public TipoEndereco buscarRegistro(Long[] chavePrimaria) {
        TipoEndereco registro = null;

        if (chavePrimaria.length > 0) {
            Query consulta = this.getGerenciador().createQuery("select td from TipoEndereco td where td.id = " + chavePrimaria[0]);
            List<TipoEndereco> listaTipoEndereco = (ArrayList<TipoEndereco>) consulta.getResultList();
            if (listaTipoEndereco.size() > 0) {
                registro = listaTipoEndereco.get(0);
            }
        }

        return registro;
    }
    
}
