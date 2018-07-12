/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Apocalipse
 */
@Entity
@Table(name="pagamento")
public class Pagamento {
    @Id
    @GeneratedValue
    private int codigo;

    @Column(name = "codigoAluno")
    private int codigoAluno;

    @Column(name = "dataPag", length = 10)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPag;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public Date getDataPag() {
        return dataPag;
    }

    public void setDataPag(Date dataPag) {
        this.dataPag = dataPag;
    }
}