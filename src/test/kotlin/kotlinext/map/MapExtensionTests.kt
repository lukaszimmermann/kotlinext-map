package kotlinext.map

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MapExtensionTests {

    @Test
    fun to_key_value_list() {
        assertEquals(listOf("foo=bar"), mapOf("foo" to "bar").asKeyValueList())
        assertEquals(listOf("foo?bar"), mapOf("foo" to "bar").asKeyValueList('?'))
        assertEquals(listOf("foo=bar "), mapOf("foo" to "bar ").asKeyValueList(trim = false))
        assertEquals(listOf("foo ?bar"), mapOf("foo " to "bar").asKeyValueList('?', trim = false))
        assertEquals(emptyList<String>(), emptyMap<String, String>().asKeyValueList())
        assertEquals(emptyList<String>(), emptyMap<String, String>().asKeyValueList(trim = false))
    }
}
