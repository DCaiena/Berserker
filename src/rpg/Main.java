package rpg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        Personagem op1 = null, op2 = null;
        System.out.println("BEM VINDO A BERSERKER!!!");
        System.out.println("Berserker é um Rpg baseado em um sistema de batlha 1 vs 1 \n agr vamos a escolha dos personagens:");

        while (op1 == null || op2 == null) {
            op1 = Choice(opcao);
            op2 = Choice(opcao);
        }

        SBatalha(op1, op2);

    }

    public static void SBatalha(Personagem p1, Personagem p2) {
        while (p1.hp() > 0 && p2.hp() > 0) {
            p1.takeDamage(p2.forca());
            p2.takeDamage(p1.forca());

            System.out.println("P1 HP:" + p1.hp());
            System.out.println("P2 HP:" + p2.hp());
        }

        if (p1.hp() <= 0) {
            System.out.println(p1.getNick() + " Died!!!");
            System.out.println(p2.getNick() + "Venceu a partida");
        } else if (p2.hp() <= 0) {
            System.out.println(p2.getNick()+ "Died!!!");
            System.out.println(p1.getNick() + "Venceu a partida!!!");
        } else {
            System.out.println("Deu empate");
        }

    }

    public static Personagem Choice(Scanner opcao) {
        int op;
        System.out.println("Esolha o seu Personagem");
        System.out.println(" 1 - Arqueiro \n 2 - Soldado \n 3 - Feiticeiro \n 4 - Aprendiz");
        op = opcao.nextInt();
        Personagem novo;
        String nick, Arma;
        switch (op) {
            case 1:
                String Ataque;
                nick = name(opcao);
                System.out.println("Diga o nome do seu Ataque");
                Ataque = opcao.next();
                System.out.println("Diga o nome da sua Arma");
                Arma = opcao.next();
                novo = new Arrow(nick, Ataque, Arma);
                break;
            case 2:
                String Armadura;
                nick = name(opcao);
                System.out.println("Digite o nome da sua Armadura");
                Armadura = opcao.next();
                System.out.println("Digite o nome da sua Arma");
                Arma = opcao.next();
                novo = new Soldier(nick, Armadura, Arma);
                break;
            case 3:
                String pocao;
                nick = name(opcao);
                System.out.println("Digite o nome da sua porção");
                pocao = opcao.next();
                System.out.println("Digite o nome da sua Arma");
                Arma = opcao.next();
                novo = new Warlock(nick, Arma, pocao);
                break;
            case 4:
                String pet;
                nick = name(opcao);
                System.out.println("Diga o nome do seu pet");
                pet = opcao.next();
                System.out.println("Digite o nome da sua Arma");
                Arma = opcao.next();
                novo = new Novice(nick, Arma, pet);
                break;
            default:
                System.out.println("Escolha Uma das opões acima");
                return null;

        }
        
        return novo;
    }
    public static String name(Scanner opcao){
        String nick;
        System.out.println("Escolha o nome do personagem");
        nick = opcao.next();
        return nick;
    }
}
