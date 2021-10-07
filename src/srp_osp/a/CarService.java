package srp_osp.a;

public class CarService {
    public static void main(String[] args) {
        Car car = new Car(CarType.SPORTCAR, "Gallardo", "coupe", "red",
                25600000, 520, 314, 4.3);

        getCarService(new OffRoadDecoratorImp(car));
        getCarService(new SportCarDecoratorImp(car));
    }

    /*

    public static void getCarService (OffRoadDecorator offRoadDecorator) {
        offRoadDecorator.getCar();
    }

    public static void getCarService (SportCarDecorator sportCarDecorator) {
        sportCarDecorator.getCar();
    }
initialization
     */

    public static void getCarService (Decoratorint decoratorint) {  //реализация принципа OCP
        decoratorint.getCar();
    }

}
