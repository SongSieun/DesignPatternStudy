import command.RemoteControl
import command.TVOnCommand

fun main(args: Array<String>) {
    val remote = RemoteControl()

    remote.setCommand(TVOnCommand)
    remote.buttonWasPressed()
}
