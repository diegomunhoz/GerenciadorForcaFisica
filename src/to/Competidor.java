package to;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
*
* @author Diego Munhoz
*/
@Entity
@Table(name="competidor")
public class Competidor {
	@Id
	@GeneratedValue
	private long codigo;
	
	@Column(name = "nome", nullable = false, length = 40)
	private String nome;
	
	@Column (name="idade")
	private int idade;
	
	@Column (name="peso")
	private double peso;
	
	@Column(name = "sexo", nullable = false, length = 12)
	private String sexo;
	
	@ManyToOne
	@JoinColumn(name="codigo_contato",nullable = false)
	private Contato contato;
	
	@ManyToOne
	@JoinColumn(name="codigo_endereço",nullable = false)
	private Endereço endereço;
	
	@ManyToOne
	@JoinColumn(name="codigo_modalidades",nullable = false)
	private Modalidades modalidades;
	
	@ManyToOne
	@JoinColumn(name="codigo_tentativas",nullable = false)
	private Tentativas tentativas;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public String getIdadeString() {
		return ""+idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPesoString() {
		return ""+peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

	public Modalidades getModalidades() {
		return modalidades;
	}

	public void setModalidades(Modalidades modalidades) {
		this.modalidades = modalidades;
	}

	public Tentativas getTentativas() {
		return tentativas;
	}

	public void setTentativas(Tentativas tentativas) {
		this.tentativas = tentativas;
	}
	
}