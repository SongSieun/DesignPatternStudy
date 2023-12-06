package command

object AirConditionerOnCommand : Command {
    override fun execute() {
        turnOn()
    }

    private fun turnOn() {
        println("Air Conditioner ON")
    }
}

object AirConditionerOffCommand : Command {
    override fun execute() {
        turnOff()
    }

    private fun turnOff() {
        println("Air Conditioner OFF")
    }
}
