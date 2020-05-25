import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {


    @Test
    void findMissingLetter() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
    }
}