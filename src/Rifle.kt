class Rifle(municion:Int,radio: RADIO, tipoDeMunicion:String ):ArmaDeFuego(daño = (5..10).random(), radio, "Rifle", municion, 2, tipoDeMunicion) {

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
