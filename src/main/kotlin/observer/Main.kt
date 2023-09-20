package observer

fun main(args: Array<String>) {
    val reviewCommunity = Community()

    val user1 = User1(reviewCommunity)
    val user2 = User2(reviewCommunity)

    reviewCommunity.registerArticle("제목")
}
