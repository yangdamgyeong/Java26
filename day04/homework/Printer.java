package homework;

public class Printer {
    int numOfPapers = 0;

    public void print(int amount) {
        numOfPapers -= amount;
    }
}