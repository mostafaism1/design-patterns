public class SquarePegToRoundPegAdapter implements RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegToRoundPegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getLength() * Math.sqrt(2) / 2;
    }

}
