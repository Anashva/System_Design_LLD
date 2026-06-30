package Split_Wise;


public class Person {
    int amount_paid;
    private String person_name;
    public Person(int amount_paid,String person_name){
        this.amount_paid=amount_paid;
        this.person_name=person_name;
    }
    public String getPerson_name(){
        return person_name;
    }
}
