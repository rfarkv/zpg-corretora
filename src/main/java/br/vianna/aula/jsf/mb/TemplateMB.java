/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.vianna.aula.jsf.mb;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author suporte
 */
@Component
@RequestScoped//manager bean de request
public class TemplateMB {
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index";
    }
    
    public String home(){
        return "index?faces-redirect=true";
    }
    
   public String cadastrarPet(){
        return "cadastropet?faces-redirect=true";
    }
    
    public String cadastrarEmpresa(){
        return "cadastroEmpresas?faces-redirect=true";
    }
    
}