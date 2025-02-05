package org.supan.webflux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    //@Test
    public void testMono() {
        Mono<?> monoString = Mono.just("Hello Bacchara, What's up?")
                .then(Mono.error(new RuntimeException("Error occurred")))
                .log();

        monoString.subscribe(System.out::println, (e) -> System.out.println(e.getMessage()));
    }

    //@Test
    public void testFlux() {
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Android", "Kotlin")
                .concatWithValues("AWS")
                .concatWith(Flux.error(new RuntimeException("Exception occurred in Flux")))
                .concatWithValues("Cloud")
                .log();
    }
}