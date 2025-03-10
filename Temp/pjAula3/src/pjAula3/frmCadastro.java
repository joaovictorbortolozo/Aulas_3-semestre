package pjAula3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmCadastro extends JFrame {
	//1 passo declarar
	JButton btCadastrar, btPesquisar;
	JTextField txtCodigo, txtNome;
	JLabel lbCodigo, lbNome;
   
	public frmCadastro() {
		setTitle("Formulario de cadastro");
		setSize(300,300);
		setLayout(new FlowLayout());
	    
		// 2 passo Construir
		btCadastrar = new JButton("Cadastrar");
		btPesquisar = new JButton("Pesquisar");
		txtCodigo = new JTextField(20);
		txtNome = new JTextField("Digite aqui",20);
		lbCodigo = new JLabel("Código");
		lbNome = new JLabel("Nome");
		
		btCadastrar.setMnemonic('C');
		btPesquisar.setMnemonic('P'); 
		
		btCadastrar.setToolTipText("Cadastrar Equipamento");
		
		// 3 passo adiciona
        add(lbCodigo);	
		add(txtCodigo);
		add(lbNome);
		add(txtNome);
		add(btCadastrar);
		add(btPesquisar);
		
		
		setVisible(true);
	}
	 
	public static void main(String[]args) {
		frmCadastro frm = new frmCadastro();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}