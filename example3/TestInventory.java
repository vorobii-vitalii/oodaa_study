package example3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestInventory {

    public TestInventory () { }

    public static void main( String [] args) {

        GuitarSpec specs1 = new GuitarSpec ();
        specs1.setBackWood ( Wood.OAK);
        specs1.setTopWood ( Wood.OAK);
        specs1.setBuilder ( Builder.YAMAHA );
        specs1.setNumString ( 12);
        specs1.setModel ( "Model 1" );
        specs1.setType ( Type.CLASSIC );

        GuitarSpec specs2 = new GuitarSpec ();
        specs2.setBackWood ( Wood.TOPOLL);
        specs2.setTopWood ( Wood.TOPOLL);
        specs2.setBuilder ( Builder.DOLCITO );
        specs2.setNumString ( 6 );
        specs2.setModel ( "Model 2" );
        specs2.setType ( Type.ACOUSTIC );

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
