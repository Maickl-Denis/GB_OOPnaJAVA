package GB_OOPnaJAVA.less04.sem.view;

import GB_OOPnaJAVA.less04.sem.data.Teacher;
import GB_OOPnaJAVA.less04.sem.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> students) {
        for(Teacher user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}

