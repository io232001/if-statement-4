package it.develhope.ifstatement;
public class Person {
    public int age;
    public Person()
    {
        int max = 80;
        int min = 5;
        int randomAge = (int) Math.floor(Math.random() * (max-min+ 1) + min);
        System.out.println("Random age generated: " + randomAge);
        this.age = randomAge;
    }

    public String getLifeStage() {
        if (age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 19) {
            return "Teen";
        } else if (age >= 20 && age <= 59) {
            return "Adult";
        } else {
            return "Senior Adult";
        }
    }
}