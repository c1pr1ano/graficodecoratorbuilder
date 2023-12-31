package com.attextra.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;


public final class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2.8);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        this.setTitle("Gráfico");
        this.pack();
    }

    private void initComponents() {

        decoratorsPanel = new javax.swing.JPanel();
        Titulo = new javax.swing.JCheckBox();
        legenda = new javax.swing.JCheckBox();
        eixos = new javax.swing.JCheckBox();
        rotulosProporcional = new javax.swing.JCheckBox();
        rotulosTotal = new javax.swing.JCheckBox();
        corBarrasGrupo = new javax.swing.JCheckBox();
        grade = new javax.swing.JCheckBox();
        comboBoxTipoBarra = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnRestaurarPadrao = new javax.swing.JButton();
        btnDesfazer = new javax.swing.JButton();
        rotulosTotalPercentual = new javax.swing.JCheckBox();
        chkOrientacaoVertical = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        chkOrientacaoHorizontal = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        decoratorsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elementos Gráficos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        decoratorsPanel.setPreferredSize(new java.awt.Dimension(250, 450));

        Titulo.setText("Título");

        legenda.setText("Legenda");

        eixos.setText("Título dos eixos");

        rotulosProporcional.setText("Rótulo de Dados (%)");

        rotulosTotal.setText("Rótulo de Dados - Valor");
        rotulosTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotulosTotalActionPerformed(evt);
            }
        });

        corBarrasGrupo.setText("Cor das Barras - Por grupo");

        grade.setText("Adicionar grade");

        comboBoxTipoBarra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barras Verticais", "Barras Horizontais" }));

        jLabel1.setText("Gráficos Padrão:");

        btnRestaurarPadrao.setText("Restaurar Padrão");

        btnDesfazer.setText("Desfazer");

        rotulosTotalPercentual.setText("Rótulo de Dados - Valor (%)");

        chkOrientacaoVertical.setText("Vertical");

        jLabel2.setText("Orientação das barras:");

        chkOrientacaoHorizontal.setText("Horizontal");

        javax.swing.GroupLayout decoratorsPanelLayout = new javax.swing.GroupLayout(decoratorsPanel);
        decoratorsPanel.setLayout(decoratorsPanelLayout);
        decoratorsPanelLayout.setHorizontalGroup(
            decoratorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decoratorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(decoratorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(decoratorsPanelLayout.createSequentialGroup()
                        .addGroup(decoratorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(decoratorsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxTipoBarra, 0, 135, Short.MAX_VALUE))
                            .addComponent(rotulosTotalPercentual)
                            .addGroup(decoratorsPanelLayout.createSequentialGroup()
                                .addComponent(btnRestaurarPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(decoratorsPanelLayout.createSequentialGroup()
                        .addGroup(decoratorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo)
                            .addComponent(legenda)
                            .addComponent(eixos)
                            .addComponent(rotulosProporcional)
                            .addComponent(rotulosTotal)
                            .addComponent(corBarrasGrupo)
                            .addComponent(grade)
                            .addGroup(decoratorsPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(decoratorsPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(decoratorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOrientacaoHorizontal)
                    .addComponent(chkOrientacaoVertical))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        decoratorsPanelLayout.setVerticalGroup(
            decoratorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decoratorsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(legenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eixos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotulosProporcional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotulosTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotulosTotalPercentual)
                .addGap(3, 3, 3)
                .addComponent(corBarrasGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkOrientacaoVertical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkOrientacaoHorizontal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(decoratorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTipoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(51, 51, 51)
                .addGroup(decoratorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestaurarPadrao)
                    .addComponent(btnDesfazer))
                .addContainerGap())
        );

        getContentPane().add(decoratorsPanel);

        pack();
    }

    private void rotulosTotalActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JCheckBox Titulo;
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JButton btnRestaurarPadrao;
    private javax.swing.JCheckBox chkOrientacaoHorizontal;
    private javax.swing.JCheckBox chkOrientacaoVertical;
    private javax.swing.JComboBox<String> comboBoxTipoBarra;
    private javax.swing.JCheckBox corBarrasGrupo;
    private javax.swing.JPanel decoratorsPanel;
    private javax.swing.JCheckBox eixos;
    private javax.swing.JCheckBox grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox legenda;
    private javax.swing.JCheckBox rotulosProporcional;
    private javax.swing.JCheckBox rotulosTotal;
    private javax.swing.JCheckBox rotulosTotalPercentual;

    public JCheckBox getTitulo() {
        return Titulo;
    }

    public JCheckBox getCorBarrasGrupo() {
        return corBarrasGrupo;
    }

    public JPanel getDecoratorsPanel() {
        return decoratorsPanel;
    }

    public JCheckBox getEixos() {
        return eixos;
    }

    public JCheckBox getGrade() {
        return grade;
    }

    public JCheckBox getLegenda() {
        return legenda;
    }

    public JCheckBox getRotulosPercentual() {
        return rotulosProporcional;
    }

    public JCheckBox getRotulosTotal() {
        return rotulosTotal;
    }

    public JComboBox<String> getComboBoxTipoBarra() {
        return comboBoxTipoBarra;
    }

    public JButton getBtnDesfazer() {
        return btnDesfazer;
    }

    public JButton getBtnRestaurarPadrao() {
        return btnRestaurarPadrao;
    }

    public JCheckBox getRotulosTotalPercentual() {
        return rotulosTotalPercentual;
    }

    public void setTitulo(JCheckBox Titulo) {
        this.Titulo = Titulo;
    }

    public JCheckBox getChkOrientacaoVertical() {
        return chkOrientacaoVertical;
    }

    public JCheckBox getChkOrientacaoHorizontal() {
        return chkOrientacaoHorizontal;
    }

}
