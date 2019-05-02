package Encapsulation;

public class EtsyAccounts {
    private String email;
    private String name;
    private String password;

    public void setAccountInfo(String email, String name, String password){
        this.email=email;
        this.name=name;
        setPassword(password);

    }

    public String getAccountInfo(){
        String ret=email+" | "+name+" | "+ password;
        return ret;


    }


    public String getEmail(){
        return email;
    }
     public void setEmail(String newEmail){
        this.email=newEmail;
     }

     public String getName(){
        return name;
     }
     public void setName(String newName){
        name=newName;
     }
     public String getPassword(){
        return password;
     }
     public void setPassword(String password){
        if(password.length()<6) {
            System.out.println("Must be at least 6 characters");
            return;
        }
             this.password = password;

     }

}
