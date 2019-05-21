class Warlock: Mage {
    init() {
        self.nick
        self.hp
        self.mp
        self.potions
    }

    func getPotions() -> String {
        let nPotions = readline()
        return self.potions = nPotions
    }
}