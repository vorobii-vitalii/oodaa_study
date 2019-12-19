package example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List guitarList;

    public Inventory(List guitarList) {
        this.guitarList = guitarList;
    }

    public Inventory() {
        this.guitarList = new ArrayList ( );
    }

    public void addGuitar(Guitar guitar) {
        guitarList.add ( guitar );
    }

    public List search(GuitarSpec searchSpecs) {
        List matchedGuitars = new ArrayList ( );

        for(Iterator i = guitarList.iterator ();i.hasNext ();) {
            Guitar currentGuitar = (Guitar) i.next ();
            GuitarSpec currentGuitarSpecs = currentGuitar.getSpecs ();

            if(currentGuitarSpecs.getBackWood () != searchSpecs.getBackWood ())
                continue;
            if(currentGuitarSpecs.getTopWood () != searchSpecs.getTopWood ())
                continue;
            if(currentGuitarSpecs.getBuilder () != searchSpecs.getBuilder ())
                continue;

            matchedGuitars.add ( currentGuitar );
        }
        return matchedGuitars;
    }
}
