public class Client {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        SquarePeg squarePeg = new SquarePeg(5);
        RoundPeg roundPeg = new SquarePegToRoundPegAdapter(squarePeg);

        System.out.println(roundHole.fits(roundPeg));
    }

}
