/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle;

import br.com.amar.controle.template.GradesAcessoDadosCRUDBean;
import br.com.amar.modelo.Igreja;
import br.com.amar.modelo.IgrejaRepositorio;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
@ViewScoped
public class IgrejaBean extends GradesAcessoDadosCRUDBean<Igreja,IgrejaRepositorio>{

    /**
     * Creates a new instance of FuncaoBean
     */
    public IgrejaBean() {
    }
    
}
