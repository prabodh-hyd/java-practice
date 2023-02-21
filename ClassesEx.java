class Lamp {
    /*a class is a blueprint or a template that defines the properties and behaviors of a certain type
            of object. It encapsulates data and methods that operate on that data.*/
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
            //An object, on the other hand, is an instance of a class.
            Lamp l1=new Lamp();
            Lamp l2=new Lamp();
            l1.turnOn();
            l2.turnOff();

        }
    }

