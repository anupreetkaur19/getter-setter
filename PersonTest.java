/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class PersonTest {
    public static void main(String args[]){
        person sumanth = new person();
        sumanth.name = "sumanth";
        sumanth.address = "toronto";
        sumanth.age = 20;
        
    System.out.println("Name : " + sumanth.name + "\n Address: " + sumanth.address + "\n Age : " + sumanth.age);
//    person anupreet = new person();
//    anupreet.setName();
// String nm = anupreet.getName();
// System.out.println("Name : " + nm);
// anupreet.setAddress();
// String add = anupreet.getAddress();
// anupreet.setAge();
// int age = anupreet.getAge();
// System.out.println("Name :" + nm + "\nAddress :" + add + "\nAge :" + age);
// 
// person anu = new person();
// anu.setData();
// System.out.println(anu.toString());
 
 person aman = new person();
 System.out.println(aman.toString());
 
 person rimpal = new person("rimpal", "brampton", 20);
 System.out.println(rimpal.toString());
 
 person rimpal2 = new person(rimpal);
 System.out.println(rimpal2.toString());
 
    }
    
}
