class Coche(municion:Int,radio: RADIO, tipoDeMunicion:String ):ArmaDeFuego(daño = (1000000), radio, "toyota corolla", municion, 1, tipoDeMunicion) {

    override fun dispara(): String {
        return super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }
}