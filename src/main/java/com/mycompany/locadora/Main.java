/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora;

import gui.UsuariosLogin;




/**
 *
 * @author amaury
 */
public class Main {
    public static void main(String[] args) {
        UsuariosLogin loginObj = new UsuariosLogin();
        loginObj.setVisible(true);
        loginObj.setLocationRelativeTo(null);
        loginObj.setTitle("Sistema Locadora de Veículos");
        
    }
}
