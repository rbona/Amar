/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle;

import br.com.amar.controle.template.GradesAcessoDadosCRUDBean;
import br.com.amar.modelo.Naturalidade;
import br.com.amar.modelo.NaturalidadeRepositorio;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
@ViewScoped
public class NaturalidadeBean   extends GradesAcessoDadosCRUDBean<Naturalidade, NaturalidadeRepositorio>{

    /**
     * Creates a new instance of NaturalidadesBean
     */
    public NaturalidadeBean() {
    }
    
}
