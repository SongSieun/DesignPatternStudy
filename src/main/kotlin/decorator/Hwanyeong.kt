package decorator

class Hwanyeong() : SkillDecorator() {
    constructor(man: Man) : this() {
        this.man = man
    }

    override fun getName(): String = man.getName() + ", 환영분신술"
    override fun power(): Int = man.power() + 50
}
