package face;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import to.Competidor;

/**
*
* @author Diego Munhoz
*/
@SuppressWarnings("serial")
public class CompetidorTableModelTerra extends AbstractTableModel{
    private Vector<String> nomeColunas = new Vector<String>();
    @SuppressWarnings("unchecked")
	private Vector<Vector> dados = new Vector<Vector>();

    public CompetidorTableModelTerra() {
        gerarNomeColunas();
    }

    public CompetidorTableModelTerra(List<Competidor> lista) {
        gerarNomeColunas();
        gerarDados(lista);
    }

    public int getRowCount() {
        return dados.size();
    }

    public int getColumnCount() {
        return nomeColunas.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados.get(rowIndex).get(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return nomeColunas.get(column);
    }

    private void gerarNomeColunas(){
    	nomeColunas.add("Id");
        nomeColunas.add("Nome");
        nomeColunas.add("Idade");
        nomeColunas.add("Peso");
        nomeColunas.add("Marca");
        nomeColunas.add("Tentativa 1");
        nomeColunas.add("Tentativa 2");
        nomeColunas.add("Tentativa 3");
    }

    @SuppressWarnings("unchecked")
	private void gerarDados(List<Competidor> lista){ 
        for (Competidor competidor : lista){
            Vector linha = new Vector();

            linha.add(competidor.getCodigo());
            linha.add(competidor.getNome());
            linha.add(competidor.getIdade());
            linha.add(competidor.getPeso());
            linha.add(competidor.getModalidades().getTerraMelhorMarca());
            linha.add(competidor.getTentativas().getTerraTentativa1());
            linha.add(competidor.getTentativas().getTerraTentativa2());
            linha.add(competidor.getTentativas().getTerraTentativa3());

            dados.add(linha);
        }
    }


}
