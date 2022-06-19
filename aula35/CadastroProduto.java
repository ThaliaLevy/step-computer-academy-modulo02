package aula35;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class CadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto frame = new CadastroProduto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CadastroProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("CADASTRO DE PRODUTOS");
		lblTitulo.setBounds(141, 11, 225, 49);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("Informação do produto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(33, 71, 176, 14);
		panel.add(lblNewLabel);
		
		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setBounds(33, 112, 46, 14);
		panel.add(lblCodigo);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setBounds(30, 149, 107, 27);
		panel.add(lblDescricao);
		
		JLabel lblUnidadeMedida = new JLabel("Unid. Medida:");
		lblUnidadeMedida.setBounds(33, 204, 104, 27);
		panel.add(lblUnidadeMedida);
		
		JLabel lblValorUnitario = new JLabel("Valor Unit.:");
		lblValorUnitario.setBounds(33, 255, 78, 27);
		panel.add(lblValorUnitario);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(30, 320, 89, 23);
		panel.add(btnSalvar);
		
		JButton btnLocalizar = new JButton("Localizar");
		btnLocalizar.setBounds(141, 320, 89, 23);
		panel.add(btnLocalizar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(255, 320, 89, 23);
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(361, 320, 89, 23);
		panel.add(btnExcluir);
		
		textField = new JTextField();
		textField.setBounds(107, 109, 242, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 152, 242, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 258, 242, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(109, 207, 240, 20);
		panel.add(comboBox);
		
		
	}
}
