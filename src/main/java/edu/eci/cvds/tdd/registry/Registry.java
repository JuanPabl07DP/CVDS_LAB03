package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    private ArrayList<Person> people;

    public Registry(){
        people = new ArrayList<>();
    }

    public RegisterResult registerVoter(Person p) {
        boolean duplicate = false;
        int idPerson = p.getId();
        for(Person person : people){
            if(person.getId() == idPerson){
                duplicate = true;
            }
        }
        if(duplicate){
            return RegisterResult.DUPLICATED;
        }
        if (!p.isAlive()){
            return RegisterResult.DEAD;
        }
        if (p.getAge()<0 || p.getAge()>122){
            return RegisterResult.INVALID_AGE;
        }
        if (p.getAge()<18 && p.getAge()>0){
            return RegisterResult.UNDERAGE;
        }
        people.add(p);
        return RegisterResult.VALID;
    }
}