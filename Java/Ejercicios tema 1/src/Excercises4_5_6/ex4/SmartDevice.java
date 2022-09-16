package Excercises4_5_6.ex4;

public abstract class SmartDevice {

        //atributos
        String brand;
        String model;
        String operativeSystem;
        boolean waterproof;
        int memorySize;


        //constructores
        public SmartDevice(){
        }

        public SmartDevice(String brand, String model, String operativeSystem, boolean waterproof, int memorySize) {
            this.brand = brand;
            this.model = model;
            this.operativeSystem = operativeSystem;
            this.waterproof = waterproof;
            this.memorySize = memorySize;
        }

    //métodos}


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}

