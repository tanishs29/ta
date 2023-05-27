package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dto {

	private String sname;
	@Id
	private String email;
	private int pwd;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
}
