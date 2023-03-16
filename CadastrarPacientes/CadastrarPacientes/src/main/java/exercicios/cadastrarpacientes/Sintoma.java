/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.cadastrarpacientes;

/**
 *
 * @author allan
 */
public class Sintoma {
    char dor;
    boolean pressaoAlta;
    int inicioSintomas;
    double grausFebre;
    String grupo;
    
    public Sintoma(char odor , boolean opressaoAlta, int oinicioSintomas , double ograusFebre , String ogrupo ){
    dor=odor;
    pressaoAlta=opressaoAlta;
    inicioSintomas=oinicioSintomas;
    grausFebre=ograusFebre;
    grupo=ogrupo;
    }
    public String getFichaTriagem(){
        return " Nivel de dor: " + dor + " Pressão alta : " + pressaoAlta+ " Quando começou: " + inicioSintomas + " Dias " + " Temperatura corporal: " + grausFebre + " Faixa de idade: " + grupo;
    }
}

