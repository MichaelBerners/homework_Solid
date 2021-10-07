package srp_osp.b;

public class Car {
    private String model;
    private String engine_type;
    private String chassis_type;

    public Car(String model, String engine_type, String chassis_type) {
        this.model = model;
        this.engine_type = engine_type;
        this.chassis_type = chassis_type;
    }

    public String getModel() {
        return model;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public String getChassis_type() {
        return chassis_type;
    }
}
