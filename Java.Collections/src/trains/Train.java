package trains;

public class Train {

    private String type;
    private int wagonCapacity;
    private int baggageQuantity;
    private int loadCopacity;

    public Train(String type, int wagonCapacity, int baggageQuantity) {
        this.type = type;
        this.wagonCapacity = wagonCapacity;
        this.baggageQuantity = baggageQuantity;

    }
    public Train(int loadCopacity) {
        this.loadCopacity = loadCopacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public void setWagonCapacity(int wagonCapacity) {
        this.wagonCapacity = wagonCapacity;
    }

    public int getBaggageQuantity() {
        return baggageQuantity;
    }

    public void setBaggageQuantity(int baggageQuantity) {
        this.baggageQuantity = baggageQuantity;
    }

    public int getLoadCopacity() {
        return loadCopacity;
    }

    public void setLoadCopacity(int loadCopacity) {
        this.loadCopacity = loadCopacity;
    }
}
