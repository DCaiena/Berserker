package rpg;

public class Warrior extends Personagem {

    int hp, forca, agilidade, defesa, dano;
    String nick, arma;

    public Warrior(String nick, String arma) {
        this.nick = nick;
        this.hp = 70;
        this.forca = 100;
        this.agilidade = 40;
        this.arma = arma;
        this.dano = (forca + agilidade) - hp;
        this.defesa = hp + forca + dano;
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

    public void getForca(int forca) {
        this.forca = forca;
    }

    public void getAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getDefesa() {
        return this.defesa;
    }

    @Override
    public int forca() {
        return dano;
    }

    public void getTipoArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Warrior{" + ", hp=" + hp + ", forca=" + forca + ", agilidade=" + agilidade + ", nick=" + nick + ", arma=" + arma + '}';
    }

}
