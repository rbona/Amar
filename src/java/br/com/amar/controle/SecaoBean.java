/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle;

import br.com.amar.controle.template.GradesAcessoDadosCRUDBean;
import br.com.amar.modelo.Secao;
import br.com.amar.modelo.SecaoRepositorio;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
@ViewScoped
public class SecaoBean extends GradesAcessoDadosCRUDBean<Secao,SecaoRepositorio>{

    /**
     * Creates a new instance of SecoesBean
     */
    public SecaoBean() {
    }
    
}