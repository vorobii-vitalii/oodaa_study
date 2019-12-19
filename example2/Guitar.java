package example2;

public class Guitar {
    private GuitarSpec specs;
    private double cost;
    private String serialNumber;

    public Guitar(GuitarSpec specs,double cost,String serialNumber) {
        this.specs = specs;
        this.cost = cost;
        this.serialNumber = serialNumber;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getCost() {
        return this.cost;
    }

    public String getSerialNumber () {
        return this.serialNumber;
    }

    public GuitarSpec getSpecs () {
        return specs;
    }

    public void setSpecs ( GuitarSpec specs ) {
        this.specs = specs;
    }
}
