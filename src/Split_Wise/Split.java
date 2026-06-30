package Split_Wise;

import java.util.Collections;
import java.util.*;
import java.util.PriorityQueue;

public class Split {
    public static void main(String[] args) {
        Person p1=new Person(900,"Manasvi");
        Person p2=new Person(600,"Anashva");
        Person p3=new Person(0,"Ayushi");
        HashMap<Person,Integer>  mp=new HashMap<>();
        mp.put(p1,p1.amount_paid);
        mp.put(p2,p2.amount_paid);
        mp.put(p3,p3.amount_paid);
        List<Person> persons = List.of(p1,p2,p3);
        int total=0;
        for(Person p : persons){
            total += p.amount_paid;
        }
        int size=mp.size();
        for (int val:mp.values()){
            total+=val;
        }
        int share=total/size;
        System.out.println("share-> "+share);
        PriorityQueue<Balance>  cred=new PriorityQueue<>((a,b)->b.person_bal-a.person_bal);
        PriorityQueue<Balance> deb=new PriorityQueue<>((a,b)->b.person_bal-a.person_bal);
        for (Person p:mp.keySet()){
            System.out.println();
            int val=mp.get(p)-share;
            if(val<0){
                deb.add(new Balance(p,-val));
            }
            else if(val>0){
                cred.add(new Balance(p,val));
            }
        }
        while(!cred.isEmpty() && !deb.isEmpty()){
            Balance a=cred.poll();
            Balance b=deb.poll();
            int amnt=Math.min(a.person_bal,b.person_bal);
            System.out.println(b.prsn.getPerson_name()+" pays "+a.prsn.getPerson_name()+" "+amnt);
            a.person_bal-=amnt;
            b.person_bal-=amnt;
            if(a.person_bal>0){
                cred.add(a);
            }
            if(b.person_bal>0){
                deb.add(b);
            }
        }

    }
}
