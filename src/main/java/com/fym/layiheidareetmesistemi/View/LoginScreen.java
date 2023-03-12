package com.fym.layiheidareetmesistemi.View;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee.EmployeeRegistrationRequset;
import com.fym.layiheidareetmesistemi.Core.Enums.Role;
import com.fym.layiheidareetmesistemi.Core.Exceptions.Employee.EmployeeException;
import com.fym.layiheidareetmesistemi.Services.Concretes.Employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


@Component
public class LoginScreen extends JFrame {
    private JPanel panel1;
    private JTextField username;
    private JPasswordField password;
    private JLabel girisLabel;
    private JLabel errorMsg;
    private JButton button;

    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public LoginScreen() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        errorMsg.setVisible(false);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (((username.getText() == null) || username.getText().isBlank()) || ((String.valueOf(password.getPassword()) == null) || String.valueOf(password.getPassword()).isBlank())) {
                    errorMsg.setText("Məlumatlar yalnışdır!");
                    errorMsg.setVisible(true);
                    errorMsg.setBackground(Color.RED);//
                    errorMsg.setForeground(Color.red);
                } else {
                    errorMsg.setText("");
                    EmployeeRegistrationRequset requset=
                            new EmployeeRegistrationRequset("Maqsud","Safin","Shovket", "mcss","HR", "123qwe123", Role.ADMIN);
                    try{
                        employeeService.addEmployee(requset);
                    }catch (EmployeeException error){
                        System.out.println(error.getMessage()); // Burda open dialog chixacaq. Heleki sout ile ishledek
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        password.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (((username.getText() == null) || username.getText().isBlank()) || ((String.valueOf(password.getPassword()) == null) || String.valueOf(password.getPassword()).isBlank())) {
                        errorMsg.setText("Məlumatlar yalnışdır!");
                        errorMsg.setForeground(Color.red);
                        errorMsg.setVisible(true);
                        errorMsg.setBackground(Color.RED);
                    } else {
                        errorMsg.setText("");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setTitle("Layihə İdarəetmə Sistemi - Giriş");
        setContentPane(panel1);
        getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }


}
