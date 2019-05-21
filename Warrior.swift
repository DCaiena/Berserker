class Warrior: Personagem {

    init() {
        self.agilidade
        self.nick
        self.hp
        self.force
        self.agility
    }

    override func takeDamage() {
        print("Seu turno, insira um dano:")
        let dano = readLine()
        self.hp -= dano
    }

    override func nick() {
        print("Digite o Nome do personagem:")
        self.nick = readLine()

    }

    override func hp() {
        print("Digite a sua vida")
        self.hp = readLine()
    }

    func agilidade() {
        print("Digite a agilidade")
        self.agility = readLine()
    }

    func getNick() -> Int {
        return self.nick
    }

    func getHP() -> Int {
        return self.hp
    }

    func getForce() -> Int {
        return self.force
    }

    func getAgility() -> Int {
        return self.agility
    }
}