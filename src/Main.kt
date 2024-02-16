fun main() {

    var pistola = Pistola(8,RADIO.Corto, "9mm")
    var rifle = Rifle(20,RADIO.Intermedio, "7.62x54")
    var bazooka = Bazooka(9, RADIO.Enorme, "Pepo")
    var choso = Casa(3,RADIO.Amplio,"Confeti")
    var coche = Coche(4,RADIO.Enorme,"Luz Larga")
    var bocata = Bocadillo(2,RADIO.Corto,"Lonchas de chope")
    mutableListOf(pistola, rifle, bazooka, choso, coche, bocata)

    println("\n Municion extra = ${ArmaDeFuego.cantidadMunicionExtra} balas para todas las armas de fuego")

    println("********Primer disparo")
    println(pistola.dispara())
    println(pistola)

    println("********Segundo disparo")
    println(rifle.dispara())
    println(rifle)


    println("********Tercer disparo")
    println(bazooka.dispara())
    println(bazooka)

    println("********Cuarto disparo")
    println(rifle.dispara())
    println(rifle)

    println("********Quinto disparo")
    println(rifle.dispara())
    println(rifle)

    println("********Sexto disparo")
    println(pistola.dispara())
    println(pistola)

    println("********Septimo disparo")
    println(coche.dispara())
    println(coche)

    println("********Octavo disparo")
    println(bocata.dispara())
    println(bocata)

    println("********Noveno disparo")
    println(choso.dispara())
    println(choso)

}