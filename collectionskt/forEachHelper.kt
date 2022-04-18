inline fun <T> Iterable<T>.customForEach(action : (T) -> Unit){
    for(element in this )
        action(element)
}

inline fun <T> Iterable<T>.customForEachIndexed(action: (index:Int,T) -> Unit){
    var index = 0
    for (element in this) action(index++ , element)
}
