public class Olympiad125 {
    int seconds;
    int minutes;
    int hours;

    public Olympiad125(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {
        Olympiad125 start = new Olympiad125(12, 34, 55),
                stop = new Olympiad125(17, 20, 25),
                diff;

        diff = difference(stop, start);

        System.out.printf("The Olympiad went on for %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static Olympiad125 difference(Olympiad125 stop, Olympiad125 start)
    {
        Olympiad125 diff = new Olympiad125(0, 0, 0);

        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;
        return(diff);

    }
}
