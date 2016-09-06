package jz16.immutables;

import java.util.Optional;

import org.immutables.value.Value.Immutable;

class GradleEx {

	@Immutable
	interface TingDef {
		String id();
		Optional<String> desc();
	}

}