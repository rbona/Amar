/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle.Conversores;

import br.com.amar.controle.IgrejaBean;
import br.com.amar.modelo.Igreja;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Rodrigo
 */
//@FacesConverter(forClass = Igreja.class)
public class IgrejaConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        IgrejaBean igrejaBean = new IgrejaBean();
        Igreja igreja = igrejaBean.getDado(new Long[]{Long.parseLong(value)});
        return igreja;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }

}
