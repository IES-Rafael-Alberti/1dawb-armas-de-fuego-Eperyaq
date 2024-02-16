class Bazooka(municion:Int,radio: RADIO, tipoDeMunicion:String ):ArmaDeFuego(daño = (10..30).random(), radio, "Bazooka", municion, 3, tipoDeMunicion) {

    init {
        //require(RADIO = RADIO.Corto)
    }
    override fun dispara(): String {
        return super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }
}