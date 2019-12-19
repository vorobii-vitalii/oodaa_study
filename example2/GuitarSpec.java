package example2;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public Builder getBuilder () {
        return builder;
    }

    public String getModel () {
        return model;
    }

    public Type getType () {
        return type;
    }

    public Wood getBackWood () {
        return backWood;
    }

    public Wood getTopWood () {
        return topWood;
    }

    public void setBackWood ( Wood backWood ) {
        this.backWood = backWood;
    }

    public void setBuilder ( Builder builder ) {
        this.builder = builder;
    }

    public void setModel ( String model ) {
        this.model = model;
    }

    public void setTopWood ( Wood topWood ) {
        this.topWood = topWood;
    }

    public void setType ( Type type ) {
        this.type = type;
    }
}
