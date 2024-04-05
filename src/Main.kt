fun main() {
    var p1 = PokemonPlante("test",150.0,15.0)
    var p2 = PokemonEau("test1",120.0,20.0)
    var p3 = PokemonFeu("test2",150.0,25.0)

    p3.attaquer(p1)
    println(p1.hp)
}