/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle;

import br.com.amar.controle.template.GradesAcessoDadosCRUDBean;
import br.com.amar.modelo.TipoMembro;
import br.com.amar.modelo.TipoMembroRepositorio;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
@ViewScoped
public class TipoMembroBean extends GradesAcessoDadosCRUDBean<TipoMembro, TipoMembroRepositorio> {

    /**
     * Creates a new instance of TiposMembrosBean
     */
    public TipoMembroBean() {
    }
    
}
