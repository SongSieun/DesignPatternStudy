package observer

class Community : Subject {
    private val observers = mutableListOf<Observer>()
    private var title: String = ""

    // 커뮤니티 가입
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    // 커뮤니티 탈퇴
    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach { it.update(title) }
    }

    fun registerArticle(title: String) {
        this.title = title
        notifyObservers()
    }
}
