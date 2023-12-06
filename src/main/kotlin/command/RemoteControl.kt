package command

class RemoteControl {
    private lateinit var command: Command

    fun setCommand(command: Command) {
        this.command = command
    }

    fun buttonWasPressed() {
        command.execute()
    }
}
