package GB_OOPnaJAVA.less01.lect.lw01;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);

        System.out.println(a.getX());
        System.out.println(a.getY());

        Point2D b = new Point2D();
//        b.x =0;
//        b.y = 10;
        System.out.println(b);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
