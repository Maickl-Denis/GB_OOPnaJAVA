package GB_OOPnaJAVA.less01.lect.lw02;

import java.util.ArrayList;

public class Robot1 {
    enum  State{
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex=1;
        names = new ArrayList<String>();
    }


    /**
     * Уровень робота
     */
    private int level;

    /**
     * Имя робота
     */
    private String name;

    private State state;

    /**
     * Создание робота
     * @param name Имя робота! Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot1(String name, int level) {
        if((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Robot1.names.indexOf(name)!=-1){
            this.name = String.format("DefaultName_%d", defaultIndex++);
        }else {
            this.name=name;
        }
        Robot1.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }
    public Robot1(String name){
        this(name, 1);
    }
    public Robot1(){
        this("");
    }

//     Методы вкл\выкл подсистем
    public void power(){
        if (this.state==State.Off){
            this.powerOn();
            this.state=State.On;
        }else {
            this.powerOff();
            this.state=State.Off;
        }
    }
    private void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff(){
        this.sayBya();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel(){
        return this.level;
    }

    public String getName(){
        return this.name;
    }
    /**Загрузка BIOS */
    private void startBIOS(){
        System.out.println("Start BIOS...");
    }

    /**Загрузка OS */
    private void startOS(){
        System.out.println("Start OS...");
    }

    /**Приветствие */
    private void sayHi(){
        System.out.println("Hello world...");
    }
    /**Выключение BIOS */
    private void stopBIOS(){
        System.out.println("Stop BIOS...");
    }
    /**Выключение OS*/
    private void stopOS(){
        System.out.println("Stop OS...");
    }
    /**Прощание*/
    private void sayBya(){
        System.out.println("Bye...");
    }
    /**Работа*/
    public void work(){
        if (this.state==State.On) {
            System.out.println("Working...");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}
