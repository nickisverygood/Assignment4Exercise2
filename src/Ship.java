//Your Name          :Bo Ying, Su
//Class and Section  :CIS35A
//Assignment Number  :4

public class Ship {
    boolean floating;
    double capacity;
    double length;
    double width;
    String name;
    double height;
    String origin;
    String departuredate;
    String arrivaldate;
    String departingport;
    String arrivalport;
    String owner;
    boolean engineOn = false;

    public boolean engineSwitch() {
        if(this.engineOn) {
            engineOn = false;
            System.out.print("Ship Engine Turned Off!\n");
        }else {
            engineOn = true;
            System.out.print("Ship Engine Turned On!\n");
        }
        return engineOn;

    }
}