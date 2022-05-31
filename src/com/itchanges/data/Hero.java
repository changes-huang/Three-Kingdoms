package com.itchanges.data;


/**
 * @author changes-huang
 * @time   2022.05.31
 * @usage  this object defines the hero in the three kingdoms,they have name, age, country and soliders properties
 * */
public class Hero extends FoudamentalDataObject{
    public String name;
    public int age;
    public String country;
    public int soliders;

    public Hero() {
        this.name = "nobody";
        this.age = 24;
        this.country = "everywhere";
        this.soliders = 5000;
    }

    public Hero(String name, int age, String country, int soliders) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.soliders = soliders;
    }

    public String toString() {
        String string = "{Hero : " + "name: " + this.name + " " + "age: " + this.age + " " +
                "country: " + this.country + " " + "soliders: " + " " + this.soliders + " }";
        return string;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setSoliders(int soliders) {
        this.soliders = soliders;
    }

    public int getSoliders() {
        return soliders;
    }
}
