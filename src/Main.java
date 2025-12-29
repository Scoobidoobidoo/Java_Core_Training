public class Main {
    public static void main(String[] args) {
        Monitor myMonitor = new Monitor("Samsung", 1200, "5435435", 960, 1200);
        System.out.println(myMonitor);

        Device myDevice = new Device ("Apple", 500, "15454");
        System.out.println(myDevice);

        EthernetAdapter myEthernetAdapter = new EthernetAdapter("Samsung", 1111, "456456", 45, "123456789");
        System.out.println(myEthernetAdapter);
    }

}
