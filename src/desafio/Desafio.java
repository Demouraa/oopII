package desafio;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] pedras = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("digite um numero");
            pedras[i] = sc.nextLine();
        }

        Set<Character> comuns = new HashSet<>();
        for(char c: pedras[0].toCharArray()){
            comuns.add(c);
        }

        for(int i=1;i<n;i++){
            Set<Character> atual = new HashSet<>();
            for(char c : pedras[i].toCharArray()) {
                atual.add(c);
            }
            comuns.retainAll(atual);
        }

        System.out.println(comuns.size());

    }
}
