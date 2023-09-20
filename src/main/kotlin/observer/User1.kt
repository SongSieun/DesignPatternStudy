package observer

class User1(
    community: Community
) : Observer {

    init {
        community.registerObserver(this)
    }

    override fun update(title: String) {
        println("$title: 새로운 게시글이 업데이트 되었습니다!")
    }
}
