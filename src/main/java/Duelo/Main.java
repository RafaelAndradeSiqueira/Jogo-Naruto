package Duelo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==== CRIAÇÃO DE PERSONAGENS ====");

        System.out.print("Digite o nome do personagem 1: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite a classe do personagem 1: ");
        String classe1 = sc.nextLine();

        Integer vida1 = random.nextInt(201); // vida aleatória
        Personagem p1 = new Personagem(nome1, classe1, vida1);


        System.out.println("\nAgora o personagem 2:");

        sc.nextLine();

        System.out.print("Digite o nome do personagem 2: ");
        String nome2 = sc.nextLine();

        System.out.print("Digite a classe do personagem 2: ");
        String classe2 = sc.nextLine();

        Integer vida2 = random.nextInt(201); // vida aleatória
        Personagem p2 = new Personagem(nome2, classe2, vida2);

        // Mostra apresentação
        System.out.println("\n==== PERSONAGENS CRIADOS ====");
        p1.apresentar();
        p2.apresentar();

        // Batalha
        Batalha batalha = new Batalha();
        batalha.duelar(p1, p2);
    }
}
