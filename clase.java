public LoginFrame() {
		loginPresenter = new LoginPresenter(this);

		setTitle("Login Sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Username");
		lblNombre.setBounds(10, 8, 70, 14);
		contentPane.add(lblNombre);

		JLabel lblPassword = new JLabel("Contra");
		lblPassword.setBounds(10, 36, 98, 14);
		contentPane.add(lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(129, 33, 104, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);

		JButton btnLogin = new JButton("Ingresar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPresenter.validar(txtUsuario.getText(), txtPassword.getText());

				VentanaPrincipal frame = new VentanaPrincipal();
				frame.setVisible(true);
			}
		});
		btnLogin.setBounds(115, 83, 100, 23);
		contentPane.add(btnLogin);
	}
