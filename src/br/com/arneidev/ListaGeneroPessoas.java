package br.com.arneidev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaGeneroPessoas {
    public static void main(String[] args){
        imprimeNomesComGenero();
    }
    /*
    Metodo realiza input de lista de pessoas e referente genero e imprimi lista de nomes separando por genero
     */
    private static void imprimeNomesComGenero(){
        Map<String, Character> listaPessoaComGenero = new HashMap<>();
        Map<String, Character>listF = new HashMap<>();
        Map<String, Character>listM = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos nomes deseja incluir na lista?");
        int count = Integer.parseInt(scan.next());
        for (int i=0; i < count; i++){
            System.out.println("Digite o nome da "+ (i+1)+"° Pessoa");
            String nome = scan.next();
            System.out.println("Digite 'M' se masculino ou 'F' se femenino");
            Character sexo = scan.next().charAt(0);
            listaPessoaComGenero.put(nome, sexo);
        }
        for (Map.Entry<String, Character> nomes:listaPessoaComGenero.entrySet()) {
            if (nomes.getValue() == 'F'){
                listF.put(nomes.getKey(), nomes.getValue());
            }else{
                listM.put(nomes.getKey(), nomes.getValue());
            }
        }
        System.out.println("GRUPO FEMENINO: "+listF);
        System.out.println("GRUPO MASCULINO: "+listM);
    }
}
