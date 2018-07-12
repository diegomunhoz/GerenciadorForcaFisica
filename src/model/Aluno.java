package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @author Apocalipse
 */
@Entity
@Table(name="aluno")
public class Aluno {
    @Id
    @GeneratedValue
    private int codigo;

    @Column(name = "nome", length = 40)
    private String nome;
	
    @Column(name = "rg", length = 20)
    private String rg;

    @Column(name = "dataNasc", length = 10)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNasc;

    @Column(name = "sexo", length = 9)
    private String sexo;

    @Column(name = "rua", length = 40)
    private String rua;

    @Column(name = "numero", length = 10)
    private String numero;

    @Column(name = "bairro", length = 40)
    private String bairro;

    @Column(name = "cidade", length = 40)
    private String cidade;

    @Column(name = "telfixo", length = 14)
    private String telfixo;

    @Column(name = "celular", length = 14)
    private String celular;

    @Column(name = "graducao", length = 30)
    private String graducao;

    @Column(name = "status", length = 1)
    private String status;

    @Column(name = "dataPag", length = 2)
    private int dataPag;

    @Column(name = "valor")
    private int valor;

    @Column(name = "dataIncl", length = 10)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataIncl;

    public int getDataPag() {
        return dataPag;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setDataPag(int dataPag) {
        this.dataPag = dataPag;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataIncl() {
        return dataIncl;
    }

    public void setDataIncl(Date dataIncl) {
        this.dataIncl = dataIncl;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getGraducao() {
        return graducao;
    }

    public void setGraducao(String graducao) {
        this.graducao = graducao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelfixo() {
        return telfixo;
    }

    public void setTelfixo(String telfixo) {
        this.telfixo = telfixo;
    }
}