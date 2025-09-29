
package views;

import controllers.ComboController;
import builder.ComboPersonalizado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ComboView extends JFrame {
    private final JComboBox<String> comboBoxTipo;
    private final JTextField txtBebida;
    private final JTextField txtAcompanamiento;
    private final JTextField txtExtra;
    private final JTextArea resultadoArea;
    private final ComboController controller;
    
    public ComboView() {
        controller =  new ComboController();
        
        setTitle ("Registro de Pedido Personalizado");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));
        
        add(new JLabel("Tipo de Combo:"));
        comboBoxTipo = new JComboBox<>(new String[]{"Hamburguesa", "Pollo", "Vegetariano"});
        add(comboBoxTipo);
        
        add(new JLabel("Bebida:"));
        txtBebida = new JTextField();
        add(txtBebida);
        
        add(new JLabel("Acompañamiento:"));
        txtAcompanamiento = new JTextField();
        add(txtAcompanamiento);
        
        add(new JLabel("Extra:"));
        txtExtra = new JTextField();
        add(txtExtra);
        
        JButton btnConfirmar = new JButton("Confirmar Pedido");
        btnConfirmar.addActionListener(this::confirmarPedido);
        add(btnConfirmar);
        
        resultadoArea = new JTextArea(5, 20);
        resultadoArea.setEditable(false);
        add(new JScrollPane(resultadoArea));
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
    private void confirmarPedido(ActionEvent e) {
        String tipo = (String) comboBoxTipo.getSelectedItem();
        String bebida = txtBebida.getText();
        String acompanamiento = txtAcompanamiento.getText();
        String extra = txtExtra.getText();
        
        controller.seleccionarBase(tipo);
        controller.personalizar(bebida, acompanamiento, extra);
        ComboPersonalizado combo = controller.obtenerComboFinal();
        
        resultadoArea.setText(combo.getDetalle());
        JOptionPane.showMessageDialog(this, "✅ ¡Tu pedido se está preparando!", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
    }
}
