enum EngineType {
    PETROL,
    DIESEL,
    ELECTRIC
}

class Car {
    protected String name;
    protected int seater;
    protected String color;
    protected EngineType engineType;

    Car(String name, int seater, String color, EngineType engineType) {
        this.name = name;
        this.seater = seater;
        this.color = color;
        this.engineType = engineType;
    }

    public void getCarDetails() {
        System.out.println(this.name + " is a " + this.seater + " seater " + this.getClass().getName() + " of color "
                + this.color + " and engine type " + this.engineType);
    }

    public void honk() {
        System.out.println("Honk Honk");
    }
}

class Sedan extends Car {
    Sedan(String name, String color, EngineType engineType) {
        super(name, 4, color, engineType);
    }

    @Override
    public void honk() {
        System.out.println("Sedan Honk");
    }
}

class SUV extends Car {
    SUV(String name, String color, EngineType engineType) {
        super(name, 7, color, engineType);
    }

    @Override
    public void honk() {
        System.out.println("SUV Honk");
    }
}


class Inheritance {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Honda Civic", "Black", EngineType.PETROL);
        SUV suv = new SUV("XUV700", "White", EngineType.ELECTRIC);
        sedan.getCarDetails();
        suv.getCarDetails();
    }
}
