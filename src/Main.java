public class Main {
    public static void main(String[] args){
        Car audi = new Car();

        audi.model = "Audi A3";
        audi.speed = 10;
        audi.type = "Sports";
        audi.increaseSpeed(20);

        System.out.println(audi.model + " Hızı : " + audi.speed);
        System.out.println(audi.type);

        Car bmw = new Car();
        bmw.model = "BMW M3";
        bmw.speed = 20;
        bmw.type = "HB";

        System.out.println(bmw.model + " Hızı : " + bmw.speed);
        System.out.println(bmw.type);

        Car mercedes = new Car();
        mercedes.model = "Mercedes C";
        mercedes.speed = 30;
        mercedes.type = "Sedan";

        System.out.println(mercedes.model + " Hızı : " + mercedes.speed);
        System.out.println(mercedes.type);


    }
}
