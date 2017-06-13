/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.modelo.template;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public abstract class ModeloEntidade implements Serializable{

    public abstract Long[] getChavePrimaria();

//    /**
//     * Quando inativo preenche esse campo com a data
//     */
//    protected Date dataInativo;
//
    /**
     * Retorna a data de inativação do cadastro
     *
     * @return Data de inatividade do cadastro, retorna null caso esteja ativo
     */
    public Date getDataInativo() {
        Date dataInativo = null;
        try {
            Field campoDataInativo = this.getClass().getDeclaredField("dataInativo");
            campoDataInativo.setAccessible(true);
            dataInativo = (Date) campoDataInativo.get(this);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(ModeloEntidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataInativo;
    }

    /**
     * Defini uma data de inatividade para o cadastro
     *
     * @param novaDataInativo Data de inatividade do cadastro, informar null
     * para ativar o cadastro
     */
    public void setDataInativo(Date novaDataInativo) {
        Field campoDataInativo;
        try {
            campoDataInativo = this.getClass().getDeclaredField("dataInativo");
            campoDataInativo.setAccessible(true);
            campoDataInativo.set(this, novaDataInativo);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(ModeloEntidade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Defini o cadastro como ativo
     */
    public void setAtivo() {
        setDataInativo(null);
    }

    /**
     * Defini o cadastro como inativo
     */
    public void setInativo() {
        if (getDataInativo() == null) {
            setDataInativo(new Date(((java.util.Date) Calendar.getInstance().getTime()).getTime()));
        }
    }

    /**
     * Retorna informando se o tipo de data está ativo
     *
     * @return True indica que está ativo, false indica que está inativo
     */
    public boolean getAtivo() {
        return getDataInativo() == null;
    }

    /**
     * Defini o estadivo de ativo ou inativo para o tipo de dadta
     *
     * @param ativaInativaTipoData True indica que ficará ativo, false indica
     * que ficará inativo
     */
    public void setAtivo(boolean ativaInativaTipoData) {
        if (ativaInativaTipoData) {
            setAtivo();
        } else {
            setInativo();
        }
    }
}
