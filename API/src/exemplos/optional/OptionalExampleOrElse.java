package exemplos.optional;

import java.util.Optional;

public class OptionalExampleOrElse {

	public static void main(String[] args) {

		Optional<String> optionalValue = Optional.ofNullable(null);
		String result = optionalValue.orElse("Result: Default");
		System.out.println(result);

	}

}
