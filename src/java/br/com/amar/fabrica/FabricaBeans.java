/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amar.fabrica;

import br.com.amar.modelo.Igreja;
import br.com.amar.modelo.template.ModeloEntidade;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;

/**
 *
 * @author Rodrigo
 */
public class FabricaBeans {

    public static ModeloEntidade Criar(Class<?> tipo) {
        ModeloEntidade modelo = null;
        try {
            Object novoObjeto = Class.forName(tipo.getName()).newInstance();
            if (novoObjeto instanceof ModeloEntidade)
                modelo = (ModeloEntidade) novoObjeto;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FabricaBeans.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FabricaBeans.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FabricaBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modelo;
    }
    
//    public static ModeloEntidade Criar(Class<? extends UIComponent> classe) {
//        ModeloEntidade modelo = null;
//        if ( Igreja.class == classe ){
//            
//        }
//        
//        return ModeloEntidade;
//    }
    
}
