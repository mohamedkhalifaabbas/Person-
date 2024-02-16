/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.util.ArrayList;

/**
 *
 * @author elmnshawy
 */
public class Person {
    
      private   String name ;
  private   String email;
  private   String phone;
  private   int age ;

  private Birthdate birthdate  ;

  static ArrayList <Person> listOfPerson = new ArrayList<>();
  public Person(String name, String email, String phone, int age, Birthdate birthdate) {
    setName(name);
    setEmail(email);
    setPhone(phone);
    setAge(age);
    setBirthdate(birthdate);
    listOfPerson.add(this);
  }
  public Person(String name, String email, String phone, int age, int day , int month , int year) {
    setName(name);
    setEmail(email);
    setPhone(phone);
    setAge(age);
    birthdate = new Birthdate(day , month , year);
    setBirthdate(birthdate);
    listOfPerson.add(this);
  }


  public Person(String name, String email, String phone, int age) {
    setName(name);
    setEmail(email);
    setPhone(phone);
    setAge(age);
    listOfPerson.add(this);
  }

  public Person() {
    listOfPerson.add(this);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (isNameVaild(name))
       this.name = name;
    else System.out.println("Sorry ,Name is not vaild name");
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if (isEmailVaild(email))
        this.email = email;
    else System.out.println("Sorry , Email is Not Vaild");
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    if (isPhoneVaild(phone))
        this.phone = phone;
    else System.out.println("Sorry is unvaild phone number ");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if ( (age >= 20 && age <= 40))
        this.age = age;
    else System.out.println("Sorry age not vaild");
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            ", age=" + age +
              birthdate.toString() +
            '}';
  }

  /*

   */
  private boolean isNameVaild(String name){
    int length = name.length();
    if ((length> 0 && length <= 20) ){
      for (int i = 0; i < length; i++) {
        if ((name.charAt(i) < 'A' && name.charAt(i) > 'z') || name.charAt(i) == ' '){
          return false;
        }

      }
      return true;
    }

    return false ;
  }

  private boolean isEmailVaild(String email){
    String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return email.matches(regex) ;
  }

  private boolean isPhoneVaild(String phone){
    if (phone.length() == 11){
      String start = phone.substring(0 ,2);
      char thirdnumber = phone.charAt(2);
      if ((start.equals( "01" ) ) && (thirdnumber == '0' ||thirdnumber == '2' || thirdnumber == '5' )) return true ;
      else return false ;
    }
    return false;
  }

  public Birthdate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Birthdate birthdate) {
    if (birthdate.isVaildBirthdate())
      this.birthdate = birthdate;
  }
}
