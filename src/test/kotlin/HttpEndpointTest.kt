import com.anies.kithub.http.HttpEndpoint
import com.anies.kithub.http.async
import com.anies.kithub.http.launch
import kotlin.js.Promise
import kotlin.test.Test

class HttpEndpointTest {
    val pokeApi = HttpEndpoint("http://pokeapi.co/api/v2/")

    @Test
    fun testSimpleGetRequest() = testSuspend("Simple GET request") {
        val result = pokeApi.request("GET", "pokemon/1")
        println(result)
    }

    @Test fun bar() = "SomeTestFoo"

    @Test fun timing() {
        (0..10).forEach {
            println(it)
        }
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
