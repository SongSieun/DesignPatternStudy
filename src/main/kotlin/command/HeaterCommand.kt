package command

object HeaterOnCommand : Command {
    override fun execute() {
        turnOn()
    }

    private fun turnOn() {
        println("Heater ON")
    }
}

object HeaterOffCommand : Command {
    override fun execute() {
        turnOff()
    }

    private fun turnOff() {
        println("Heater OFF")
    }
}
