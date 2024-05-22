package learners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    private List<Person> personList = new ArrayList<>();


    public void add(Person person){
        this.personList.add(person);
    }
    public Person findById(long id){
        for(Person p : personList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public boolean contains(Person person){
        return personList.contains(person);
    }
    public void remove(Person person){
        personList.remove(person);
        if(!personList.contains(person)){
            System.out.println("Person was removed from list");
        }
    }
    public void remove(long id){
        for(Person p : personList){
            if(p.getId() == id){
                personList.remove(p);
            }
        }
    }
    public void removeAll(){
        List<Person> anotherList = personList;
        anotherList.removeAll(personList);
    }
    public int count(){
        return personList.size();
    }
    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }


    @Override
    public Iterator<Person> iterator() {
        return personList.listIterator();
    }
}
