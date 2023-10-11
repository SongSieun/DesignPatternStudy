package decorator

class Naseonhwan() : SkillDecorator() {
    constructor(man: Man) : this() {
        this.man = man
    }

    override fun getName(): String = man.getName() + ", 나선환"
    override fun power(): Int = man.power() + 30
}
