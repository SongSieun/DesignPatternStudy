package decorator

abstract class SkillDecorator : Man {
    lateinit var man: Man
    abstract override fun getName(): String
}
