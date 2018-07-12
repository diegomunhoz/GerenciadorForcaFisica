package to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*
* @author Diego Munhoz
*/
@Entity
@Table(name="contato")
public class Contato {
	@Id
	@GeneratedValue
	private int codigo;
	
	@Column(name = "email", length = 40)
	private String email;
	
	@Column(name = "telefone", length = 14)
	private String telefone;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
