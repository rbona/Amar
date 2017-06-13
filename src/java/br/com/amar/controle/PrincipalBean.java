/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
@SessionScoped
public class PrincipalBean implements Serializable {

    /**
     * Creates a new instance of PrincipalBean
     */
    public PrincipalBean() {
    }

    /**
     * Monta a URL para o site
     *
     * @param nomeSite nome do site a ser montado a URL
     * @return url para o site informado
     */
    private String montaUrl(String nomeSite) {
        return "/Cadastros/" + nomeSite + ".xhtml";
    }

    /**
     * Retorna o caminho para chegar na listagem de tipos de datas
     *
     * @return Caminho para listagem de tipos de datas
     */
    public String chamaListaTiposDatas() {
        return montaUrl("TiposDatas");
    }

    /**
     * Retorna o caminho para chamar o formulário de listagem de tipos de
     * endereços
     *
     * @return Caminho para o formulário de listagem de tipos de endereços
     */
    public String chamaListaTiposEnderecos() {
        return montaUrl("TiposEnderecos");
    }

    /**
     * Retorna o caminho para chamar o formulário de listagem de tipos de
     * membros
     *
     * @return Caminho para o formulário de listagem de tipos de membros
     */
    public String chamaListaTiposMembros() {
        return montaUrl("TiposMembros");
    }

    /**
     * Retorna o caminho para chamar o formulário de listagem de estados civis
     *
     * @return Caminho para o formulário de listagem de estados civis
     */
    public String chamaListaEstadosCivis() {
        return montaUrl("EstadosCivis");
    }

    /**
     * Retorna o caminho para chamar o formulário de listagem de naturalidades
     *
     * @return Caminho para o formulário de listagem de naturalidades
     */
    public String chamaListaNaturalidades() {
        return montaUrl("Naturalidades");
    }
    
    /**
     * Retorna o caminho para chamar o formulário de seções
     * @return Caminho para o formulário de seções
     */
    public String chamaListaSecoes() {
        return montaUrl("Secoes");
    }

    /**
     * Retorna o caminho para chamar o formulário de listagem de tipos de
     * admissões
     *
     * @return Caminho para o formulário de listagem de tipos de admissões
     */
    public String chamaListaTiposAdmissoes() {
        return montaUrl("TiposAdmissoes");
    }

    /**
     * Retorna o caminho para chamar o formulário de listagem de unidades da
     * federação
     *
     * @return Caminho para o formulário de listagem de unidades da federação
     */
    public String chamaListaUnidadesFederacao() {
        return montaUrl("UnidadesFederacao");
    }

    /**
     * Retorna o caminho para chamar o formulário de listagem de funções
     *
     * @return Caminho para o formulário de listagem de funções
     */
    public String chamaListaFuncoes() {
        return montaUrl("Funcoes");
    }
    
    /**
     * Retorna o caminho para chamar o formulário de listagem de igrejas
     *
     * @return Caminho para o formulário de listagem de igrejas
     */
    public String chamaListaIgrejas() {
        return montaUrl("Igrejas");
    }
    
    /**
     * Retorna o caminho para chamar o formulário de listagem de membros
     *
     * @return Caminho para o formulário de listagem de membros
     */
    public String chamaListaMembros() {
        return montaUrl("Membros");
    }    
    /**
     * Retorna o caminho para chamar o formulário informando no parametro
     *
     * @param nomeLista Nome do formulário a ser chamado
     * @return Caminho para o formulário de listagem
     */
    public String chamaLista(String nomeLista) {
        return montaUrl(nomeLista);
    }

}
