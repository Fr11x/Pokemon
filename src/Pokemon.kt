open class Pokemon {
    var name = ""
    var hp = 0.0
    var atk = 0.0
    constructor()
    constructor(name: String, hp: Double, atk: Double) {
        this.name = name
        this.hp = hp
        this.atk = atk
    }


    open fun isDead(): Boolean = if (this.hp == 0.0) true else false
    open fun attaquer(p: Pokemon){
        p.hp -= this.atk
    }

    override fun toString(): String {
        return "Pokemon(name='$name', hp=$hp, atk=$atk)"
    }

}