package example3;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numString;

    public boolean isEqual(GuitarSpec guitarSpec) {
        if(guitarSpec.getBackWood ()  != this.getBackWood ()) return false;
        if(guitarSpec.getBuilder () != this.getBuilder ()) return false;
        if(!guitarSpec.getModel ().equals ( this.getModel ()) ) return false;
        if(guitarSpec.getTopWood () != this.getTopWood ()) return false;
        if(guitarSpec.getType () != this.getType ()) return false;
        if(guitarSpec.getNumString () != this.getNumString ()) return false;
        return true;
    }

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

    public int getNumString() {
        return this.numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }
}
