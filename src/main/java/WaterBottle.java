public class WaterBottle {
    private int volume;


    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int drink() {
        return this.volume - 10;
    }

    public int empty() {
        return this.volume = 0;
    }

    public int full() {
        return this.volume = 100;
    }
}

