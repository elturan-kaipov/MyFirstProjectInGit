package staticvariables;

public class Message {
    private String body;
    private String sender;
    private String reseiver;


    public Message(String body, String sender, String reseiver) {
        this.body = body;
        this.sender = sender;
        this.reseiver = reseiver;
    }

//    public Message(String body){
//        this.body = body;
//        this.sender = "Unknown";
//        this.reseiver = "Unknown";
//    }

    public Message(String body){
        this(body, "Unknown", "Unknown");
    }


//    public Message(String body, String reseiver){
////        this.body = body;
////        this.sender = "Unknown";
////        this.reseiver = reseiver;
////    }
    public Message(String body, String reseiver){
        this(body, "Unknown", reseiver);
    }

    public Message(){
        this("","Unknown", "Unknown");
    }

    @Override
    public String toString() {
        return "Message{" +
                "body='" + body + '\'' +
                ", sender='" + sender + '\'' +
                ", reseiver='" + reseiver + '\'' +
                '}';
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReseiver() {
        return reseiver;
    }

    public void setReseiver(String reseiver) {
        this.reseiver = reseiver;
    }
}
