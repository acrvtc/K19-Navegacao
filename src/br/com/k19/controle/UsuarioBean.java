package br.com.k19.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class UsuarioBean {
	
	private String versaoPreferida = "Simples";
	
	public String principal(){
		
		if(this.versaoPreferida.equals("Avancada")){
			return "principal-avancada.xhtml";
		}
		else{
			return "principal-simples.xhtml";
		}
	}

	public String getVersaoPreferida() {
		return versaoPreferida;
	}

	public void setVersaoPreferida(String versaoPreferida) {
		this.versaoPreferida = versaoPreferida;
	}

	
	
	
	
}
