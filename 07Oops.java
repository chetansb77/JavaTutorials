class Lamp {
    private boolean isOn = false;
    private String name;

    Lamp() {
        this.name = "Default Lamp Name";
        System.out.println("Lamp: " + name + " created");
    }

    Lamp(String name) {
        this.name = name;
        System.out.println("Lamp: " + name + " created");
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println(this.name + " on? " + this.isOn);
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println(this.name + " on? " + this.isOn);
    }

    public void changeName(String name) {
        String oldName = this.name;
        this.name = name;
        System.out.println(oldName + " changed to " + this.name);
    }
}

class StaticClass {
    static int max = 100;

    static {
        max = 200;
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public int getMax() {
        return max;
    }
}

class Oops {
    public static void main(String[] args) {
        Lamp led = new Lamp("LED");
        Lamp halogen = new Lamp("HALOGEN");

        led.turnOn();
        halogen.turnOn();

        led.changeName("LED Saka");

        led.turnOff();
        halogen.turnOff();

        StaticClass.sayHello();

        StaticClass staticObj = new StaticClass();

        System.out.println(staticObj.getMax());
        StaticClass.max = 500;
        System.out.println(staticObj.getMax());

        boolean instanceName = led instanceof Lamp;
        System.out.println(instanceName);
    }
}
