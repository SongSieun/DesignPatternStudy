package state

object PlayingState : State {
    private val musicPlayer = MusicPlayer

    override fun stop() {
        println("음악 정지됨.")
        musicPlayer.setState(StopState)
    }

    override fun pause() {
        println("음악 일시 정지됨.")
        musicPlayer.setState(PauseState)
    }

    override fun play() {
        println("이미 재생중.")
    }
}
