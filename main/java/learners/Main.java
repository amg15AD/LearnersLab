package learners;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.add(new Person(101,"Jack"));
        people.add(new Person(102,"Nate"));
        people.add(new Person(103,"Lois"));
        System.out.println(people.count());
        Person person = new Person(104,"Peter");
        people.add(person);
        System.out.println(people.count());

        System.out.println(people.findById(103).getName());
        Person[] people1 = people.toArray();
       for(Person p: people1){
           System.out.println(p.getName());
       }

    }
}
