package Duelo;
import java.util.Random;

public class Personagem implements Ataque {

    private String nome;
    private String classe;
    private Integer vida;
    private Random random = new Random();

    public Personagem(String nome, String classe, Integer vida){
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
    }

    public void apresentar(){
        System.out.println("Olá! Sou " + nome + " (" + classe + "), vida: " + vida + " HP!");
    }

    public Integer atacar(){
        return random.nextInt(101); // dano até 100
    }

    public String getNome(){ return nome; }
    public Integer getVida(){ return vida; }

    public void atualizaVida(Integer ataque, String adversario){
        System.out.println(adversario + " atacou com " + ataque + " de dano!");
        vida -= ataque;

        if(vida <= 0)
            System.out.println(nome + " morreu!");
        else
            System.out.println("Vida atual: " + vida);
    }
}
