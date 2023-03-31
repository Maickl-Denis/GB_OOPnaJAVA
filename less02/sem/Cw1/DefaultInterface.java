package GB_OOPnaJAVA.less02.sem.Cw1;

public interface DefaultInterface {
    void printBankAcount();
    default void getUserName(){
        System.out.println("значение по умолчанию");
    };

}
