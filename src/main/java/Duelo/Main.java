package Duelo;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random vida = new Random();

        Integer vidaNaruto =   vida.nextInt(201);
        Integer vidaSasuke = vida.nextInt(201);

        Personagem Naruto = new Personagem("Naruto", "Ninja",vidaNaruto);
        Personagem Sasuke = new Personagem("Sasuke", "Uchiha",vidaSasuke);

        Naruto.apresentar();
        Sasuke.apresentar();

        while(Naruto.getVida() > 0 && Sasuke.getVida() > 0){
            Sasuke.atualizaVida(Naruto.atacar(), Naruto.getNome());
            if(Sasuke.getVida() <= 0){
                continue;
            }
            Naruto.atualizaVida(Sasuke.atacar(), Sasuke.getNome());
        }



    }
}