package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "usuario")
@SessionScoped
public class UserBeans {
	private String name = "";
	private String pass = "";
	
	public String login() {
		String respuesta = "";
		if(name.length()>0 && pass.length()>0) {
			respuesta="welcome";
		}else {
			respuesta="error";
		}
		return respuesta;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
