package face;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import to.Competidor;
import to.Contato;
import to.Endereço;
import to.Modalidades;
import to.Tentativas;
import dao.GravarDados;

/**
*
* @author Diego Munhoz
*/
public class Principal {
		private JFrame janela;
		private JTabbedPane painelComAbas;
		private JPanel painelCadastrar;
		private JPanel painelCadastro;
		private JPanel painelConsulta;
		private JPanel painelMenu;
		private JPanel painelDaJanela;
		private JLabel lblNome;
		private JLabel lblBuscar;
		private JLabel lblCodigo;
		private JLabel lblMelhorMarca;
		private JLabel lblPesoMaior;
		private JLabel lblIdadeMaior;
		private JLabel lblTentativa1;
		private JLabel lblTentativa2;
		private JLabel lblTentativa3;
		private JLabel lblModalidade;
		private JLabel lblIdade;
		private JLabel lblPeso;
		private JLabel lblOrdenação;
		private JLabel lblCidade;
		private JLabel lblAcademia;
		private JLabel lblEstado;
		private JLabel lblEmail;
		private JLabel lblTelefone;
		private JLabel lblSexo;
		private JTextField txtPesoEntre1;
		private JTextField txtIdadeEntre1;
		private JTextField txtPesoEntre2;
		private JTextField txtIdadeEntre2;
		private JTextField txtNomeIgual;
		private JTextField txtTelefone;
		private JTextField txtNome;
		private JTextField txtCodigo;
		private JTextField txtIdade;
		private JTextField txtPeso;
		private JTextField txtCidade;
		private JTextField txtEstado;
		private JTextField txtAcademia;
		private JTextField txtEmail;
		private JTextField txtSupinoTentativa;
		private JTextField txtSupinoTentativa1;
		private JTextField txtSupinoTentativa2;
		private JTextField txtSupinoMarca;
		private JTextField txtAgachamentoTentativa;
		private JTextField txtAgachamentoTentativa1;
		private JTextField txtAgachamentoTentativa2;
		private JTextField txtAgachamentoMarca;
		private JTextField txtTerraTentativa;
		private JTextField txtTerraTentativa1;
		private JTextField txtTerraTentativa2;
		private JTextField txtTerraMarca;
		private JCheckBox checkboxSupino;
		private JCheckBox checkboxSupinoAbsoluto;
		private JCheckBox checkboxAgachamento;
		private JCheckBox checkboxAgachamentoAbsoluto;
		private JCheckBox checkboxTerra;
		private JCheckBox checkboxTerraAbsoluto;
		private JCheckBox checkboxMasculino;
		private JCheckBox checkboxFeminino;
		private JCheckBox checkboxIdade;
		private JCheckBox checkboxPeso;
		private JCheckBox checkboxMarca;
		private JCheckBox checkboxAbsolutoSupino;
		private JCheckBox checkboxAbsolutoAgachamento;
		private JCheckBox checkboxAbsolutoTerra;
		private JCheckBox checkboxSexoIgualM;
		private JCheckBox checkboxSexoIgualF;
		private JButton salvarDados;
		private JButton limparDados;
		private JButton supino;
		private JButton terra;
		private JButton agachamento;
		private JButton buscar;
		private JButton novo;
		private JList erro;
		private JList modalidade;
		private int validar=0;
		JTable table;
		
		String modalid[] = new String[] { "" };
		String erros[] = new String[] { "" };
		
		Competidor competidor = new Competidor();
		Contato contato = new Contato();
		Endereço endereço = new Endereço();
		Modalidades modalidades = new Modalidades();
		Tentativas tentativas = new Tentativas();
		GravarDados gravarDados = new GravarDados();
		CompetidorTableModelSupino modelo;
		CompetidorTableModelTerra modelo1;
		CompetidorTableModelAgachamento modelo2;
		
		public void iniciar(){						
			painelComAbas = new JTabbedPane();
			painelCadastrar = new JPanel();
			
			janela = new JFrame("Gerenciador Desafio de Força");
			painelCadastro = new JPanel();
			
			painelComAbas = new JTabbedPane();			
			painelDaJanela = (JPanel) janela.getContentPane();
			
			//painel com abas (JTabbedPane)
			painelComAbas.addTab("Controle de Cadastro - Alteração - Busca de competidores.", painelCadastrar);
			painelComAbas.setBounds(1, 1, 1280, 800);
			
			painelCadastro = new JPanel();
			painelConsulta = new JPanel();
			painelMenu = new JPanel();
			painelCadastrar.setLayout(null);
			
			painelCadastrar.add(painelCadastro);
			painelCadastrar.add(painelConsulta);
			painelCadastrar.add(painelMenu);
			
			painelCadastro.setBounds(4, 20, 310, 675);
			painelCadastro.setBorder(BorderFactory.createEtchedBorder());
			
			painelMenu.setBounds(320, 20, 704, 160);
			painelMenu.setBorder(BorderFactory.createEtchedBorder());
			
			painelConsulta.setBounds(320, 180, 704, 550);
			painelConsulta.setBorder(BorderFactory.createEtchedBorder());
			
			painelDaJanela.setLayout(null);
			painelDaJanela.add(painelComAbas);			
			//---------------------PAINEL CADASTRO------------------------
			painelCadastro.setLayout(null);			
			// inserindo NOME			
			painelCadastro.add(lblNome = new JLabel("Nome: "));
			lblNome.setBounds(2, 4, 100, 15);
			painelCadastro.add(txtNome = new JTextField());
			txtNome.setBounds(90, 1, 200, 20);
			
			// inserindo Academia
			painelCadastro.add(lblAcademia = new JLabel("Academia: "));
			lblAcademia.setBounds(2, 24, 100, 15);
			painelCadastro.add(txtAcademia = new JTextField());
			txtAcademia.setBounds(90, 21, 200, 20);
			
			// inserindo Cidade
			painelCadastro.add(lblCidade = new JLabel("Cidade: "));
			lblCidade.setBounds(2, 44, 100, 15);
			painelCadastro.add(txtCidade = new JTextField());
			txtCidade.setBounds(90, 41, 200, 20);
			
			// inserindo Estado
			painelCadastro.add(lblEstado = new JLabel("Estado: "));
			lblEstado.setBounds(2, 64, 100, 15);
			painelCadastro.add(txtEstado = new JTextField());
			txtEstado.setBounds(90, 61, 200, 20);
			
			// inserindo Sexo
			painelCadastro.add(lblSexo = new JLabel("Sexo: "));
			lblSexo.setBounds(2, 84, 100, 15);
			
			painelCadastro.add(checkboxMasculino = new JCheckBox() );
			checkboxMasculino.setBounds(85, 84, 200, 20);
			checkboxMasculino.setText("Masculino");
			
			painelCadastro.add(checkboxFeminino = new JCheckBox() );
			checkboxFeminino.setBounds(85, 104, 200, 20);
			checkboxFeminino.setText("Feminino");
			
			// inserindo Idade
			painelCadastro.add(lblIdade = new JLabel("Idade: "));
			lblIdade.setBounds(2, 130, 100, 15);
			painelCadastro.add(txtIdade = new JTextField());
			txtIdade.setBounds(90, 127, 20, 20);
			
			// inserindo Peso
			painelCadastro.add(lblPeso = new JLabel("Peso: "));
			lblPeso.setBounds(2, 150, 100, 15);
			painelCadastro.add(txtPeso = new JTextField());
			txtPeso.setBounds(90, 147, 50, 20);
			
			// inserindo Modalidade
			painelCadastro.add(lblModalidade = new JLabel("Modalidade: "));
			lblModalidade.setBounds(2, 170, 100, 15);
			
			painelCadastro.add(checkboxSupino = new JCheckBox() );
			checkboxSupino.setBounds(90, 167,100, 20);
			checkboxSupino.setText("Supino");
			
			painelCadastro.add(lblTentativa1 = new JLabel("Tentativa 1"));
			lblTentativa1.setBounds(195, 145, 80, 20);
			
			painelCadastro.add(txtSupinoTentativa = new JTextField());
			txtSupinoTentativa.setBounds(202, 170, 50, 20);
			
			painelCadastro.add(checkboxAgachamento = new JCheckBox() );
			checkboxAgachamento.setBounds(90, 187, 110, 20);
			checkboxAgachamento.setText("Agachamento");
			
			painelCadastro.add(txtAgachamentoTentativa = new JTextField());
			txtAgachamentoTentativa.setBounds(202, 190, 50, 20);
			
			painelCadastro.add(checkboxTerra = new JCheckBox() );
			checkboxTerra.setBounds(90, 207, 100, 20);
			checkboxTerra.setText("Terra");
			
			painelCadastro.add(txtTerraTentativa = new JTextField());
			txtTerraTentativa.setBounds(202, 210, 50, 20);
			
			// inserindo Telefone
			painelCadastro.add(lblTelefone = new JLabel("Telefone: "));
			lblTelefone.setBounds(2, 230, 100, 15);
			painelCadastro.add(txtTelefone = new JTextField());
			txtTelefone.setBounds(90, 230, 200, 20);
			
			// inserindo Email
			painelCadastro.add(lblEmail = new JLabel("Email: "));
			lblEmail.setBounds(2, 250, 100, 15);
			painelCadastro.add(txtEmail = new JTextField());
			txtEmail.setBounds(90, 250, 200, 20);		

			// adicionando label			
			painelCadastro.add(lblMelhorMarca = new JLabel("Marca"));
			lblMelhorMarca.setBounds(110, 273, 80, 20);
			painelCadastro.add(lblTentativa2 = new JLabel("Tentativa 2"));
			lblTentativa2.setBounds(165, 273, 80, 20);
			painelCadastro.add(lblTentativa3 = new JLabel("Tentativa 3"));
			lblTentativa3.setBounds(240, 273, 80, 20);
			
			painelCadastro.add(lblTentativa1 = new JLabel("Supino"));
			lblTentativa1.setBounds(2, 292, 150, 20);
			painelCadastro.add(txtSupinoMarca = new JTextField());
			txtSupinoMarca.setBounds(110, 292, 35, 20);
			painelCadastro.add(txtSupinoTentativa1 = new JTextField());
			txtSupinoTentativa1.setBounds(180, 292, 35, 20);
			painelCadastro.add(txtSupinoTentativa2 = new JTextField());
			txtSupinoTentativa2.setBounds(255, 292, 35, 20);
			
			painelCadastro.add(lblModalidade = new JLabel("Agachamento"));
			lblModalidade.setBounds(2, 312, 150, 20);
			painelCadastro.add(txtAgachamentoMarca = new JTextField());
			txtAgachamentoMarca.setBounds(110, 312, 35, 20);
			painelCadastro.add(txtAgachamentoTentativa1 = new JTextField());
			txtAgachamentoTentativa1.setBounds(180, 312, 35, 20);
			painelCadastro.add(txtAgachamentoTentativa2 = new JTextField());
			txtAgachamentoTentativa2.setBounds(255, 312, 35, 20);
			
			painelCadastro.add(lblModalidade = new JLabel("Terra"));
			lblModalidade.setBounds(2, 334, 150, 20);
			painelCadastro.add(txtTerraMarca = new JTextField());
			txtTerraMarca.setBounds(110, 334, 35, 20);
			painelCadastro.add(txtTerraTentativa1 = new JTextField());
			txtTerraTentativa1.setBounds(180, 334, 35, 20);
			painelCadastro.add(txtTerraTentativa2 = new JTextField());
			txtTerraTentativa2.setBounds(255, 334, 35, 20);
			
			//Absoluto
			painelCadastro.add(lblModalidade = new JLabel("Categoria Absoluto:"));
			lblModalidade.setBounds(110, 360, 150, 20);
			
			painelCadastro.add(checkboxSupinoAbsoluto = new JCheckBox("Supino"));
			checkboxSupinoAbsoluto.setBounds(8, 380, 70, 20);
			
			painelCadastro.add(checkboxAgachamentoAbsoluto = new JCheckBox("Agachamento"));
			checkboxAgachamentoAbsoluto.setBounds(100, 380, 120, 20);
			
			painelCadastro.add(checkboxTerraAbsoluto = new JCheckBox("Terra"));
			checkboxTerraAbsoluto.setBounds(230, 380, 60, 20);
			
			// adicionando lista erro
			painelCadastro.add(erro = new JList(erros));
			erro.addListSelectionListener(new ListenerListaErro());
			erro.setBounds(2, 400, 300, 20);	
			
			// botão Salvar Dados
			painelCadastro.add(salvarDados = new JButton("Salvar Dados"));
			salvarDados.setBounds(2, 420, 300, 20);
			salvarDados.addActionListener(new ListenerSalvarDados());
			
			// botão Limpar Dados
			painelCadastro.add(limparDados = new JButton("Limpar Dados"));
			limparDados.setBounds(2, 440, 300, 20);
			limparDados.addActionListener(new ListenerLimparDados());
			
			//inserindo codigo do competidor para a busca
			painelCadastro.add(txtCodigo = new JTextField());
			txtCodigo.setBounds(2, 460, 40, 20);
			
			// botão Buscar
			painelCadastro.add(buscar = new JButton("Buscar Competidor por Codigo"));
			buscar.setBounds(42, 460, 260, 20);
			buscar.addActionListener(new ListenerBuscarCompetidor());
			
			// botão Novo
			painelCadastro.add(novo = new JButton("Criar Novo Competidor"));
			novo.setBounds(2, 480, 300, 20);
			novo.addActionListener(new ListenerNovoCompetidor());
			
			//---------------------PAINEL Menu----------------------------
			painelMenu.setLayout(null);
			
			//condições de ordenação
			
			painelMenu.add(lblOrdenação = new JLabel("Ordenar por :"));
			lblOrdenação.setBounds(44, 2, 80, 20);
			
			painelMenu.add(lblIdade = new JLabel("Idade"));
			lblIdade.setBounds(49, 30, 50, 20);
			
			painelMenu.add(checkboxIdade = new JCheckBox());
			checkboxIdade.setText("Idade");
			checkboxIdade.setBounds(25, 30, 20, 20);
			    
			painelMenu.add(lblPeso = new JLabel("Peso"));
			lblPeso.setBounds(49, 55, 50, 20);
			
			painelMenu.add(checkboxPeso = new JCheckBox());
			checkboxPeso.setText("Peso");
			checkboxPeso.setBounds(25, 55, 20, 20);
			    
			painelMenu.add(lblMelhorMarca = new JLabel("Marca"));
			lblMelhorMarca.setBounds(49, 80, 50, 20);		
			
			painelMenu.add(checkboxMarca = new JCheckBox());
			checkboxMarca.setText("Marca");
			checkboxMarca.setBounds(25, 80, 20, 20);
			
			//condições de busca
			
			painelMenu.add(lblBuscar = new JLabel("Condições:"));
			lblBuscar.setBounds(415, 1, 70, 20);
			
			painelMenu.add(lblNome = new JLabel("Nome igual a:"));
			lblNome.setBounds(255, 25, 140, 20);
			
			painelMenu.add(txtNomeIgual = new JTextField());
			txtNomeIgual.setBounds(400, 25, 120, 20);
			
			painelMenu.add(lblPesoMaior = new JLabel("Peso entre ou igual a :"));
			lblPesoMaior.setBounds(255, 45, 140, 20);
			
			painelMenu.add(txtPesoEntre1 = new JTextField());
			txtPesoEntre1.setBounds(400, 45, 55, 20);
			
			painelMenu.add(txtPesoEntre2 = new JTextField());
			txtPesoEntre2.setBounds(465, 45, 55, 20);
			
			painelMenu.add(lblIdadeMaior = new JLabel("Idade entre ou igual a :"));
			lblIdadeMaior.setBounds(255, 65, 140, 20);
			
			painelMenu.add(txtIdadeEntre1 = new JTextField());
			txtIdadeEntre1.setBounds(400, 65, 55, 20);
			
			painelMenu.add(txtIdadeEntre2 = new JTextField());
			txtIdadeEntre2.setBounds(465, 65, 55, 20);
			
			painelMenu.add(lblSexo = new JLabel("Sexo :"));
			lblSexo.setBounds(530, 20, 60, 20);
			
			painelMenu.add(checkboxSexoIgualF = new JCheckBox());
			checkboxSexoIgualF.setText("Feminino");
			checkboxSexoIgualF.setBounds(517, 45, 80, 20);
			
			painelMenu.add(checkboxSexoIgualM = new JCheckBox());
			checkboxSexoIgualM.setText("Masculino");
			checkboxSexoIgualM.setBounds(517, 65, 83, 20);
			
			painelMenu.add(lblSexo = new JLabel("Absoluto :"));
			lblSexo.setBounds(610, 20, 60, 20);
			
			painelMenu.add(checkboxAbsolutoSupino = new JCheckBox());
			checkboxAbsolutoSupino.setText("Supino");
			checkboxAbsolutoSupino.setBounds(598, 40, 90, 20);
			
			painelMenu.add(checkboxAbsolutoAgachamento = new JCheckBox());
			checkboxAbsolutoAgachamento.setText("Agachamento");
			checkboxAbsolutoAgachamento.setBounds(598, 60, 104, 20);
			
			painelMenu.add(checkboxAbsolutoTerra = new JCheckBox());
			checkboxAbsolutoTerra.setText("Terra");
			checkboxAbsolutoTerra.setBounds(598, 80, 80, 20);;
			
			painelMenu.add(supino = new JButton("Supino"));
			supino.setBounds(255, 100, 120, 20);
			supino.addActionListener(new ListenerBuscaSupino());
			
			painelMenu.add(terra = new JButton("Terra"));
			terra.setBounds(376, 100, 120, 20);
			terra.addActionListener(new ListenerBuscaTerra());
			
			painelMenu.add(agachamento = new JButton("Agachamento"));
			agachamento.setBounds(497, 100, 120, 20);
			agachamento.addActionListener(new ListenerBuscaAgachamento());
			
			// adicionando lista modalidade
			painelMenu.add(modalidade = new JList(modalid));
			modalidade.setBounds(4, 120, 690, 20);
			
			//menu fixo tabela
			
			painelMenu.add(lblCodigo = new JLabel("Código"));
			lblCodigo.setBounds(8, 140, 50, 20);
			
			painelMenu.add(lblNome = new JLabel("Nome"));
			lblNome.setBounds(140, 140, 50, 20);
					
		    painelMenu.add(lblIdade = new JLabel("Idade"));
		    lblIdade.setBounds(270, 140, 50, 20);
		    
		    painelMenu.add(lblPeso = new JLabel("Peso"));
		    lblPeso.setBounds(340, 140, 50, 20);
		    
		    painelMenu.add(lblMelhorMarca = new JLabel("Marca"));
		    lblMelhorMarca.setBounds(410, 140, 50, 20);
		    
		    painelMenu.add(lblTentativa1 = new JLabel("Tentativa 1"));
		    lblTentativa1.setBounds(480, 140, 70, 20);
		    
		    painelMenu.add(lblTentativa2 = new JLabel("Tentativa 2"));
		    lblTentativa2.setBounds(550, 140, 70, 20);
		    
		    painelMenu.add(lblTentativa3 = new JLabel("Tentativa 3"));
		    lblTentativa3.setBounds(620, 140, 80, 20);
			//---------------------PAINEL Consulta------------------------			
			modelo = new CompetidorTableModelSupino(gravarDados.buscarTodos());
			table = new JTable();
			painelConsulta.add(table);
			table.setModel(modelo);
			
			table.getColumnModel().getColumn(0).setPreferredWidth(40);
			table.getColumnModel().getColumn(1).setPreferredWidth(220);
			table.getColumnModel().getColumn(2).setPreferredWidth(70);
			table.getColumnModel().getColumn(3).setPreferredWidth(70);
			table.getColumnModel().getColumn(4).setPreferredWidth(70);
			table.getColumnModel().getColumn(5).setPreferredWidth(70);
			table.getColumnModel().getColumn(6).setPreferredWidth(70);
			table.getColumnModel().getColumn(7).setPreferredWidth(70);
			//------------------------------------------------------------
					
			// configura a janela
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setSize(1280, 800);
			janela.setVisible(true);
		}
		public static void main(String[] args) {
			Principal principal = new Principal();
			principal.iniciar();
		}
		class ListenerListaErro implements ListSelectionListener {
			public void valueChanged(ListSelectionEvent evt) {

			}
		}
		
		public void reset(){
			txtAcademia.setText(null);
			txtAgachamentoTentativa.setText(null);
			txtAgachamentoTentativa1.setText(null);
			txtAgachamentoTentativa2.setText(null);
			txtCidade.setText(null);
			txtEmail.setText(null);
			txtEstado.setText(null);
			txtIdade.setText(null);
			txtNome.setText(null);
			txtPeso.setText(null);
			txtSupinoTentativa.setText(null);
			txtSupinoTentativa1.setText(null);
			txtSupinoTentativa2.setText(null);
			txtTelefone.setText(null);
			txtTerraTentativa.setText(null);
			txtTerraTentativa1.setText(null);
			txtTerraTentativa2.setText(null);
			txtCodigo.setText(null);
			txtAgachamentoMarca.setText(null);
			txtTerraMarca.setText(null);
			txtSupinoMarca.setText(null);
			checkboxFeminino.setSelected(false);
			checkboxMasculino.setSelected(false);
			checkboxSupino.setSelected(false);
			checkboxAgachamento.setSelected(false);
			checkboxTerra.setSelected(false);
			checkboxSupinoAbsoluto.setSelected(false);
			checkboxAgachamentoAbsoluto.setSelected(false);
			checkboxTerraAbsoluto.setSelected(false);
		}
	
		class ListenerLimparDados implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				reset();
				}
			}
		
		class ListenerBuscarCompetidor implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				int codigo=0;
				try {
					Integer.parseInt(txtCodigo.getText());
					codigo = Integer.parseInt(txtCodigo.getText());
					validar=0;
					String[] arrays = { "" };
					erros = arrays;
					erro.setListData(erros);
					erro.setBackground(Color.white);
					if (codigo < 1) {
						String[] array = { "ERRO - CODIGO COM VALOR INCORRETO" };
						erros = array;
						erro.setListData(erros);
						erro.setBackground(Color.red);
						validar=1;
					}
				} catch (NumberFormatException evt) {
					String[] array = { "ERRO - CODIGO DIGITE APENAS NÚMEROS" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
				reset();
				competidor = gravarDados.buscarPorCodigo(codigo);	
				contato = competidor.getContato();
				endereço = competidor.getEndereço();
				modalidades = competidor.getModalidades();
				tentativas = competidor.getTentativas();
				//setando valores na tela
				txtNome.setText(competidor.getNome());
				txtAcademia.setText(competidor.getEndereço().getAcademia());
				txtCidade.setText(competidor.getEndereço().getCidade());
				txtEmail.setText(competidor.getContato().getEmail());
				txtEstado.setText(competidor.getEndereço().getEstado());
				txtIdade.setText(competidor.getIdadeString());
				txtPeso.setText(competidor.getPesoString());
				txtTelefone.setText(competidor.getContato().getTelefone());
				txtSupinoTentativa.setText(competidor.getTentativas().getSupinoTentativa1String());
				txtSupinoTentativa1.setText(competidor.getTentativas().getSupinoTentativa2String());
				txtSupinoTentativa2.setText(competidor.getTentativas().getSupinoTentativa3String());
				txtSupinoMarca.setText(competidor.getModalidades().getSupinoMelhorMarcaString());
				txtTerraTentativa.setText(competidor.getTentativas().getTerraTentativa1String());
				txtTerraTentativa1.setText(competidor.getTentativas().getTerraTentativa2String());
				txtTerraTentativa2.setText(competidor.getTentativas().getTerraTentativa3String());
				txtTerraMarca.setText(competidor.getModalidades().getTerraMelhorMarcaString());
				txtAgachamentoTentativa.setText(competidor.getTentativas().getAgachamentoTentativa1String());
				txtAgachamentoTentativa1.setText(competidor.getTentativas().getAgachamentoTentativa2String());
				txtAgachamentoTentativa2.setText(competidor.getTentativas().getAgachamentoTentativa3String());
				txtAgachamentoMarca.setText(competidor.getModalidades().getAgachamentoMelhorMarcaString());				
				if (competidor.getModalidades().getTerra().equals("Sim")){
					checkboxTerra.setSelected(true);
					checkboxTerra.repaint();
				}
				if (competidor.getModalidades().getSupino().equals("Sim")){
					checkboxSupino.setSelected(true);
					checkboxSupino.repaint();
				}
				if (competidor.getModalidades().getAgachamento().equals("Sim")){
					checkboxAgachamento.setSelected(true);
					checkboxAgachamento.repaint();
				}
				if (competidor.getSexo().equals("Feminino")){
					checkboxFeminino.setSelected(true);
					checkboxFeminino.repaint();
				}
				if (competidor.getSexo().equals("Masculino")){
					checkboxMasculino.setSelected(true);
					checkboxMasculino.repaint();
				}
				if (competidor.getModalidades().getSupinoAbsoluto().equals("Sim")){
					checkboxSupinoAbsoluto.setSelected(true);
					checkboxSupinoAbsoluto.repaint();
				}
				if (competidor.getModalidades().getAgachamentoAbsoluto().equals("Sim")){
					checkboxAgachamentoAbsoluto.setSelected(true);
					checkboxAgachamentoAbsoluto.repaint();
				}
				if (competidor.getModalidades().getTerraAbsoluto().equals("Sim")){
					checkboxTerraAbsoluto.setSelected(true);
					checkboxTerraAbsoluto.repaint();
				}			
				String[] arrays = { "                     Busca realizada com sucesso." };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
			}
		}
		
		class ListenerNovoCompetidor implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				competidor = new Competidor();
				contato = new Contato();
				endereço = new Endereço();
				modalidades = new Modalidades();
				tentativas = new Tentativas();
				reset();
				String[] arrays = { "                     Cadastrando novo competidor..." };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
			}
		}
		class ListenerBuscaSupino implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				int modalidades = 1;
				int marca = 0;
				String absoluto="";
				if (checkboxAbsolutoSupino.isSelected()){
					absoluto = "Supino";
				}
				if (checkboxAbsolutoAgachamento.isSelected()){
					absoluto = "Agachamento";
				}
				if (checkboxAbsolutoTerra.isSelected()){
					absoluto = "Terra";
				}
				if (checkboxMarca.isSelected()){
					marca = 1;
				}
				double peso = 0;
				try {
					Double.parseDouble(txtPesoEntre1.getText());
					peso = Double.parseDouble(txtPesoEntre1.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (peso > 10000) {
						String[] array = { "ERRO BUSCA POR PESO COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				double peso1 = 0;
				try {
					Double.parseDouble(txtPesoEntre2.getText());
					peso1 = Double.parseDouble(txtPesoEntre2.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (peso1 > 10000) {
						String[] array = { "ERRO BUSCA POR PESO COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				if (validar==1){
					peso1 = 0;
				}
				int idade1=0;
				try {
					Integer.parseInt(txtIdadeEntre1.getText());
					idade1 = Integer.parseInt(txtIdadeEntre1.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (idade1 > 100) {
						String[] array = { "ERRO BUSCA POR IDADE COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				
				int idade2=0;
				try {
					Integer.parseInt(txtIdadeEntre2.getText());
					idade2 = Integer.parseInt(txtIdadeEntre2.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (idade2 > 100) {
						String[] array = { "ERRO BUSCA POR IDADE COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				String nome = "";
				if (!txtNomeIgual.getText().isEmpty()){
					nome = txtNomeIgual.getText();
				}
				String sexo = "";
				if (checkboxSexoIgualF.isSelected()){
					sexo = "Feminino";
				}else if (checkboxSexoIgualM.isSelected()){
					sexo = "Masculino";
				}
				int idadeO=0;
				if (checkboxIdade.isSelected()){
					idadeO = 1;
				}
				int pesoO=0;
				if (checkboxPeso.isSelected()){
					pesoO = 1;
				}
				painelConsulta.removeAll();
				painelConsulta.repaint();  
				painelConsulta.revalidate(); 
				modelo = new CompetidorTableModelSupino(gravarDados.buscarComRestrição(nome, absoluto, modalidades, pesoO, peso, peso1, idadeO, idade1, idade2, marca, sexo));
				table = new JTable();
				painelConsulta.add(table);
				table.setModel(modelo);
				table.getColumnModel().getColumn(0).setPreferredWidth(40);
				table.getColumnModel().getColumn(1).setPreferredWidth(220);
				table.getColumnModel().getColumn(2).setPreferredWidth(70);
				table.getColumnModel().getColumn(3).setPreferredWidth(70);
				table.getColumnModel().getColumn(4).setPreferredWidth(70);
				table.getColumnModel().getColumn(5).setPreferredWidth(70);
				table.getColumnModel().getColumn(6).setPreferredWidth(70);
				table.getColumnModel().getColumn(7).setPreferredWidth(70);
			}
		}
		
		class ListenerBuscaTerra implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				int modalidades = 3;
				int marca = 0;
				String absoluto="";
				if (checkboxAbsolutoSupino.isSelected()){
					absoluto = "Supino";
				}
				if (checkboxAbsolutoAgachamento.isSelected()){
					absoluto = "Agachamento";
				}
				if (checkboxAbsolutoTerra.isSelected()){
					absoluto = "Terra";
				}
				if (checkboxMarca.isSelected()){
					marca = 3;
				}
				double peso = 0;
				try {
					Double.parseDouble(txtPesoEntre1.getText());
					peso = Double.parseDouble(txtPesoEntre1.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (peso > 10000) {
						String[] array = { "ERRO BUSCA POR PESO COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				double peso1 = 0;
				try {
					Double.parseDouble(txtPesoEntre2.getText());
					peso1 = Double.parseDouble(txtPesoEntre2.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (peso1 > 10000) {
						String[] array = { "ERRO BUSCA POR PESO COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				if (validar==1){
					peso1 = 0;
				}
				int idade1=0;
				try {
					Integer.parseInt(txtIdadeEntre1.getText());
					idade1 = Integer.parseInt(txtIdadeEntre1.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (idade1 > 100) {
						String[] array = { "ERRO BUSCA POR IDADE COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				
				int idade2=0;
				try {
					Integer.parseInt(txtIdadeEntre2.getText());
					idade2 = Integer.parseInt(txtIdadeEntre2.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (idade2 > 100) {
						String[] array = { "ERRO BUSCA POR IDADE COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				String nome = "";
				if (!txtNomeIgual.getText().isEmpty()){
					nome = txtNomeIgual.getText();
				}
				String sexo = "";
				if (checkboxSexoIgualF.isSelected()){
					sexo = "Feminino";
				}else if (checkboxSexoIgualM.isSelected()){
					sexo = "Masculino";
				}
				int idadeO=0;
				if (checkboxIdade.isSelected()){
					idadeO = 1;
				}
				int pesoO=0;
				if (checkboxPeso.isSelected()){
					pesoO = 1;
				}
				painelConsulta.removeAll();
				painelConsulta.repaint();  
				painelConsulta.revalidate(); 
				modelo1 = new CompetidorTableModelTerra(gravarDados.buscarComRestrição(nome, absoluto, modalidades, pesoO, peso, peso1, idadeO, idade1, idade2, marca, sexo));
				table = new JTable();
				painelConsulta.add(table);
				table.setModel(modelo1);
				table.getColumnModel().getColumn(0).setPreferredWidth(40);
				table.getColumnModel().getColumn(1).setPreferredWidth(220);
				table.getColumnModel().getColumn(2).setPreferredWidth(70);
				table.getColumnModel().getColumn(3).setPreferredWidth(70);
				table.getColumnModel().getColumn(4).setPreferredWidth(70);
				table.getColumnModel().getColumn(5).setPreferredWidth(70);
				table.getColumnModel().getColumn(6).setPreferredWidth(70);
				table.getColumnModel().getColumn(7).setPreferredWidth(70);
			}
		}
		
		class ListenerBuscaAgachamento implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				int modalidades = 2;
				int marca = 0;
				String absoluto="";
				if (checkboxAbsolutoSupino.isSelected()){
					absoluto = "Supino";
				}
				if (checkboxAbsolutoAgachamento.isSelected()){
					absoluto = "Agachamento";
				}
				if (checkboxAbsolutoTerra.isSelected()){
					absoluto = "Terra";
				}
				if (checkboxMarca.isSelected()){
					marca = 2;
				}
				double peso = 0;
				try {
					Double.parseDouble(txtPesoEntre1.getText());
					peso = Double.parseDouble(txtPesoEntre1.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (peso > 10000) {
						String[] array = { "ERRO BUSCA POR PESO COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				double peso1 = 0;
				try {
					Double.parseDouble(txtPesoEntre2.getText());
					peso1 = Double.parseDouble(txtPesoEntre2.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (peso1 > 10000) {
						String[] array = { "ERRO BUSCA POR PESO COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				if (validar==1){
					peso1 = 0;
				}
				int idade1=0;
				try {
					Integer.parseInt(txtIdadeEntre1.getText());
					idade1 = Integer.parseInt(txtIdadeEntre1.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (idade1 > 100) {
						String[] array = { "ERRO BUSCA POR IDADE COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				
				int idade2=0;
				try {
					Integer.parseInt(txtIdadeEntre2.getText());
					idade2 = Integer.parseInt(txtIdadeEntre2.getText());
					validar=0;
					String[] arrays = { "" };
					modalid = arrays;
					modalidade.setListData(modalid);
					modalidade.setBackground(Color.white);
					if (idade2 > 100) {
						String[] array = { "ERRO BUSCA POR IDADE COM VALOR INCORRETO" };
						modalid = array;
						modalidade.setListData(modalid);
						modalidade.setBackground(Color.red);
						validar=1;
					}
				} catch (Exception ee) {
				}
				String nome = "";
				if (!txtNomeIgual.getText().isEmpty()){
					nome = txtNomeIgual.getText();
				}
				String sexo = "";
				if (checkboxSexoIgualF.isSelected()){
					sexo = "Feminino";
				}else if (checkboxSexoIgualM.isSelected()){
					sexo = "Masculino";
				}
				int idadeO=0;
				if (checkboxIdade.isSelected()){
					idadeO = 1;
				}
				int pesoO=0;
				if (checkboxPeso.isSelected()){
					pesoO = 1;
				}
				painelConsulta.removeAll();
				painelConsulta.repaint();  
				painelConsulta.revalidate(); 
				modelo2 = new CompetidorTableModelAgachamento(gravarDados.buscarComRestrição(nome, absoluto, modalidades, pesoO, peso, peso1, idadeO, idade1, idade2, marca, sexo));
				table = new JTable();
				painelConsulta.add(table);
				table.setModel(modelo2);
				table.getColumnModel().getColumn(0).setPreferredWidth(40);
				table.getColumnModel().getColumn(1).setPreferredWidth(220);
				table.getColumnModel().getColumn(2).setPreferredWidth(70);
				table.getColumnModel().getColumn(3).setPreferredWidth(70);
				table.getColumnModel().getColumn(4).setPreferredWidth(70);
				table.getColumnModel().getColumn(5).setPreferredWidth(70);
				table.getColumnModel().getColumn(6).setPreferredWidth(70);
				table.getColumnModel().getColumn(7).setPreferredWidth(70);
			}
		}

	class ListenerSalvarDados implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			// -----------------------------VALIDAÇÃO E SET DADOS
			// validação  NOME
			String nome = txtNome.getText();
			if (nome==""){
				validar=1;
			}
			//ACADEMIA - CIDADE - ESTADO
			String academia = txtAcademia.getText();
			String cidade = txtCidade.getText();
			String estado = txtEstado.getText();
			// validação SEXO
			String sexo="";
			if (checkboxFeminino.isSelected()){				
				sexo = "Feminino";
			}else if (checkboxMasculino.isSelected()){
				sexo = "Masculino";
			}else{
				validar=1;
			}
			// validação IDADE
			int idade=0;
			try {
				Integer.parseInt(txtIdade.getText());
				idade = Integer.parseInt(txtIdade.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (idade < 1 || idade > 99) {
					String[] array = { "ERRO - IDADE COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (NumberFormatException evt) {
				String[] array = { "ERRO - IDADE DIGITE APENAS NÚMEROS" };
				erros = array;
				erro.setListData(erros);
				erro.setBackground(Color.red);
				validar=1;
			}
			// validação PESO
			double peso=0;
			try {
				Double.parseDouble(txtPeso.getText());
				peso = Double.parseDouble(txtPeso.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (peso > 500) {
					String[] array = { "ERRO - PESO COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (NumberFormatException evt) {
				String[] array = { "ERRO - PESO DIGITE APENAS NÚMEROS" };
				erros = array;
				erro.setListData(erros);
				erro.setBackground(Color.red);
				validar=1;
			}
			// validação tentativas
			int supinoTentativa=0;
			try {
				Integer.parseInt(txtSupinoTentativa.getText());
				supinoTentativa = Integer.parseInt(txtSupinoTentativa.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (supinoTentativa > 1000) {
					String[] array = { "ERRO SUPINO TENTATIVA 1 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int agachamentoTentativa=0;
			try {
				Integer.parseInt(txtAgachamentoTentativa.getText());
				agachamentoTentativa = Integer.parseInt(txtAgachamentoTentativa.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (agachamentoTentativa > 1000) {
					String[] array = { "ERRO Agachamento TENTATIVA 1 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int terraTentativa=0;
			try {
				Integer.parseInt(txtTerraTentativa.getText());
				terraTentativa = Integer.parseInt(txtTerraTentativa.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (terraTentativa > 1000) {
					String[] array = { "ERRO Terra TENTATIVA 1 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int terraTentativa2=0;
			try {
				Integer.parseInt(txtTerraTentativa1.getText());
				terraTentativa2 = Integer.parseInt(txtTerraTentativa1.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (terraTentativa2 > 1000) {
					String[] array = { "ERRO Terra TENTATIVA 2 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int terraTentativa3=0;
			try {
				Integer.parseInt(txtTerraTentativa2.getText());
				terraTentativa3 = Integer.parseInt(txtTerraTentativa2.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (terraTentativa3 > 1000) {
					String[] array = { "ERRO Terra TENTATIVA 3 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int terraMarca=0;
			try {
				Integer.parseInt(txtTerraMarca.getText());
				terraMarca = Integer.parseInt(txtTerraMarca.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (terraMarca > 1000) {
					String[] array = { "ERRO Terra MARCA COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}		
			
			
			int supinoTentativa2=0;
			try {
				Integer.parseInt(txtSupinoTentativa1.getText());
				supinoTentativa2 = Integer.parseInt(txtSupinoTentativa1.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (supinoTentativa2 > 1000) {
					String[] array = { "ERRO Supino TENTATIVA 2 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int supinoTentativa3=0;
			try {
				Integer.parseInt(txtSupinoTentativa2.getText());
				supinoTentativa3 = Integer.parseInt(txtSupinoTentativa2.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (supinoTentativa3 > 1000) {
					String[] array = { "ERRO Supino TENTATIVA 3 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int supinoMarca=0;
			try {
				Integer.parseInt(txtSupinoMarca.getText());
				supinoMarca = Integer.parseInt(txtSupinoMarca.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (supinoMarca > 1000) {
					String[] array = { "ERRO Supino MARCA COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int agachamentoTentativa2=0;
			try {
				Integer.parseInt(txtAgachamentoTentativa1.getText());
				agachamentoTentativa2 = Integer.parseInt(txtAgachamentoTentativa1.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (agachamentoTentativa2 > 1000) {
					String[] array = { "ERRO Agachamento TENTATIVA 2 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int agachamentoTentativa3=0;
			try {
				Integer.parseInt(txtAgachamentoTentativa2.getText());
				agachamentoTentativa3 = Integer.parseInt(txtAgachamentoTentativa2.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (agachamentoTentativa3 > 1000) {
					String[] array = { "ERRO Agachamento TENTATIVA 3 COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			int agachamentoMarca=0;
			try {
				Integer.parseInt(txtAgachamentoMarca.getText());
				agachamentoMarca = Integer.parseInt(txtAgachamentoMarca.getText());
				validar=0;
				String[] arrays = { "" };
				erros = arrays;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				if (agachamentoMarca > 1000) {
					String[] array = { "ERRO Agachamento MARCA COM VALOR INCORRETO" };
					erros = array;
					erro.setListData(erros);
					erro.setBackground(Color.red);
					validar=1;
				}
			} catch (Exception evt) {
			}
			
			//set modalidades

			if (checkboxSupino.isSelected()){				
				modalidades.setSupino("Sim");
			}else{
				modalidades.setSupino("Não");
			}
			if (checkboxAgachamento.isSelected()){				
				modalidades.setAgachamento("Sim");
			}else{
				modalidades.setAgachamento("Não");
			}
			if (checkboxTerra.isSelected()){				
				modalidades.setTerra("Sim");
			}else{
				modalidades.setTerra("Não");
			}			
			
			// set absoluto
			
			if (checkboxSupinoAbsoluto.isSelected()){
				modalidades.setSupinoAbsoluto("Sim");
			}else{
				modalidades.setSupinoAbsoluto("Não");
			}
			if (checkboxAgachamentoAbsoluto.isSelected()){
				modalidades.setAgachamentoAbsoluto("Sim");
			}else{
				modalidades.setAgachamentoAbsoluto("Não");
			}
			if (checkboxTerraAbsoluto.isSelected()){
				modalidades.setTerraAbsoluto("Sim");
			}else{
				modalidades.setTerraAbsoluto("Não");
			}
			
			String telefone = txtTelefone.getText();
			String email = txtEmail.getText();
			
			//SETS
			tentativas.setSupinoTentativa1(supinoTentativa);
			tentativas.setSupinoTentativa2(supinoTentativa2);
			tentativas.setSupinoTentativa3(supinoTentativa3);
			tentativas.setAgachamentoTentativa1(agachamentoTentativa);
			tentativas.setAgachamentoTentativa2(agachamentoTentativa2);
			tentativas.setAgachamentoTentativa3(agachamentoTentativa3);
			tentativas.setTerraTentativa1(terraTentativa);
			tentativas.setTerraTentativa2(terraTentativa2);
			tentativas.setTerraTentativa3(terraTentativa3);
			
			modalidades.setSupinoMelhorMarca(supinoMarca);
			modalidades.setAgachamentoMelhorMarca(agachamentoMarca);
			modalidades.setTerraMelhorMarca(terraMarca);
			
			endereço.setAcademia(academia);
			endereço.setCidade(cidade);
			endereço.setEstado(estado);
			
			contato.setEmail(email);
			contato.setTelefone(telefone);
			
			competidor.setIdade(idade);
			competidor.setNome(nome);
			competidor.setPeso(peso);
			competidor.setSexo(sexo);
			
			competidor.setModalidades(modalidades);
			competidor.setTentativas(tentativas);
			competidor.setEndereço(endereço);
			competidor.setContato(contato);

			if (validar == 0) {
				try {
					gravarDados.salvar(contato);
					gravarDados.salvar(endereço);
					gravarDados.salvar(modalidades);
					gravarDados.salvar(tentativas);
					gravarDados.salvar(competidor);
				} catch (Exception a) {
					System.out.println(a.getMessage());
				}
				String[] arra = { "                  DADOS INCLUIDOS COM SUCESSO" };
				erros = arra;
				erro.setListData(erros);
				erro.setBackground(Color.white);
				reset();
				competidor = new Competidor();
				contato = new Contato();
				endereço = new Endereço();
				modalidades = new Modalidades();
				tentativas = new Tentativas();
			}
		}
	}
}