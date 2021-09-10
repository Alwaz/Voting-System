/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoteSystem;

/**
 *
 * @author Hp
 */
class User {
    private int age;
    private String name, cnic, state, city, email, candidate;
    
    public User(String name, String cnic, int age, String state, String city, String email, String candidate){
        this.name = name;
        this.age = age;
        this.cnic = cnic;
        this.state = state;
        this.email = email;
        this.city = city;
        this.candidate = candidate;
    }
    
    public User(String candidate){
        this.candidate = candidate;
    }    
    
    public String getname(){
        return name;
    }

    public String getcnic(){
        return cnic;
    }

    public int getage(){
        return age;
    }

    public String getstate(){
        return state;
    }

    public String getcity(){
        return city;
    }

    public String getemail(){
        return email;
    }

    public String getcandidate(){
        return candidate;
    }
}
