package Singleton_Pattern;

public class DBConnection {
    private static DBConnection db;
    private DBConnection(){}
    private static DBConnection getInstance(){
        if(db==null){
            db=new DBConnection();
        }
        return db;
    }

    public static void main(String[] args) {
        DBConnection db1=DBConnection.getInstance();
        DBConnection db2= DBConnection.getInstance();
        System.out.println(db1==db2);


//        Runnable task = () -> {
//            DBConnection obj = DBConnection.getInstance();
//            System.out.println(Thread.currentThread().getName()
//                    + " -> " + obj);
//        };
//
//        Thread t1 = new Thread(task, "T1");
//        Thread t2 = new Thread(task, "T2");
//
//        t1.start();
//        t2.start();
    }

}
