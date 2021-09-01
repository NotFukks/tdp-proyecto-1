package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel jLabelLU;
	private JTextField textFieldLU;
	private JTextField textFieldApellido;
	private JTextField textFieldNombre;
	private JTextField textFieldEmail;
	private JTextField textFieldGithubURL;
	private JLabel jLabelEjecucion;
	private JLabel jLabelImagen;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		// Icono
		this.setIconImage(new ImageIcon(getClass().getResource("/images/tdp.png")).getImage());
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		jLabelLU = new JLabel("LU");
		jLabelLU.setHorizontalAlignment(SwingConstants.LEFT);
		jLabelLU.setVerticalAlignment(SwingConstants.TOP);
		
		textFieldLU = new JTextField();
		textFieldLU.setColumns(10);
		textFieldLU.setText("" + studentData.getId());
		
		JLabel jLabelApellido = new JLabel("Apellido");
		jLabelApellido.setVerticalAlignment(SwingConstants.TOP);
		jLabelApellido.setHorizontalAlignment(SwingConstants.LEFT);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setText(studentData.getLastName());
		
		JLabel jLabelNombre = new JLabel("Nombre");
		jLabelNombre.setVerticalAlignment(SwingConstants.TOP);
		jLabelNombre.setHorizontalAlignment(SwingConstants.LEFT);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setText(studentData.getFirstName());
		
		JLabel jLabelEmail = new JLabel("E-mail");
		jLabelEmail.setVerticalAlignment(SwingConstants.TOP);
		jLabelEmail.setHorizontalAlignment(SwingConstants.LEFT);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setText(studentData.getMail());
		
		JLabel jLabelGithubURL = new JLabel("Github URL");
		jLabelGithubURL.setVerticalAlignment(SwingConstants.TOP);
		jLabelGithubURL.setHorizontalAlignment(SwingConstants.LEFT);
		
		textFieldGithubURL = new JTextField();
		textFieldGithubURL.setColumns(10);
		textFieldGithubURL.setText(studentData.getGithubURL());
		
		
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabelNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_tabInformation.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(jLabelGithubURL, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jLabelEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(jLabelApellido, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabelLU, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_tabInformation.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldEmail, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
						.addComponent(textFieldGithubURL, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldLU, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_tabInformation.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldNombre, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
						.addComponent(textFieldApellido, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelLU)
						.addComponent(textFieldLU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelApellido)
						.addComponent(textFieldApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelEmail)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldGithubURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelGithubURL))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		// Hora y fecha ejecutada.
		DateTimeFormatter dtfFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dftHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		jLabelEjecucion = new JLabel("Esta ventana fue generada el " + dtfFecha.format(LocalDateTime.now()) 
										+ " a las " + dftHora.format(LocalDateTime.now()));
		
		contentPane.add(jLabelEjecucion, BorderLayout.SOUTH);
		
		// Imagen
		jLabelImagen = new JLabel("");
		jLabelImagen.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(jLabelImagen, BorderLayout.EAST);
		
		jLabelImagen.setBounds(0, 0, 153, 105);
		
		ImageIcon imageIcon = new
				ImageIcon(getClass().getResource(studentData.getPathPhoto()));
		Image imageEscalada = imageIcon.getImage().getScaledInstance(jLabelImagen.getWidth(),
				jLabelImagen.getHeight(), Image.SCALE_SMOOTH);
		
		Icon icono = new ImageIcon(imageEscalada);
		
		jLabelImagen.setIcon(icono);
		
	}
}
