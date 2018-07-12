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
@Table(name="tentativas")
public class Tentativas {
	@Id
	@GeneratedValue
	private int codigo;
	
	@Column (name="supinoTentativa1")
	private int supinoTentativa1;
	
	@Column (name="supinoTentativa2")
	private int supinoTentativa2;
	
	@Column (name="supinoTentativa3")
	private int supinoTentativa3;
	
	@Column (name="agachamentoTentativa1")
	private int agachamentoTentativa1;
	
	@Column (name="agachamentoTentativa2")
	private int agachamentoTentativa2;
	
	@Column (name="agachamentoTentativa3")
	private int agachamentoTentativa3;
	
	@Column (name="terraTentativa1")
	private int terraTentativa1;
	
	@Column (name="terraTentativa2")
	private int terraTentativa2;
	
	@Column (name="terraTentativa3")
	private int terraTentativa3;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSupinoTentativa1() {
		return supinoTentativa1;
	}

	public void setSupinoTentativa1(int supinoTentativa1) {
		this.supinoTentativa1 = supinoTentativa1;
	}

	public String getSupinoTentativa1String() {
		return ""+supinoTentativa1;
	}
	
	public int getSupinoTentativa2() {
		return supinoTentativa2;
	}
	
	public String getSupinoTentativa2String() {
		return ""+supinoTentativa2;
	}

	public void setSupinoTentativa2(int supinoTentativa2) {
		this.supinoTentativa2 = supinoTentativa2;
	}

	public int getSupinoTentativa3() {
		return supinoTentativa3;
	}
	
	public String getSupinoTentativa3String() {
		return ""+supinoTentativa3;
	}

	public void setSupinoTentativa3(int supinoTentativa3) {
		this.supinoTentativa3 = supinoTentativa3;
	}

	public int getAgachamentoTentativa1() {
		return agachamentoTentativa1;
	}
	
	public String getAgachamentoTentativa1String() {
		return ""+agachamentoTentativa1;
	}

	public void setAgachamentoTentativa1(int agachamentoTentativa1) {
		this.agachamentoTentativa1 = agachamentoTentativa1;
	}

	public int getAgachamentoTentativa2() {
		return agachamentoTentativa2;
	}
	
	public String getAgachamentoTentativa2String() {
		return ""+agachamentoTentativa2;
	}

	public void setAgachamentoTentativa2(int agachamentoTentativa2) {
		this.agachamentoTentativa2 = agachamentoTentativa2;
	}

	public int getAgachamentoTentativa3() {
		return agachamentoTentativa3;
	}
	
	public String getAgachamentoTentativa3String() {
		return ""+agachamentoTentativa3;
	}

	public void setAgachamentoTentativa3(int agachamentoTentativa3) {
		this.agachamentoTentativa3 = agachamentoTentativa3;
	}

	public int getTerraTentativa1() {
		return terraTentativa1;
	}
	
	public String getTerraTentativa1String() {
		return ""+terraTentativa1;
	}

	public void setTerraTentativa1(int terraTentativa1) {
		this.terraTentativa1 = terraTentativa1;
	}
	
	public String getTerraTentativa2String() {
		return ""+terraTentativa2;
	}

	public int getTerraTentativa2() {
		return terraTentativa2;
	}

	public void setTerraTentativa2(int terraTentativa2) {
		this.terraTentativa2 = terraTentativa2;
	}

	public String getTerraTentativa3String() {
		return ""+terraTentativa3;
	}
	
	public int getTerraTentativa3() {
		return terraTentativa3;
	}

	public void setTerraTentativa3(int terraTentativa3) {
		this.terraTentativa3 = terraTentativa3;
	}
}
