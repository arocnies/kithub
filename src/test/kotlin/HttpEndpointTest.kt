import com.anies.kithub.http.HttpEndpoint
import com.anies.kithub.http.launch
import kotlin.test.Test

class HttpEndpointTest {
    val pokeApi = HttpEndpoint("http://pokeapi.co/api/v2/")

    @Test
    fun testSimpleGetRequest() = testSuspend("Simple GET request") {
        val result = pokeApi.request("GET", "pokemon/1")
        println(result)
    }
}

var testCounter: Int = 0

private fun testSuspend(funcName: String, block: suspend () -> Unit) {
    launch {
        println("Test $testCounter --- $funcName")
        block()
        println("End ${testCounter++} --- $funcName")
    }
}
