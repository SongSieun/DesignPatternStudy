package command

object TVOnCommand : Command {
    override fun execute() {
        turnOn()
    }

    private fun turnOn() {
        println("TV ON")
    }
}

object TVOffCommand : Command {
    override fun execute() {
        turnOff()
    }

    private fun turnOff() {
        println("TV OFF")
    }
}
