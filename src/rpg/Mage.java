package rpg;

public class Mage extends Personagem {

    int mp, hp, dano, defesa;
    String nick, arma;

    public Mage(String nick, String arma) {
        this.mp = 100;
        this.hp = 80;
        this.nick = nick;
        this.arma = arma;
        this.dano = mp * 2;
        this.defesa = (mp / 2) + hp;
    }

    @Override
    public void takeDamage(int dano) {
        this.hp -= dano;
    }

    @Override
    public String getNick() {
        return this.nick;
    }

    @Override
    public int hp() {
        return this.hp;
    }

    public int getMana() {
        return this.mp;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void getTipoArma(String arma) {
        this.arma = arma;
    }

    @Override
    public int forca() {
        return dano;
    }

    @Override
    public String toString() {
        return "Mage{" + "mp=" + mp + ", hp=" + hp + ", nick=" + nick + ", arma=" + arma + '}';
    }

}
