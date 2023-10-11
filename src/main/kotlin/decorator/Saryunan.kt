package decorator

class Saryunan() : SkillDecorator() {
    constructor(man: Man) : this() {
        this.man = man
    }

    override fun getName(): String = man.getName() + ", 사륜안"
    override fun power(): Int = man.power() + 20
}
