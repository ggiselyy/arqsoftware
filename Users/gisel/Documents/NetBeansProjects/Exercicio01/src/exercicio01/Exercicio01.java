package exercicio01;

import java.util.Scanner;
import java.lang.*;
import java.io.*;
/**
 *
 * @author gisely
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] nomes =new String[100];
        int opt = 0, n=0;
        Scanner scanner = new Scanner(System.in);
        
    while(true){    
        System.out.println("Digite uma opção");
        System.out.println("[1] - Adicionar Nome");
        System.out.println("[2] - Lista Pessoas");
        System.out.println("[3] - Sair");
        opt = scanner.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        switch (opt){
        
            case 1:
                    try{
                    System.out.println("Digite o nome:\n");
                    nomes[n]=br.readLine().trim();
                    n++;
                    System.out.println("Nome gravado\n");
                    }catch(Exception ex){
                    }
                    
                break;
            case 2:
                System.out.println("Lista de nomes:\n");
                for (int c=0;c<n;c++){
                    System.out.println(nomes[c]);
                }
                break;
            default:
                System.exit(0);
            
        }
        
    }
}
}