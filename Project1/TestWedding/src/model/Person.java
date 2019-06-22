/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Person {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    
    
    public Person(String name, String lastName, String birthDate){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = LocalDate.parse(birthDate);
    }
    
    public String getName(){
        return name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public LocalDate getBirthDate(){
        return birthDate;
    }
    
}
