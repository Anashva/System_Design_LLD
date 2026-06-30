package Factory_Pattern;

import java.util.Scanner;

public class Notification_Factory {
    public static  Notification getNotification(String type){
//        if(type.equalsIgnoreCase("EmailNotification")){
//            return new EmailNotification();
//        }
//        else if(type.equalsIgnoreCase("SMSNotification")){
//            return new SMSNotification();
//        }
//        else if(type.equalsIgnoreCase("WhatasppNotification")){
//            return new WhatasppNotification();
//        }
//        return null;

        switch (type.toLowerCase()) {

            case "emailnotification":
                return new EmailNotification();

            case "smsnotification":
                return new SMSNotification();

            case "whatasppnotification":
                return new WhatasppNotification();

            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String notif=sc.next();
        Notification NF=Notification_Factory.getNotification(notif);
        NF.sendnotification();
    }

}
