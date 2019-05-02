package Encapsulation;

public class EtsyRegistrationPage {
    public static void main(String[] args) {
        EtsyAccounts acc1=new EtsyAccounts();
        EtsyAccounts acc2=new EtsyAccounts();

        acc1.setEmail("elturan312k@gmail.com");
        acc1.setName("Elturan");
        acc1.setPassword("asdfg12356");

        acc2.setEmail("emilson@gmail.com");
        acc2.setName("Emil");
        acc2.setPassword("qwerty56778");

        System.out.println("Email: "+acc1.getEmail());
        System.out.println("Firs name: "+acc1.getName());
        System.out.println("Password: "+acc1.getPassword());

        System.out.println("==============");

        System.out.println("Email: "+acc2.getEmail());
        System.out.println("Firs name: "+acc2.getName());
        System.out.println("Password: "+acc2.getPassword());

        EtsyAccounts acc3=new EtsyAccounts();
        acc3.setAccountInfo("qwer@gmail.com", "Seryi", "zxcvbnm123");
        System.out.println(acc3.getEmail()+ "|"+acc3.getName()+"|"+ acc3.getPassword());
        acc3.setEmail(acc3.getEmail().replace("gmail", "yahoo"));
        System.out.println(acc3.getEmail()+ "|"+acc3.getName()+"|"+ acc3.getPassword());


        System.out.println(acc3.getAccountInfo());

        EtsyAccounts yourAccount=new EtsyAccounts();
        yourAccount.setAccountInfo("your@gmail.com", "You", "jdij443");
        String accountInfo=yourAccount.getAccountInfo();
        System.out.println(accountInfo);


















    }
}
