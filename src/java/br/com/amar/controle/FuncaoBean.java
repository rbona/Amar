/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle;

import br.com.amar.controle.template.GradesAcessoDadosCRUDBean;
import br.com.amar.modelo.Funcao;
import br.com.amar.modelo.FuncaoRepositorio;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
@ViewScoped
public class FuncaoBean extends GradesAcessoDadosCRUDBean<Funcao,FuncaoRepositorio>{

    /**
     * Creates a new instance of FuncaoBean
     */
    public FuncaoBean() {
    }
    
}
