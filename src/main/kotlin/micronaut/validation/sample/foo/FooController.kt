package micronaut.validation.sample.foo

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller
class FooController(
    private val service: FooService
) {
    @Get("method/{bar}")
    fun method(@PathVariable bar: String) = service.methodValidation("")

    @Get("pojo")
    fun pojo() = service.dataValidation(Foo("1"))

    @Get("origin/{bar}")
    fun origin(@PathVariable bar: String) = service.originalValidator("")

}