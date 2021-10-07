package srp_osp.b;

public class EngineCar {

    private Car car;
    private ChassisCar chassisCar;

    public EngineCar(Car car, ChassisCar chassisCar) {
        this.car = car;
        this.chassisCar = chassisCar;
    }

    public EngineCar(Car car){
        this.car = car;
    };

    public void engineRealization () {

        String model = car.getModel();
        String type = car.getEngine_type();
        System.out.println("Метод описывает работу двигателяв зависимости от типа двигателя и модели машины");

    }
}
