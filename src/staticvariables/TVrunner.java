package staticvariables;

public class TVrunner {
    public static void main(String[] args) {
        TV myTV=new TV();
        TV smartTV=new TV("Toshiba");
        TV cakeTV=new TV("HP");

        System.out.println(myTV.isOn());
        System.out.println(smartTV.isOn());
        System.out.println(cakeTV.isOn());

        myTV.turnOn();
        myTV.setChannel(20);
        smartTV.setChannel(55);

        System.out.println("My TV "+myTV.getChannel());
        System.out.println("SmartTv "+smartTV.getChannel());
        System.out.println("CakeTV "+cakeTV.getChannel());

        cakeTV.turnOff();
        cakeTV.setChannel(20);

    }
}
