package GB_OOPnaJAVA.less04.sem.view;

import GB_OOPnaJAVA.less04.sem.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
