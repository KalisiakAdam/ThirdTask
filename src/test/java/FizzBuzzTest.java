import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void shouldReturnFizzInstead3FactorBuzzInsted5FactorFizzbuzzin3and5commonFactor() {
        Object[] result = {1, 2, "fizz", 4, "buzz", "fizz", 7, 8, "fizz", "buzz", 11, "fizz", 13, 14, "fizzbuzz"};
        assertThat(result, is(fizzBuzz.putNumbersInArray(15)));
    }
}
