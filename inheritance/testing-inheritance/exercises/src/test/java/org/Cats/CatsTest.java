package org.Cats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CatsTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}

