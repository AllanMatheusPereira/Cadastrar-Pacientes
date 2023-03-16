/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.cadastrarpacientes;

/**
 *
 * @author allan
 */
public class CadastrarPacientes {

 public static void main(String[] args) {
     Paciente paciente1 = new Paciente("Antonio Soares",67,Boolean.TRUE ,76.7 ,'M');
     Paciente paciente2 = new Paciente("José Fagundes",53,Boolean.TRUE ,89.2 ,'M');
     Paciente paciente3 = new Paciente("Joaquina da Silva",77,Boolean.TRUE ,68.5 ,'F');
     Paciente paciente4 = new Paciente("Roberta dos Santos",42,Boolean.TRUE,56.4 ,'F');
     Paciente paciente5 = new Paciente("Enzo Batman",9,Boolean.FALSE ,18.5 ,'M');
     Paciente paciente6 = new Paciente("Richarlison Oliveira",27,Boolean.TRUE ,47.6 ,'T');

     System.out.println(paciente1.getDadosPacientes());
     System.out.println(paciente2.getDadosPacientes());
     System.out.println(paciente3.getDadosPacientes());
     System.out.println(paciente4.getDadosPacientes());
     System.out.println(paciente5.getDadosPacientes());
     System.out.println(paciente6.getDadosPacientes());
     
     Sintoma sintoma1 = new Sintoma('7',Boolean.TRUE,2 ,37.6 ,"Urgente");
     Sintoma sintoma2 = new Sintoma('1',Boolean.FALSE,0 ,36.3 ,"Pouco Urgente");
     Sintoma sintoma3 = new Sintoma('9',Boolean.TRUE,3 ,38.4 ,"Emergente");
     Sintoma sintoma4 = new Sintoma('0',Boolean.FALSE,0 ,36.6 ,"Não Urgente.");
     Sintoma sintoma5 = new Sintoma('9',Boolean.FALSE,0 ,39.0 ,"Emergente");
     Sintoma sintoma6 = new Sintoma('6',Boolean.TRUE,13 ,37.3 ,"Urgente");
        
     System.out.println(sintoma1.getFichaTriagem());
     System.out.println(sintoma2.getFichaTriagem());
     System.out.println(sintoma3.getFichaTriagem());
     System.out.println(sintoma4.getFichaTriagem());
     System.out.println(sintoma5.getFichaTriagem());
     System.out.println(sintoma6.getFichaTriagem());
     
     
           
    }
}
