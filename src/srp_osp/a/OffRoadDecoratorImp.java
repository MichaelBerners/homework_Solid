package srp_osp.a;

public class OffRoadDecoratorImp implements Decoratorint {  //реализация принципа SRP и OSP

    private Car car;

    public OffRoadDecoratorImp(Car car) {
        this.car = car;
        if (car.getCarType() != CarType.OFFROAD)
            System.out.println("Это не внедорожник");
    }

    @Override
    public void getCar() {
        if (car.getCarType() != CarType.OFFROAD){
            System.out.println("Я не умею ездить по болотам, лесам и полям");
            return;
        }
        System.out.println("Я самый лучший внедорожник");
    }
}
