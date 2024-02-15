class Pistola():ArmaDeFuego(daño = (1..5).random(),
                            //radio = (1.. 2).random()
                             RADIO.Corto,
                            "Pistola",
                            10,
                            1,
                            "9mm",){
    /*
    if (radio == 1){
        radio = RADIO.Reducido
    }else{
        radio = RADIO.Corto
    }

     */

    override fun dispara(): String {
        return super.dispara()
    }

    override fun recarga() {
        super.recarga()
    }
}