package srp_osp.b;

public class Prob {

    public static void main(String[] args) {
        Car car = new Car("Toyota Supra", "2JZ-GTE", "type");

        ChassisCar chassisCar = new ChassisCar(car, new EngineCar(car));
        chassisCar.chassisRealization();
        chassisCar.getEngineCar().engineRealization();  //Если нам нужны обе реализации


        ChassisCar chassisCar1 = new ChassisCar(car);   //Реализации по отдельности
        try {
            chassisCar1.getEngineCar().engineRealization();
        }
        catch (NullPointerException e) {
            System.out.println("\nЯ не знаю как работает двигатель");
        }



    }
}
