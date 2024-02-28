package state

object PauseState : State {
    private val musicPlayer = MusicPlayer

    override fun stop() {
        println("이미 정지됨.")
        musicPlayer.setState(StopState)
    }

    override fun pause() {
        println("이미 정지됨.")
    }

    override fun play() {
        println("~음악 재생중~")
        musicPlayer.setState(PlayingState)
    }
}
