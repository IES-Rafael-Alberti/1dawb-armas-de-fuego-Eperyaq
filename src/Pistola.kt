class Pistola(municion:Int,radio: RADIO, tipoDeMunicion:String ):ArmaDeFuego(daño = (1..5).random(), radio, "Pistola", municion, 1, tipoDeMunicion){

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