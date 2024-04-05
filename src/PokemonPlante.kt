class PokemonPlante: Pokemon {
    constructor(name: String, hp: Double, atk: Double) : super(name, hp, atk)

    override fun attaquer(p: Pokemon) {
        if (p.javaClass.name == "PokemonEau")
            p.hp -= this.atk * 2
        else if (p.javaClass.name == "PokemonPlante" || p.javaClass.name == "PokemonFeu")
            p.hp -= this.atk * 0.5
        else p.hp -= this.atk
    }
    override fun toString(): String {
        return this.javaClass.name
    }

}