package pjAula5;

// GUI - Interface Gr�fica com usu�rio

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmCadastro extends JFrame implements ActionListener{
    // 1 passo - declarar
    JButton btCadastrar, btAlterar, btExcluir, btPesquisar;
    JLabel lbCodigo, lbNome, lbEmail, lbTelefone;
    JTextField txtCodigo, txtNome, txtEmail, txtTelefone;
    JPanel pnCampos, pnBotoes;

    public frmCadastro() {
        super("Cadastro de Clientes");
        setSize(400, 200);
        setLayout(new BorderLayout());

        // 2 passo - Construir os componentes
        btCadastrar = new JButton("Cadastrar");
        btAlterar = new JButton("Alterar");
        btExcluir = new JButton("Excluir");
        btPesquisar = new JButton("Pesquisar");
        lbCodigo = new JLabel("C�digo");
        lbNome = new JLabel("Nome");
        lbTelefone = new JLabel("Telefone");
        lbEmail = new JLabel("Email");
        txtCodigo = new JTextField(20);
        txtNome = new JTextField(20);
        txtEmail = new JTextField(20);
        txtTelefone = new JTextField("Informe o telefone", 20);
        pnCampos = new JPanel(new GridLayout(4, 2, 5, 5));
        pnBotoes = new JPanel(new GridLayout(1, 4, 5, 5));

        // 3 passo - Adicionar os componentes
        pnCampos.add(lbCodigo);
        pnCampos.add(txtCodigo);
        pnCampos.add(lbNome);
        pnCampos.add(txtNome);
        pnCampos.add(lbEmail);
        pnCampos.add(txtEmail);
        pnCampos.add(lbTelefone);
        pnCampos.add(txtTelefone);

        add(pnCampos, BorderLayout.CENTER);

        pnBotoes.add(btCadastrar);
        pnBotoes.add(btAlterar);
        pnBotoes.add(btExcluir);
        pnBotoes.add(btPesquisar);

        add(pnBotoes, BorderLayout.SOUTH);
        
        //4 passo - Adicionar a Lista de a��es 
        btCadastrar.addActionListener(this);
        btAlterar.addActionListener(this);
        btExcluir.addActionListener(this);
        
        setVisible(true);
    }
    public void actionPerformed1(ActionEvent e) {
    	if(e.getSource() == btCadastrar) {
    		JOptionPane.showMessageDialog(null, "C�digo " + txtCodigo.getText()
    		                                     + "Nome " + txtNome.getText());
    	}
    	if (e.getSource()==btAlterar);{
    		btCadastrar.removeActionListener(this);
    	}
    	if (e.getSource()==btExcluir);{
    		btExcluir.addActionListener(this);
    	}
    }
    public static void main(String[] args) {
        frmCadastro frm = new frmCadastro();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

