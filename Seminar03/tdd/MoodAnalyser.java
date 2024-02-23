package Seminar03.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("bad")) {
            return "You need a break to rest. Take the day off!";
        }
        if (message.contains("fine")) {
            return "Great! You can keep working!";
        }
        else {
            return "Explain it simply: bad or fine :/";
        }
    }

}
