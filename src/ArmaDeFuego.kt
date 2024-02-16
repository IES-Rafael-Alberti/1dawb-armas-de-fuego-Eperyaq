import kotlin.random.Random
enum class RADIO{
    Reducido,
    Corto,
    Intermedio,
    Amplio,
    Enorme
}


open class ArmaDeFuego(
                   var daño:Int,
                   val radio:RADIO,
                  private val nombre:String ,
                  private var municion:Int ,
                  private val municionARestar:Int, //Si es una pistola que quite 1 si es otro arma que quite otro
                  private val tipoDeMunicion:String
                )
{

    companion object{
        var cantidadMunicionExtra:Int = (5..15).random()

    }


    open fun dispara(): String{
        if (municion > municionARestar) {
            municion -= municionARestar
            return "$nombre se ha disparado, y le quedan $municion balas"
        }else{
            recarga()
            municion -=municionARestar
            return "$nombre se ha disparado, y le quedan $municion balas"
        }
    }

    open fun recarga(){
        municion += cantidadMunicionExtra
        println("$nombre se ha recargado y tiene $municion balas ")
    }

    override fun toString(): String {
        return "Nombre: $nombre, Municion:$municion, Tipo de Municion: $tipoDeMunicion, Daño: $daño, Radio: $radio"
    }
}