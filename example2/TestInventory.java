package example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestInventory {

    public static void main(String [] args) {

        GuitarSpec specs1 = new GuitarSpec ();
        specs1.setBackWood ( Wood.OAK);
        specs1.setTopWood ( Wood.OAK);
        specs1.setBuilder ( Builder.YAMAHA );

        GuitarSpec specs2 = new GuitarSpec ();
        specs2.setBackWood ( Wood.TOPOLL);
        specs2.setTopWood ( Wood.TOPOLL);
        specs2.setBuilder ( Builder.DOLCITO );

        List<Guitar> guitarList = new ArrayList();

        guitarList.add ( new Guitar ( specs1,40, "AB21") );
        guitarList.add ( new Guitar ( specs1,30, "AB22") );
        guitarList.add ( new Guitar ( specs1,90, "AB23") );

        guitarList.add ( new Guitar ( specs2,40, "CB24") );
        guitarList.add ( new Guitar ( specs2,40, "CB24") );
        guitarList.add ( new Guitar ( specs2,40, "CB24") );

        Inventory guitarInventory = new Inventory ( guitarList );

        List foundGuitars = guitarInventory.search ( specs1 );

        for(Iterator i = foundGuitars.iterator ();i.hasNext ();) {
            Guitar g = (Guitar) i.next ();

            System.out.println ( "Guitar: "+g.getSerialNumber () + " cost: "+g.getCost () );
        }

    }
}
