import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    Paciente paciente = new Paciente();
    PacienteDAO pacientedao = new PacienteDAO();
    
    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        lblEstadoCivil = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        lblNacionalidade = new javax.swing.JLabel();
        txtNacionalidade = new javax.swing.JTextField();
        lblMae = new javax.swing.JLabel();
        txtMãe = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblNaturalidade = new javax.swing.JLabel();
        txtNaturalidade = new javax.swing.JTextField();
        lblProfissao = new javax.swing.JLabel();
        txtProfissão = new javax.swing.JTextField();
        lblPai = new javax.swing.JLabel();
        txtPai = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        lblTipoSanguineo = new javax.swing.JLabel();
        txtTipoSanguineo = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblNumeroCNS = new javax.swing.JLabel();
        txtNumeroCNS = new javax.swing.JTextField();
        lblUnidadedeReferencia = new javax.swing.JLabel();
        txtUnidadedeReferencia = new javax.swing.JTextField();
        lblMedicodeReferencia = new javax.swing.JLabel();
        txtMedicodeReferencia = new javax.swing.JTextField();
        lblEnderecoResidencial = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblLogradouro = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Informações do Paciente");

        lblNome.setText("Nome:");

        lblSexo.setText("Sexo");

        lblNascimento.setText("Nascimento");

        lblIdade.setText("Idade");

        lblEstadoCivil.setText("Estado Civil");

        lblNacionalidade.setText("Nacionalidade");

        lblMae.setText("Mãe");

        lblRG.setText("RG");

        lblCPF.setText("CPF");

        lblNaturalidade.setText("Naturalidade");

        lblProfissao.setText("Profissão");

        lblPai.setText("Pai");

        lblRaca.setText("Raça");

        lblTipoSanguineo.setText("Tipo Sanguíneo");

        lblEmail.setText("E-mail");

        lblNumeroCNS.setText("Número Cartão Nacional de Saúde");

        lblUnidadedeReferencia.setText("Unidade de Referência");

        lblMedicodeReferencia.setText("Médico de Referência");

        lblEnderecoResidencial.setText("Endereço Residencial");

        lblLogradouro.setText("Logradouro");

        lblNumero.setText("Número");

        lblComplemento.setText("Complemento");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        lblEstado.setText("Estado");

        lblCEP.setText("CEP");

        lblTelefone.setText("Telefone");

        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, new java.awt.Color(51, 102, 255)));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, new java.awt.Color(51, 102, 255)));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, new java.awt.Color(51, 102, 255)));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, new java.awt.Color(51, 51, 255)));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, new java.awt.Color(51, 102, 255)));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMae)
                                    .addComponent(txtMãe, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtRG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblRG)
                                    .addComponent(lblRaca)
                                    .addComponent(lblSexo)))
                            .addComponent(lblPai)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTipoSanguineo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNascimento))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblIdade)
                                                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lblCPF)))
                            .addComponent(lblTipoSanguineo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEmail)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNacionalidade))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNaturalidade)
                                        .addGap(129, 129, 129)
                                        .addComponent(lblProfissao))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProfissão, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumeroCNS, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidadedeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedicodeReferencia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEnderecoResidencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(599, 599, 599)
                                .addComponent(lblEstadoCivil)
                                .addGap(59, 59, 59)
                                .addComponent(lblNacionalidade))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumeroCNS)
                                .addGap(111, 111, 111)
                                .addComponent(lblUnidadedeReferencia)
                                .addGap(251, 251, 251)
                                .addComponent(lblMedicodeReferencia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLogradouro)
                                .addGap(266, 266, 266)
                                .addComponent(lblNumero)
                                .addGap(64, 64, 64)
                                .addComponent(lblComplemento)
                                .addGap(204, 204, 204)
                                .addComponent(lblBairro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addGap(287, 287, 287)
                                .addComponent(lblEstado)
                                .addGap(340, 340, 340)
                                .addComponent(lblCEP)
                                .addGap(133, 133, 133)
                                .addComponent(lblTelefone)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEstado))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblSexo)
                    .addComponent(lblNascimento)
                    .addComponent(lblIdade)
                    .addComponent(lblEstadoCivil)
                    .addComponent(lblNacionalidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMae)
                    .addComponent(lblRG)
                    .addComponent(lblCPF)
                    .addComponent(lblNaturalidade)
                    .addComponent(lblProfissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMãe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfissão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPai)
                    .addComponent(lblRaca)
                    .addComponent(lblTipoSanguineo)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroCNS)
                            .addComponent(lblUnidadedeReferencia)
                            .addComponent(lblMedicodeReferencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroCNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidadedeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedicodeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblEnderecoResidencial))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogradouro)
                    .addComponent(lblNumero)
                    .addComponent(lblComplemento)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblEstado)
                    .addComponent(lblCEP)
                    .addComponent(lblTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnConsultar)
                    .addComponent(btnSair)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addContainerGap(417, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem.img/fesaude.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
            Salvar_Dados();
        }catch (Exception ex){
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    private boolean validaCamposObrigatorios(){
       
        return (txtNome.getText().equals("")
        ||txtSexo.getText().equals("")
        ||txtNascimento.getText().equals("")
        ||txtIdade.getText().equals("")
        ||txtEstadoCivil.getText().equals("")
        ||txtNacionalidade.getText().equals("")
        ||txtCPF.getText().equals("")
        ||txtRG.getText().equals("")
        ||txtNaturalidade.getText().equals("")
        ||txtProfissão.getText().equals("")
        ||txtTipoSanguineo.getText().equals("")
        ||txtMãe.getText().equals("")
        ||(txtPai.getText().equals("")
        ||txtRaca.getText().equals("")
        ||txtEmail.getText().equals("")
        ||txtNumeroCNS.getText().equals("")
        ||txtUnidadedeReferencia.getText().equals("")
        ||txtMedicodeReferencia.getText().equals("")
        ||txtLogradouro.getText().equals("")
        ||txtNumero.getText().equals("")
        ||txtComplemento.getText().equals("")
        ||txtBairro.getText().equals("")
        ||txtCidade.getText().equals("")
        ||txtEstado.getText().equals("")
        ||txtCep.getText().equals(""))
        ||txtTelefone.getText().equals(""));
        
               
    }
    private void Salvar_Dados()throws Exception{
        if(validaCamposObrigatorios()){
            
          JOptionPane.showMessageDialog(null,"Preencha todos os campos antes de salvar!");
            
           }else{
            
            try{
                
                paciente.setNome(txtNome.getText());
                paciente.setSexo(txtSexo.getText());
                paciente.setNascimento(txtNascimento.getText());
                paciente.setIdade(txtIdade.getText());
                paciente.setEstadocivil(txtEstadoCivil.getText());
                paciente.setNacionalidade(txtNacionalidade.getText());
                paciente.setCpf(txtCPF.getText());
                paciente.setRg(txtRG.getText());
                paciente.setNaturalidade(txtNaturalidade.getText());
                paciente.setProfissao(txtProfissão.getText());
                paciente.setTiposanguineo(txtTipoSanguineo.getText());
                paciente.setMae(txtMãe.getText());
                paciente.setPai(txtPai.getText());
                paciente.setRaca(txtRaca.getText());
                paciente.setEmail(txtEmail.getText());
                paciente.setNumeroCNS(txtNumeroCNS.getText());
                paciente.setUnidadedereferencia(txtUnidadedeReferencia.getText());
                paciente.setMedicodereferencia(txtMedicodeReferencia.getText());
                paciente.setLogradouro(txtLogradouro.getText());
                paciente.setNumero(txtNumero.getText());
                paciente.setComplemento(txtComplemento.getText());
                paciente.setBairro(txtBairro.getText());
                paciente.setCidade(txtCidade.getText());
                paciente.setEstado(txtEstado.getText());
                paciente.setCep(txtCep.getText());
                paciente.setTelefone(txtTelefone.getText());
                pacientedao.adicionar(paciente);
             }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Erro ao salvar os dados" +e.toString());   
            }
        } 
    } 
    
                

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try{
            Consultar_Paciente();
        }catch (Exception ex){
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try{
            Atualizar_Paciente();
        }catch (Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro ao atualizar o paciente:" + ex.getMessage());
            
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
            //Obtém o cpf do paciente que deseja excluir
            String cpf = txtCPF.getText();
            
            //Verifica se o cpf não está vazio.
            if(cpf.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o cpf do paciente a ser excluído.");
                return;
                
            }
            //chama o método de exclusão do PACIENTEDAO
            boolean sucesso = pacientedao.excluir(cpf);
            if(sucesso) {
              JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso.");
                
            //Limpa os campos de texto após a exclusão.
            txtEstadoCivil.setText("");
            txtNacionalidade.setText("");
            txtProfissão.setText("");
            txtEmail.setText("");
            txtUnidadedeReferencia.setText("");
            txtMedicodeReferencia.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtComplemento.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            txtEstado.setText("");
            txtCep.setText("");
            txtTelefone.setText("");
            }else {
                JOptionPane.showMessageDialog(null, "Não foi possível excluir o paciente.");
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o paciente:" +e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
   
    public static void main(String args[]) {
        try{
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                 if ("Nimbus".equals(info.getName())){
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                 }
             }

        }catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Formulario().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnderecoResidencial;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblMae;
    private javax.swing.JLabel lblMedicodeReferencia;
    private javax.swing.JLabel lblNacionalidade;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNaturalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroCNS;
    private javax.swing.JLabel lblPai;
    private javax.swing.JLabel lblProfissao;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipoSanguineo;
    private javax.swing.JLabel lblUnidadedeReferencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtMedicodeReferencia;
    private javax.swing.JTextField txtMãe;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroCNS;
    private javax.swing.JTextField txtPai;
    private javax.swing.JTextField txtProfissão;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRaca;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTipoSanguineo;
    private javax.swing.JTextField txtUnidadedeReferencia;
    // End of variables declaration//GEN-END:variables

    private void Consultar_Paciente() throws Exception {
        try {
            //Obtém o CPF a ser consultado do campo de texto
            String cpf = txtCPF.getText();

            // Chama o método consultar da classe PacienteDAO para obter os dados do paciente
            Paciente pacienteConsultado = pacientedao.consultar(cpf);

            // Verifica se o paciente foi consultado
            if (pacienteConsultado != null) {
                //Preenche os campos do texto com os dados do paciente
                txtNome.setText(pacienteConsultado.getNome());
                txtSexo.setText(pacienteConsultado.getSexo());
                txtNascimento.setText(pacienteConsultado.getNascimento());
                txtIdade.setText(pacienteConsultado.getIdade());
                txtEstadoCivil.setText(pacienteConsultado.getEstadocivil());
                txtNacionalidade.setText(pacienteConsultado.getNacionalidade());
                txtCPF.setText(pacienteConsultado.getCpf());
                txtRG.setText(pacienteConsultado.getRg());
                txtNaturalidade.setText(pacienteConsultado.getNaturalidade());
                txtProfissão.setText(pacienteConsultado.getProfissao());
                txtTipoSanguineo.setText(pacienteConsultado.getTiposanguineo());
                txtMãe.setText(pacienteConsultado.getMae());
                txtPai.setText(pacienteConsultado.getPai());
                txtRaca.setText(pacienteConsultado.getRaca());
                txtEmail.setText(pacienteConsultado.getEmail());
                txtNumeroCNS.setText(pacienteConsultado.getNumeroCNS());
                txtUnidadedeReferencia.setText(pacienteConsultado.getUnidadedereferencia());
                txtMedicodeReferencia.setText(pacienteConsultado.getMedicodereferencia());
                txtLogradouro.setText(pacienteConsultado.getLogradouro());
                txtNumero.setText(pacienteConsultado.getNumero());
                txtComplemento.setText(pacienteConsultado.getComplemento());
                txtBairro.setText(pacienteConsultado.getBairro());
                txtCidade.setText(pacienteConsultado.getCidade());
                txtEstado.setText(pacienteConsultado.getEstado());
                txtCep.setText(pacienteConsultado.getCep());
                txtTelefone.setText(pacienteConsultado.getTelefone());
                JOptionPane.showMessageDialog(null, "Paciente encontrado!");

            } else {
                //caso o paciente não seja encontrado
                JOptionPane.showMessageDialog(null, "Paciente não encontrado!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            // trata o erro apropriadamente, exibi mensagem de erro se necessário
            JOptionPane.showMessageDialog(null, "Erro ao consultar paciente" + ex.getMessage());
        }
    }

    private void Atualizar_Paciente() throws Exception {
        // Obtenha o cpf do paciente que deseja atualizar
        String cpf = txtCPF.getText();

        //Verifica se o cpf não está vazio
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o cpf do paciente a ser atualizado.");
            return;
        }
        //Obtenha os novos valores para os atributos do paciente.

        String novoEstadoCivil = txtEstadoCivil.getText();
        String novoNacionalidade = txtNacionalidade.getText();
        String novoProfissão = txtProfissão.getText();
        String novoEmail = txtEmail.getText();
        String novoNumeroCNS = txtNumeroCNS.getText();
        String novoUnidadedeReferencia = txtUnidadedeReferencia.getText();
        String novoMedicodeReferencia = txtMedicodeReferencia.getText();
        String novoLogradouro = txtLogradouro.getText();
        String novoNumero = txtNumero.getText();
        String novoComplemento = txtComplemento.getText();
        String novoBairro = txtBairro.getText();
        String novoCidade = txtCidade.getText();
        String novoEstado = txtEstado.getText();
        String novoCEP = txtCep.getText();
        String novoTelefone = txtTelefone.getText();

        //Verifica se pelo menos um campo de atualização foi preenchido
        if (novoEstadoCivil.isEmpty() && novoNacionalidade.isEmpty() && novoProfissão.isEmpty() && novoEmail.isEmpty() && novoUnidadedeReferencia.isEmpty() && novoMedicodeReferencia.isEmpty() && novoLogradouro.isEmpty() && novoNumero.isEmpty() && novoComplemento.isEmpty() && novoBairro.isEmpty() && novoCidade.isEmpty() && novoEstado.isEmpty() && novoCEP.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha pelo menos um campo para atualização.");
            return;
        }
        //Cria um objeto Paciente com os novos valores
        Paciente pacienteAtualizado = new Paciente();
        pacienteAtualizado.setCpf(cpf);
        if (!novoEstadoCivil.isEmpty()) {
            pacienteAtualizado.setEstadocivil(novoEstadoCivil);
        }
        if (!novoNacionalidade.isEmpty()) {
            pacienteAtualizado.setNacionalidade(novoNacionalidade);
        }
        if (!novoProfissão.isEmpty()) {
            pacienteAtualizado.setProfissao(novoProfissão);
        }
        if (!novoEmail.isEmpty()) {
            pacienteAtualizado.setEmail(novoEmail);
        }
        if (!novoNumeroCNS.isEmpty()) {
            pacienteAtualizado.setNumeroCNS(novoNumeroCNS);
        }
        if (!novoUnidadedeReferencia.isEmpty()) {
            pacienteAtualizado.setUnidadedereferencia(novoUnidadedeReferencia);
        }
        if (!novoMedicodeReferencia.isEmpty()) {
            pacienteAtualizado.setMedicodereferencia(novoMedicodeReferencia);
        }
        if (!novoLogradouro.isEmpty()) {
            pacienteAtualizado.setLogradouro(novoLogradouro);
        }
        if (!novoNumero.isEmpty()) {
            pacienteAtualizado.setNumero(novoNumero);
        }
        if (!novoComplemento.isEmpty()) {
            pacienteAtualizado.setComplemento(novoComplemento);
        }
        if (!novoBairro.isEmpty()) {
            pacienteAtualizado.setBairro(novoBairro);
        }
        if (!novoCidade.isEmpty()) {
            pacienteAtualizado.setCidade(novoCidade);
        }
        if (!novoEstado.isEmpty()) {
            pacienteAtualizado.setEstado(novoEstado);
        }
        if (!novoCEP.isEmpty()) {
            pacienteAtualizado.setCep(novoCEP);
        }
        if (!novoTelefone.isEmpty()) {
            pacienteAtualizado.setTelefone(novoTelefone);
        }
        // Chamar o método do PacienteDAO para atualizaro paciente no BD
        boolean sucesso = pacientedao.atualizar(pacienteAtualizado);
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Paciente atualizado com sucesso!");
            
            //Limpa os campos de texto após a atualização
            txtEstadoCivil.setText("");
            txtNacionalidade.setText("");
            txtProfissão.setText("");
            txtEmail.setText("");
            txtUnidadedeReferencia.setText("");
            txtMedicodeReferencia.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtComplemento.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            txtEstado.setText("");
            txtCep.setText("");
            txtTelefone.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o paciente.");
        }
   } 
}
    

    

    
        
 
         
             
         
