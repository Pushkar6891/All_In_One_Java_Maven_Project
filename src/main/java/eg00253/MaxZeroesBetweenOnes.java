package eg00253;

public class MaxZeroesBetweenOnes {

	MaxZeroesBetweenOnesService service;

	public MaxZeroesBetweenOnes() {

	}

	public MaxZeroesBetweenOnes(MaxZeroesBetweenOnesService service) {

		this.service = service;

	}

	public int perform(String str) {

		return service.maxConsecutiveZeroes(str);

	}

}