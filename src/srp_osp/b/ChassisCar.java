package srp_osp.b;

public class ChassisCar {

    private Car car;
    private EngineCar engineCar;

    public ChassisCar(Car car, EngineCar engineCar) {
        this.car = car;
        this.engineCar = engineCar;
    }
    public ChassisCar(Car car) {};

    public EngineCar getEngineCar() {
        return engineCar;
    }

    public void chassisRealization () {

        String model = car.getModel();
        String type = car.getChassis_type();
        System.out.println("Метод описывает работу шасси в зависимости от типа шасси и модели машины");

    }
}
