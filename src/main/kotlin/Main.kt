import command.RemoteControl
import command.TVOnCommand
import state.MusicPlayer
import state.PlayingState
import state.StopState

fun main(args: Array<String>) {
    val musicPlayer = MusicPlayer

    musicPlayer.pressedPauseButton()
    musicPlayer.pressedPlayButton()
    musicPlayer.pressedPlayButton()
    musicPlayer.pressedStopButton()
    musicPlayer.pressedPauseButton()
}
