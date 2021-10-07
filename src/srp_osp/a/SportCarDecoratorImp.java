package srp_osp.a;

public class SportCarDecoratorImp implements Decoratorint {  //реализация принципа SRP и OSP

    private Car car;

    public SportCarDecoratorImp(Car car) {
        this.car = car;
        if (car.getCarType() != CarType.SPORTCAR)
            System.out.println("Это не спорткар");
    }

    @Override
    public void getCar() {
        if (car.getCarType() != CarType.SPORTCAR)
            System.out.println("Я никогда не разгонялся до 200 км/ч");
        System.out.println("Я самыая быстрая машина");
    }
}
