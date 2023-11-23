package FilaePilha;

import static java.awt.GridBagConstraints.WEST;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class TelaFilaPilha extends JDialog {
		
		private JPanel painel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
		private JLabel descricao = new JLabel("Nome");
		private JTextField tempo = new JTextField();

		private JLabel descricao2 = new JLabel("Email");
		private JTextField tempo2 = new JTextField();

		private JButton botao = new JButton("Add lista");
		private JButton botao2 = new JButton("Stop");

		private implementacaoFilaThread fila = new implementacaoFilaThread();
		
		
public TelaFilaPilha() {

		setTitle("Tela de Timer experimental JAVA");
		setSize(new Dimension(300,300));
		setLocationRelativeTo(null);
		setResizable(false);
		// primeira parte feita //


		GridBagConstraints GridBagConstraints = new GridBagConstraints();
		GridBagConstraints.gridx = 0;
		GridBagConstraints.gridy = 0;
		GridBagConstraints.gridwidth = 2;
		GridBagConstraints.insets = new Insets(5, 10, 5, 5);
		GridBagConstraints.anchor = WEST;
		//controladora de posições da tabela

		descricao.setPreferredSize(new Dimension(200,25));
		painel.add(descricao, GridBagConstraints);

		tempo.setPreferredSize(new Dimension(195,25));
		GridBagConstraints.gridy ++;
		painel.add(tempo, GridBagConstraints);

		descricao2.setPreferredSize(new Dimension(200,25));
		GridBagConstraints.gridy ++;
		painel.add(descricao2, GridBagConstraints);

		tempo2.setPreferredSize(new Dimension(195,25));
		GridBagConstraints.gridy ++;
		painel.add(tempo2, GridBagConstraints);

		GridBagConstraints.gridwidth = 1;

		botao.setPreferredSize(new Dimension(90,40));
		GridBagConstraints.gridy ++;
		painel.add(botao, GridBagConstraints);

		botao2.setPreferredSize(new Dimension(90,40));
		GridBagConstraints.gridx ++;
		painel.add(botao2, GridBagConstraints);

			botao.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {			
					if(fila == null) {
						fila = new implementacaoFilaThread();
						fila.start(); }
					
					for(int qtd = 0; qtd < 20; qtd ++) {
						ObjFilaThread filaThread = new ObjFilaThread();
						filaThread.setNome(tempo.getText());
						filaThread.setEmail(tempo2.getText() + " next " + qtd);
						implementacaoFilaThread.add(filaThread);
					
					} } } );

			botao2.addActionListener(new ActionListener() {
								
				@SuppressWarnings("removal")
				@Override
				public void actionPerformed(ActionEvent e) {				
					fila.stop();
					fila = null;
				} } );
			
			
			fila.start();
			add(painel, BorderLayout.WEST);
			/*sempre será o ultimo comando*/
			setVisible(true);/*Torna visivel a janela para o usuario*/

	}
}