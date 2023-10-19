package factory

class Instagram(override var name: String = "instagram") : FilterChooser() {
    override fun createFilter(type: FilterType): Filter {
        return when (type) {
            FilterType.OLD -> InstagramOldFilter()
            FilterType.FANCY -> InstagramFancyFilter()
            FilterType.GRAY_SCALE -> InstagramGrayFilter()
        }
    }

    override var filterName: String
        get() = name
        set(value) {
            name = value
        }

}

class InstagramOldFilter(override var filterName: String = "InstagramOldFilter") : Filter
class InstagramFancyFilter(override var filterName: String = "InstagramFancyFilter") : Filter
class InstagramGrayFilter(override var filterName: String = "InstagramGrayFilter") : Filter

interface Filter {
    var filterName: String

    fun applyFilter(): String {
        return "$filterName 필터가 적용되었습니다."
    }
}

enum class FilterType {
    OLD,
    FANCY,
    GRAY_SCALE;
}

abstract class FilterChooser : Filter {

    abstract var name: String

    fun apply(type: FilterType): Filter {
        val filter = createFilter(type)
        filter.applyFilter()

        return filter
    }

    abstract fun createFilter(type: FilterType): Filter
}
