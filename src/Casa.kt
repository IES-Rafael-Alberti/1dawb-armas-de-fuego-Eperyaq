class Casa(municion:Int,radio: RADIO, tipoDeMunicion:String ):ArmaDeFuego(daño = (0), radio, "Chalet", municion, 1, tipoDeMunicion) {


    override fun dispara(): String {
        return super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }
}