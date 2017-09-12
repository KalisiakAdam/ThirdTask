import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    private Keyboard keyboard;
    private InputStream inputStream;
    private Scanner sc;

    @Before
    public void setUp() {
        keyboard = new Keyboard();
    }

    @Test
    public void shouldReturnNumber_ifItIsNumber() throws InputMismatchException {
        String input = "4";
        inputStream = new ByteArrayInputStream(input.getBytes());
        sc = new Scanner(inputStream);
        assertEquals(4, keyboard.keyboardNumber(sc));
    }

    @Test
    public void shouldReturnZero_ifItIsNotANumber() throws InputMismatchException {
        String input = "k";
        inputStream = new ByteArrayInputStream(input.getBytes());
        sc = new Scanner(inputStream);
        assertEquals(0, keyboard.keyboardNumber(sc));


    }
}
