package com.adp.test;

import com.adp.test.lift.Lift;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class LiftTestApplicationTests {

	private Lift lift;
	private static int MIN_FLOOR = 0;
	private static int MAX_FLOOR = 10;
	private int STARTING_STAIR = 0;
	private int EXISTING_STAIR = 9;
	private int NON_EXISTING_STAIR = 99;

	@BeforeEach
	public void setup(){
		this.lift = new Lift();
	}

	@Test
	void contextLoads() {
	}

	@DisplayName("goes to floor - existing")
	@Test
	public void goesToFloor_Success() {
		// given a lift

		// when asked to go to an existing floor
		int result = this.lift.goToFloor(STARTING_STAIR, EXISTING_STAIR);

		// then the lift should be put in motion
		assertEquals(EXISTING_STAIR, result);
	}

	@DisplayName("goes to floor - edge 1 : same floor")
	@Test
	public void goesToFloor_SameFloor_Success() {
		// given a lift

		// when asked to go to the same floor
		int result = this.lift.goToFloor(STARTING_STAIR, STARTING_STAIR);

		// TODO assert no call to move
		// then the lift should stay at the same floor
		assertEquals(STARTING_STAIR, result);
	}

	@DisplayName("goes to floor - error 1 : unexisting floor")
	@Test
	public void goesToFloor_NonExisting_Error() {
		// given a lift

		// when asked to go to the same floor
		assertThrows(IllegalArgumentException.class,
				() -> this.lift.goToFloor(STARTING_STAIR, NON_EXISTING_STAIR));

		// then a meaningful exception should be thrown
		// TODO check message
		// TODO check that the lift should remain at same floor
	}


}
