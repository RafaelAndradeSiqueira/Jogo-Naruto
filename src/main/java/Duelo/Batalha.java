package Duelo;

public class Batalha {

    public void duelar(Personagem p1, Personagem p2){

        System.out.println("\n=== INÍCIO DO DUELO ===");

        while (p1.getVida() > 0 && p2.getVida() > 0){

            p2.atualizaVida(p1.atacar(), p1.getNome());
            if(p2.getVida() <= 0) break;

            p1.atualizaVida(p2.atacar(), p2.getNome());
        }

        System.out.println("\n=== FIM DO DUELO ===");
    }
}
