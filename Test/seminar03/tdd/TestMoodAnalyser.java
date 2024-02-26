package seminar03.tdd;

import Seminar03.tdd.MoodAnalyser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMoodAnalyser {

    MoodAnalyser someMood;

    @BeforeEach
    void setUp() {
        someMood = new MoodAnalyser();
    }

    @Test
    void testGoodMood() {
        assertEquals("Great! You can keep working!", someMood.analyseMood("I'm fine."));
    }

    @Test
    void testBadMood() {
        assertEquals("You need a break to rest. Take the day off!", someMood.analyseMood("I'm bad."));
    }

    @Test
    void testUnexpectedMood() {
        assertEquals("Explain it simply: bad or fine :/", someMood.analyseMood("I am bored."));
    }
}

