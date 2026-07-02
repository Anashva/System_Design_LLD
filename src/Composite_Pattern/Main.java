package Composite_Pattern;

public class Main {
    public static void main(String[] args) {
//        Developer d1=new Developer("Rahul");
//        Developer d2=new Developer("Rohit");
//        Manager manager=new Manager("Ankit");
//        manager.add(d1);
//        manager.add(d2);
//        Manager ceo=new Manager("Rohil");
//        ceo.add(manager);
//        ceo.showdetails();
//


        File resume=new File("Resume.pdf",2);
        File img1=new File("img.jpg",5);
        File img2=new File("img2.jpg",10);
        File java=new File("java.pdf",3);
        File lld=new File("ll.pdf",4);
        Folder photos=new Folder("Photos");
        photos.add(img1);
        photos.add(img2);
        Folder projects=new Folder("Projects");
        projects.add(java);
        projects.add(lld);

        Folder root=new Folder("Root");
        root.add(resume);
        root.add(photos);
        root.add(projects);
        System.out.println("Folder Structure: ");
        root.showdetails("");
        System.out.println();

        System.out.println("Total size : "+root.getsize()+" mb");




//        Folder Structure:
//     [Folder] Root
//        Resume.pdf (2 mb)
//        [Folder] Photos
//             img.jpg (5 mb)
//             img2.jpg (10 mb)
//        [Folder] Projects
//             java.pdf (3 mb)
//             ll.pdf (4 mb)
//
//        Total size : 24 mb


    }
}
