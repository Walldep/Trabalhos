package javaThread;

import static java.awt.GridBagConstraints.WEST;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TelaTimer1 extends JDialog {

	private JPanel painel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
	private JLabel descricao = new JLabel("Timer thread 1");
	private JTextField tempo = new JTextField();

	private JLabel descricao2 = new JLabel("Timer thread 2");
	private JTextField tempo2 = new JTextField();

	private JButton botao = new JButton("Start");
	private JButton botao2 = new JButton("Stop");

	private Thread Timer1;
	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			while (true) {
				tempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
					try {Thread.sleep(1000); }
						catch (InterruptedException e) {e.printStackTrace(); } } } };


	private Thread Timer2;
	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			while (true) {
				tempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
					try {Thread.sleep(1000); }
						catch (InterruptedException e) {e.printStackTrace(); } } } };


	public TelaTimer1() {

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
		tempo.setEditable(false);
		painel.add(tempo, GridBagConstraints);

		descricao2.setPreferredSize(new Dimension(200,25));
		GridBagConstraints.gridy ++;
		painel.add(descricao2, GridBagConstraints);

		tempo2.setPreferredSize(new Dimension(195,25));
		GridBagConstraints.gridy ++;
		tempo2.setEditable(false);
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
				Timer1 = new Thread(thread1);
				Timer1.start();

				Timer2 = new Thread(thread2);
				Timer2.start();

				botao.setEnabled(false);
				botao2.setEnabled(true); } } );


		botao2.addActionListener(new ActionListener() {

			@SuppressWarnings("removal")
			@Override
			public void actionPerformed(ActionEvent e) {
				Timer1.stop();
				Timer2.stop();

				botao.setEnabled(true);
				botao2.setEnabled(false); } } );


		botao2.setEnabled(false);

		add(painel, BorderLayout.WEST);
		/*sempre será o ultimo comando*/
		setVisible(true);/*Torna visivel a janela para o usuario*/



	}
}
