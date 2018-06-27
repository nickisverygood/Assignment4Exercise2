//Your Name          :Bo Ying, Su
//Class and Section  :CIS35A
//Assignment Number  :4

public class Driver {
    public static void main(String[] args){
        Ship[] ships = new Ship[10];


        for(int i=0;i<ships.length;i++){
            ships[i] = new Ship();
        }
        ships[0] = new CruiseShip();
        ships[1] = new CargoShip();


        ships[0].engineSwitch();
        ships[1].engineSwitch();
        ships[2].engineSwitch();
    }
}
