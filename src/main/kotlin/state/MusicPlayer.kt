package state

object MusicPlayer {

    private val pauseState: State = PauseState
    private val playingState: State = PlayingState
    private val stopState: State = StopState

    private var state: State = StopState

    fun pressedPlayButton() {
        state.play()
    }

    fun pressedStopButton() {
        state.stop()
    }

    fun pressedPauseButton() {
        state.pause()
    }

    fun setState(state: State) {
        this.state = state
    }
}
