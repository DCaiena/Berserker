class Mage: Personagem {

    init() {
        self.nick
        self.hp
        self.mp
    }

    override func takeDamage() {
        print("Seu turno, insira um dano:")
        let dano = readLine()
        self.hp -= dano
    }

    override func nick() {
        int("Digite o Nome do personagem:")
        self.nick = readLine()
    }

    override func hp() {
        self.hp
    }

    func getNick() -> String {
        return self.nick
    }

    func getHP() -> Int {
        return self.hp
    }

    func getMP() -> Int {
        return self.mp
    }
}