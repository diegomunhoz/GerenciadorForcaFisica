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
@Table(name="modalidades")
public class Modalidades {
	@Id
	@GeneratedValue
	private int codigo;
	
	@Column (name="supino", length= 3)
	private String supino;
	
	@Column (name="supinoMelhorMarca")
	private int supinoMelhorMarca;
	
	@Column (name="agachamento", length= 3)
	private String agachamento;
	
	@Column (name="agachamentoMelhorMarca")
	private int agachamentoMelhorMarca;
	
	@Column (name="terra", length= 3)
	private String terra;
	
	@Column (name="terraMelhorMarca")
	private int terraMelhorMarca;
	
	@Column (name="terraAbsoluto", length= 3)
	private String terraAbsoluto;
	
	@Column (name="supinoAbsoluto", length= 3)
	private String supinoAbsoluto;
	
	@Column (name="agachamentoAbsoluto", length= 3)
	private String agachamentoAbsoluto;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSupino() {
		return supino;
	}

	public void setSupino(String supino) {
		this.supino = supino;
	}

	public int getSupinoMelhorMarca() {
		return supinoMelhorMarca;
	}
	
	public String getSupinoMelhorMarcaString() {
		return ""+supinoMelhorMarca;
	}

	public void setSupinoMelhorMarca(int supinoMelhorMarca) {
		this.supinoMelhorMarca = supinoMelhorMarca;
	}

	public String getAgachamento() {
		return agachamento;
	}

	public void setAgachamento(String agachamento) {
		this.agachamento = agachamento;
	}

	public int getAgachamentoMelhorMarca() {
		return agachamentoMelhorMarca;
	}
	
	public String getAgachamentoMelhorMarcaString() {
		return ""+agachamentoMelhorMarca;
	}

	public void setAgachamentoMelhorMarca(int agachamentoMelhorMarca) {
		this.agachamentoMelhorMarca = agachamentoMelhorMarca;
	}

	public String getTerra() {
		return terra;
	}

	public void setTerra(String terra) {
		this.terra = terra;
	}

	public int getTerraMelhorMarca() {
		return terraMelhorMarca;
	}
	
	public String getTerraMelhorMarcaString() {
		return ""+terraMelhorMarca;
	}

	public void setTerraMelhorMarca(int terraMelhorMarca) {
		this.terraMelhorMarca = terraMelhorMarca;
	}

	public String getTerraAbsoluto() {
		return terraAbsoluto;
	}

	public void setTerraAbsoluto(String terraAbsoluto) {
		this.terraAbsoluto = terraAbsoluto;
	}

	public String getSupinoAbsoluto() {
		return supinoAbsoluto;
	}

	public void setSupinoAbsoluto(String supinoAbsoluto) {
		this.supinoAbsoluto = supinoAbsoluto;
	}

	public String getAgachamentoAbsoluto() {
		return agachamentoAbsoluto;
	}

	public void setAgachamentoAbsoluto(String agachamentoAbsoluto) {
		this.agachamentoAbsoluto = agachamentoAbsoluto;
	}
}
