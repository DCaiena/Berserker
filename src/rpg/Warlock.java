package rpg;

public class Warlock extends Mage {

    int mp, hp, dano, defesa;
    String pocoes;

    public Warlock(String nick, String arma, String pocoes) {
        super(nick, arma);
        this.pocoes = pocoes;
        this.mp = 100;
        this.hp = 80;
        this.nick = nick;
        this.arma = arma;
        this.dano = mp * 2;
        this.defesa = (mp / 2) + hp;

    }

    public String getPocoes() {
        return this.pocoes;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "Warlock{" + "mp=" + mp + ", hp=" + hp + ", dano=" + dano + ", defesa=" + defesa + ", pocoes=" + pocoes + '}';
    }

}
