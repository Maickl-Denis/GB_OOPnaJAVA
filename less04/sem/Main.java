package GB_OOPnaJAVA.less04.sem;

import GB_OOPnaJAVA.less04.sem.data.Student;
import GB_OOPnaJAVA.less04.sem.data.Teacher;
import GB_OOPnaJAVA.less04.sem.view.StudentView;
import GB_OOPnaJAVA.less04.sem.view.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher taet1 = new Teacher("teatcher1", "teatc", "sssd0", LocalDate.now());
        System.out.println(taet1);

        StudentView sv1 = new StudentView();
        sv1.sendOnConsole(List.of(new Student("fname", "sName", "fdfsd",LocalDate.now())));
        System.out.println("Все норм");

        TeacherView tv1 = new TeacherView();
        tv1.sendOnConsole(List.of(new Teacher("fname", "sName", "fdfsd",LocalDate.now())));
        System.out.println("Все норм");
    }
}
