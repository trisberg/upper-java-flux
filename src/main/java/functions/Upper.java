package functions;

import java.util.function.Function;

import reactor.core.publisher.Flux;

public class Upper implements Function<Flux<String>, Flux<String>> {

	public Flux<String> apply(Flux<String> name) {
		return name.map(s->s.toUpperCase()+"!");
	}
}
