package Duelo;
import java.util.Random;

public class Personagem implements  Ataque {

    private String Nome;
    private String Classe;
    private Integer Vida;

    public Personagem(String Nome, String Classe, Integer Vida){
            this.Nome = Nome;
            this.Classe = Classe;
            this.Vida = Vida;
    }

    public void apresentar(){
        System.out.println("Ola, sou o " + this.Nome + ", minha classe é " + this.Classe + ", minha vida é de " + this.Vida + " hp!");
    }

    public Integer atacar(){
        Random random = new Random();
        Integer dano = random.nextInt(101);
        return dano;
    }

    public String getNome(){
        return this.Nome;
    }

    public Integer getVida() {
        return this.Vida;
    }

    public void setVida(Integer vida){
        this.Vida = vida;
    }

    public void atualizaVida (Integer ataque, String Adversario){
        System.out.println("O ataque de " + Adversario + " foi de " + ataque);

        this.Vida -= ataque;
        if(this.Vida <= 0) {
            System.out.println("O personagem " + this.Nome + " morreu!");
        } else {
            System.out.println("A vida de " + this.Nome + " é " + this.Vida);
        }
    }

}
