package rpg;

public class Arrow extends Warrior {

    int mp, hp, forca, agilidade, defesa, dano;
    String ataque;

    public Arrow(String nick, String ataque, String arma) {
        super(nick, arma);
        this.ataque = ataque;
        this.hp = 50;
        this.forca = 80;
        this.agilidade = 50;
        this.arma = arma;
        this.dano = (forca + agilidade / 2) - (hp/2);
        this.defesa = hp + forca + dano;
    }

    public String getAtaque() {
        return this.ataque;
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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Arrow{" + "mp=" + mp + ", hp=" + hp + ", forca=" + forca + ", agilidade=" + agilidade + ", defesa=" + defesa + ", dano=" + dano + ", ataque=" + ataque + '}';
    }

}


