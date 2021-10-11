package com.company;

public class Colleague {
    String FullName;
    String Post;
    String Email;
    String Phone;
    float Wages;
    int Age;


Colleague(String FullName, String Post, String Email, String Phone, float Wages, int Age){
this.FullName = FullName;
this.Post = Post;
this.Email = Email;
this.Phone = Phone;
this.Wages = Wages;
this.Age = Age;

}
void printInfo(){
    System.out.println("ФИО: " + FullName);
    System.out.println("Должность: "+ Post);
    System.out.println("Почта: "+ Email);
    System.out.println("Телефон: "+ Phone);
    System.out.println("Зарплата "+ Wages);
    System.out.println("Возраст: "+ Age);
}
}
