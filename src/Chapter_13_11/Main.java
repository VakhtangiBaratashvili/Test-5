package Chapter_13_11;

class Main {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = octagon1.clone();

        System.out.println("Area of Octagon 1: " + octagon1.area());
        System.out.println("Perimeter of Octagon 1: " + octagon1.perimeter());

        try {
            System.out.println("\nArea of Octagon 2 (cloned): " + octagon2.area());
            System.out.println("Perimeter of Octagon 2 (cloned): " + octagon2.perimeter());

            int comparisonResult = octagon1.compareTo(octagon2);

            if (comparisonResult > 0) {
                System.out.println("\nOctagon 1 has a larger area.");
            } else if (comparisonResult < 0) {
                System.out.println("\nOctagon 2 has a larger area.");
            } else {
                System.out.println("\nBoth octagons have the same area.");
            }
        } catch (NullPointerException e) {
            System.out.println("Cloning failed. octagon2 is null.");
        }
    }
}
