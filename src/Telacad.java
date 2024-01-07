import Dao.Usuario;
import Model.UserModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Telacad extends JFrame {
    private JTextField txtnome;
    private JTextField txtcod;
    private JTextField txtsexo;
    private JTextField txtidade;
    private JButton btnCadastrar;
    private JTextField txttipo_exame;

    public Telacad() {
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btnCadastrar = new JButton("Cadastrar");
                btnCadastrar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // instanciando a classe Usuario do pacote modelo e criando seu objeto usuarios
                        UserModel usuarios = new UserModel();
                        usuarios.setNome(txtnome.getText());
                        usuarios.setId(Integer.parseInt(txtcod.getText()));
                        usuarios.setSexo(txtsexo.getText());
                        usuarios.setIdade(txtidade.getText());
                        usuarios.setTipo_exame(txttipo_exame.getText());

                        // fazendo a validação dos dados
                        if ((txtnome.getText().isEmpty()) || (txtcod.getText().isEmpty()) || (txtsexo.getText().isEmpty())
                                || (txtidade.getText().isEmpty()) || (txttipo_exame.getText().isEmpty())) {
                            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
                        }

                        else {
                            // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
                            Usuario Dao;
                            try {
                                Dao = new Usuario();
                                Dao.adiciona(usuarios);
                                JOptionPane.showMessageDialog(null, "Usuário " + txtnome.getText() + " inserido com sucesso! ");
                                // apaga os dados preenchidos nos campos de texto
                                txtnome.setText("");
                                txtcod.setText("");
                                txtsexo.setText("");
                                txtidade.setText("");
                                txttipo_exame.setText("");
                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                });
            }
        });
    }
}
