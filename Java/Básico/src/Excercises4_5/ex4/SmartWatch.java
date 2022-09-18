package Excercises4_5.ex4;

public class SmartWatch extends SmartDevice{
    boolean pedometer;
    boolean camera;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, String operativeSystem, boolean waterproof, int memorySize, boolean pedometer, boolean camera) {
        super(brand, model, operativeSystem, waterproof, memorySize);
        this.pedometer = pedometer;
        this.camera = camera;
    }

    public boolean isPedometer() {
        return pedometer;
    }

    public void setPedometer(boolean pedometer) {
        this.pedometer = pedometer;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }
}
