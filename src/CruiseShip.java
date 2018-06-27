//Your Name          :Bo Ying, Su
//Class and Section  :CIS35A
//Assignment Number  :4

public class CruiseShip extends Ship {
    double ticketprice;
    int numberofrooms;
    String numberofcranes;
    String services [];
    String cruisetype;

    @Override
    public boolean engineSwitch() {
        if(this.engineOn) {
            engineOn = false;
            System.out.print("CruiseShip Engine Turned Off!\n");
        }else {
            engineOn = true;
            System.out.print("CruiseShip Engine Turned On!\n");
        }
        return engineOn;

    }
}

