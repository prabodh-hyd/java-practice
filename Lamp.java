public class Lamp {
    //example program on classes and object creation
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Light On? :" + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Light On?:" + isOn);
    }
}
     class Main{
        public static void main(String[] args){
            Lamp l1=new Lamp();
            Lamp l2=new Lamp();
            l1.turnOn();
            l2.turnOff();

        }
    }

