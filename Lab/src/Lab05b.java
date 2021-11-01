//Nicholas Bailey and Joshua Shuman-Thomas

public class Lab05b {
    public static void main(String[] args) {
        PersonalComputer desktop1 = new PersonalComputer("Nick's PC", 16, 2000, 4, "AMD", "Linux");
        PersonalComputer desktop2 = new PersonalComputer("Josh's Potato PC", 4, 32, 1, "Intel", "MacOS");

        desktop1.displaySpecs();
        desktop2.displaySpecs();
    }
}

class PersonalComputer{
    private String pcName;
    private int gigsRAM;
    private int gigsStorage;
    private int cpuCores;
    private boolean wifiOnOff;
    private boolean bluetoothOnOff;
    private String cpuMaker;
    private OperatingSystem operatingSystem;

    public PersonalComputer(){
        this.pcName = "null";
        this.gigsRAM = 0;
        this.gigsStorage = 0;
        this.cpuCores = 0;
        this.wifiOnOff = false;
        this.bluetoothOnOff = false;
        this.cpuMaker = "null";
        this.operatingSystem = new OperatingSystem("null");
    }

    public PersonalComputer(String pcName, int gigsRAM, int gigsStorage, int cpuCores, String cpuMaker, String osName){
        this.pcName = pcName;
        this.gigsRAM = gigsRAM;
        this.gigsStorage = gigsStorage;
        this.cpuCores = cpuCores;
        this.wifiOnOff = false;
        this.bluetoothOnOff = false;
        this.cpuMaker = cpuMaker;
        this.operatingSystem = new OperatingSystem((osName));
    }

    public String getPcName() {return pcName;}

    public void setPcName(String pcName) {this.pcName = pcName;}

    public void setGigsRAM(int gigsRAM) {this.gigsRAM = gigsRAM;}

    public int getGigsRAM() {return gigsRAM;}

    public void setGigsStorage(int gigsStorage) {this.gigsStorage = gigsStorage;}

    public int getGigsStorage() {return gigsStorage;}

    public void setCpuCores(int cpuCores) {this.cpuCores = cpuCores;}

    public int getCpuCores() {return cpuCores;}

    public void setCpuMaker(String cpuMaker) {this.cpuMaker = cpuMaker;}

    public String getCpuMaker() {return cpuMaker;}
    
    public void toggleBluetooth(){
        if (bluetoothOnOff == false) {bluetoothOnOff = true;}
        else {bluetoothOnOff =false;}
    }

    public void toggleWifi(){
        if (wifiOnOff == false) {wifiOnOff = true;}
        else {wifiOnOff =false;}
    }

    public void displaySpecs(){
        System.out.printf("---------------------------------------------------%n");
        System.out.printf("PC Name: %s%n", getPcName());
        System.out.printf("%s Gigabyte(s) of Ram%n", getGigsRAM());
        System.out.printf("%s Gigabyte(s) of Storage%n", (getGigsStorage()));
        System.out.printf("%s CPU Core(s)%n", getCpuCores());
        System.out.printf("CPU Manufacturer: %s%n", getCpuMaker());
        operatingSystem.displayOperatingSystem();
        System.out.printf("---------------------------------------------------%n%n");
    }
}

class OperatingSystem{
    private String osName;

    public OperatingSystem(){
        this.osName = "null";
    }

    public OperatingSystem(String osName){
        this.osName = osName;
    }

    private String getOperatingSystem(){
        return osName;
    }

    public void setOperatingSystem(String name){
        this.osName = name;
    }
    
    public void displayOperatingSystem(){
        System.out.printf("%s Operating System%n", getOperatingSystem());
    }
}
