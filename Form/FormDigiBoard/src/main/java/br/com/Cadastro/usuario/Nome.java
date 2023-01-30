package br.com.Cadastro.usuario;

import javax.faces.bean.RequestScoped;
import javax.faces.event.NamedEvent;

@NamedEvent
@RequestScoped
public class Nome {
	
	     
	    private String user;
	 
	    public String getUser() {
	        return user;
	    }
	    public void setText(String user) {
	        this.user = user;
	    }
	}

