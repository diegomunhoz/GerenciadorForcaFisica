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
@Table(name="endereço")
public class Endereço {
	@Id
	@GeneratedValue
	private int codigo;
	
	@Column(name = "cidade",  length = 25)
	private String cidade;
	
	@Column(name = "estado",  length = 25)
	private String estado;
	
	@Column(name = "academia",  length = 25)
	private String academia;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAcademia() {
		return academia;
	}

	public void setAcademia(String academia) {
		this.academia = academia;
	}
}
