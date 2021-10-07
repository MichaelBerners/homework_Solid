package srp_osp.a;

public class Car {
    private CarType carType;
    private String model;
    private String body_type;
    private String color;
    private int price;
    private int engine_power;
    private int max_speed;
    private double overclocking_100;

    public Car(CarType carType, String model, String body_type, String color, int price,
               int engine_power,int max_speed, double overclocking_100) {
        this.carType = carType;
        this.model = model;
        this.body_type = body_type;
        this.color = color;
        this.price = price;
        this.engine_power = engine_power;
        this.max_speed = max_speed;
        this.overclocking_100 = overclocking_100;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getModel() {
        return model;
    }

    public String getBody_type() {
        return body_type;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getEngine_power() {
        return engine_power;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public double getOverclocking_100() {
        return overclocking_100;
    }
}
