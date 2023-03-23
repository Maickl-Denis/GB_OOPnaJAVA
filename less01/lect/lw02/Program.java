package GB_OOPnaJAVA.less01.lect.lw02;

public class Program {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1("name_1");
        System.out.println("-------------");
        System.out.println(robot1);
        robot1.power();
        robot1.work();
        robot1.power();
        robot1.work();
        robot1.power();

    }
}
