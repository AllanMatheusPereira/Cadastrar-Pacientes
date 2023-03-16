/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.cadastrarpacientes;

/**
 *
 * @author allan
 */
public class Paciente {
    String nome;
    double peso;
    int idade;
    boolean adulto;
    char sexo;
    
    public Paciente(String onome, int oidade, boolean oadulto, double opeso, char osexo){
    nome=onome;
    peso=opeso;
    idade=oidade;
    adulto=oadulto;
    sexo=osexo; 
  }
   public String getDadosPacientes(){
        return " Nome do paciente: " + nome + " Idade do paciente: " + idade +  " Faixa etária: " + adulto + " Peso: " + peso + " Sexo: " + sexo;
    }
    
}
