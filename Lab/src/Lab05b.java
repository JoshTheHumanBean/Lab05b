public class Lab05b {
    public static void main(String[] args) {
        System.out.printf("Monkey%n");
    }
}

class PersonalComputer{
    private int gigsRAM;
    private int gigsStorage;
    private int cpuCores;
    private boolean wifiOnOff;
    private boolean bluetoothOnOff;
    private String cpuMaker;
    private String operatingSystem;


    public PersonalComputer(){
        this.gigsRAM = 0;
        this.gigsStorage = 0;
        this.cpuCores = 0;
        this.wifiOnOff = false;
        this.bluetoothOnOff = false;
        this.cpuMaker = "null";
        this.operatingSystem = "null";
    }
}
