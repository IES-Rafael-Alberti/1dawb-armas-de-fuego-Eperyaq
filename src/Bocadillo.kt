class Bocadillo(municion:Int,radio: RADIO, tipoDeMunicion:String ):ArmaDeFuego(daño = (200), radio, "Chalet", municion, 1, tipoDeMunicion) {

    override fun dispara(): String {
        return super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }
}