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

    public PersonalComputer(String pcName, int gigsRAM, int gigsStorage, int cpuCores, String cpuMaker, String operatingSystem){
        this.pcName = pcName;
        this.gigsRAM = gigsRAM;
        this.gigsStorage = gigsStorage;
        this.cpuCores = cpuCores;
        this.wifiOnOff = false;
        this.bluetoothOnOff = false;
        this.cpuMaker = cpuMaker;
        this.operatingSystem = operatingSystem;
    }

    public void setGigsRAM(int gigsRAM) {this.gigsRAM = gigsRAM;}

    public int getGigsRAM() {return gigsRAM;}

    public void setGigsStorage(int gigsStorage) {this.gigsStorage = gigsStorage;}

    public int getGigsStorage() {return gigsStorage;}

    public void setCpuCores(int cpuCores) {this.cpuCores = cpuCores;}

    public int getCpuCores() {return cpuCores;}

    public void setCpuMaker(String cpuMaker) {this.cpuMaker = cpuMaker;}

    public String getCpuMaker() {return cpuMaker;}

    public void setOperatingSystem(String operatingSystem) {this.operatingSystem = operatingSystem;}

    public String getOperatingSystem() {return operatingSystem;}

    public void toggleBluetooth(){
        if (bluetoothOnOff == false) {bluetoothOnOff = true;}
        else {bluetoothOnOff =false;}
    }

    public void toggleWifi(){
        if (wifiOnOff == false) {wifiOnOff = true;}
        else {wifiOnOff =false;}
    }
}
