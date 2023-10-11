import decorator.*
import observer.Community
import observer.User1
import observer.User2

fun main(args: Array<String>) {
    var naruto: Man = Naruto()

    println(naruto.getName() + ", power: ${naruto.power()}")

    naruto = Naseonhwan(naruto)
    naruto = Saryunan(naruto)
    naruto = Hwanyeong(naruto)

    println(naruto.getName() + ", power: ${naruto.power()}")

}
