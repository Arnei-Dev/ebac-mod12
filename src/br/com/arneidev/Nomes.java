package br.com.arneidev;

import java.util.*;

public class Nomes {
    public static void main(String[] args){
        nomesPessoas();
    }

    //Metodo imprimi lista de nome em ordem alfabetica
    private static void nomesPessoas(){
        Scanner scan = new Scanner(System.in);
        List<String>listaNomes = new ArrayList<>();
        System.out.println("Digite a quantidade de nome que vai incluir na lista");
        int count = Integer.parseInt(scan.next());
        for (int i =0; i < count; i++) {
            System.out.println("Digite o "+ (i+1)+"° nome");
            String nomeLista = scan.next();
            listaNomes.add(nomeLista);
        }
        Collections.sort(listaNomes);
        System.out.println(listaNomes);
    }
}
