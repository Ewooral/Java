
public class ClassTutorial {
    private int x;
    private int y;

    // constuctor
    public ClassTutorial(int startx, int starty) {
        this.x = startx;
        this.y = starty;
    }

    // declaration of three methods
    public int getX() {
        return x;
    }

    public int getY() {
        String s = "3";
        int x = Integer.parseInt(s);
        double q = Double.parseDouble(s);
        System.out.println(x + q);

        return y;
    }

    public double distance(ClassTutorial otherpt) {
        int dx = x - otherpt.getX();
        int dy = y - otherpt.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        // instance of the class
        ClassTutorial p1 = new ClassTutorial(3, 4);
        ClassTutorial p2 = new ClassTutorial(6, 8);

        System.out.println("..............");
        System.out.println(p1.distance(p2)); // 5.0
    }

}
