/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.controle.Conversores;

import br.com.amar.fabrica.FabricaBeans;
import br.com.amar.modelo.template.ModeloEntidade;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Rodrigo
 */
@FacesConverter(forClass = ModeloEntidade.class)
public class ConversorPadrao implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        ModeloEntidade entidade = FabricaBeans.Criar(component.getValueExpression("value").getType(context.getELContext()));
        Object retorno = null;
        retorno = BuscaRegistro.PorEntidade(entidade, Long.parseLong(value));
//        try {

//            Class classeBean = Class.forName("br.com.amar.controle." + entidade.getClass().getSimpleName() + "Bean");
//            Object bean = classeBean.newInstance();
//            Method BuscarRegistro = classeBean.getMethod("getDado", Long[].class);
//            retorno = BuscarRegistro.invoke(bean, chavePrimaria);

//            Class classeControle = Class.forName("br.com.amar.controle." + entidade.getClass().getSimpleName() + "Bean");
//            Object objetoControle = classeControle.newInstance();
//            Method metodo = classeControle.getMethod("getDado", chavePrimaria.getClass());
//            retorno = metodo.invoke(objetoControle, chavePrimaria);
//            ClassLoader.getSystemClassLoader().getResource("br.com.amar.controle");
//
//            Class[] listaClasses = Class.forName("br.com.amar.controle").getClasses();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ConversorPadrao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(ConversorPadrao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(ConversorPadrao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalArgumentException ex) {
//            Logger.getLogger(ConversorPadrao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InvocationTargetException ex) {
//            Logger.getLogger(ConversorPadrao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoSuchMethodException ex) {
//            Logger.getLogger(ConversorPadrao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SecurityException ex) {
//            Logger.getLogger(ConversorPadrao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        IgrejasBean igrejaBean = new IgrejasBean();
//        Igreja igreja = igrejaBean.getDado(new Long[]{Long.parseLong(value)});
//        return igreja;
        return retorno;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }

}
