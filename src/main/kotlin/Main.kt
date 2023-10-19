import factory.Filter
import factory.FilterChooser
import factory.FilterType
import factory.Instagram

fun main(args: Array<String>) {
    val chooser: FilterChooser = Instagram()
    val filter: Filter = chooser.createFilter(FilterType.OLD)

    println(filter.applyFilter())
}
