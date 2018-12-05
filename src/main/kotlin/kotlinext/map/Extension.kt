package kotlinext.map

/**
 * Maps the map down to a list with key-value pairs with a specified separator.
 *
 * @param sep The separator to be used to separate key-value pair for each list item
 * @param trim Whether both key and value should be trimmed before written as [String]
 *
 * @return List of key-value pairs
 *
 */
fun Map<String, String>.asKeyValueList(sep: Char = '=', trim: Boolean = true): List<String> = map { (key, value) ->
    if (trim) "${key.trim()}$sep${value.trim()}"
    else "$key$sep$value"
}
