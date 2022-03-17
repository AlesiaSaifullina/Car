public class Wheel implements Cargo{
    private int r;

    public Wheel(int r){
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public int getWeight() {
        return r * 3;
    }
}
