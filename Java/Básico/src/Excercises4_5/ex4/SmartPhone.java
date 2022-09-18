package Excercises4_5.ex4;

public class SmartPhone extends SmartDevice{
    int cameraPx;
    int extraibleSD;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, String operativeSystem, boolean waterproof, int memorySize, int cameraPx, int extraibleSD) {
        super(brand, model, operativeSystem, waterproof, memorySize);
        this.cameraPx = cameraPx;
        this.extraibleSD = extraibleSD;
    }

    public int getCameraPx() {
        return cameraPx;
    }

    public void setCameraPx(int cameraPx) {
        this.cameraPx = cameraPx;
    }

    public int getExtraibleSD() {
        return extraibleSD;
    }

    public void setExtraibleSD(int extraibleSD) {
        this.extraibleSD = extraibleSD;
    }
}
