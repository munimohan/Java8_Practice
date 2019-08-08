package LamdaExpression;

import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;
 
public class Person1 {
   
    public enum Sex {
        MALE, FEMALE
    }
   
    String name; 
    LocalDate birthday;
    Sex gender;
    String emailAddress;
   
    Person1(String nameArg, LocalDate birthdayArg,
        Sex genderArg, String emailArg) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
    }  
 
    public int getAge() {
        return birthday
            .until(IsoChronology.INSTANCE.dateNow())
            .getYears();
    }
 
    public void printPerson() {
      System.out.println(name + ", " + this.getAge());
    }
     
    public Sex getGender() {
        return gender;
    }
     
    public String getName() {
        return name;
    }
     
    public String getEmailAddress() {
        return emailAddress;
    }
     
    public LocalDate getBirthday() {
        return birthday;
    }
     
    public static int compareByAge(Person1 a, Person1 b) {
        return a.birthday.compareTo(b.birthday);
    }
 
    public static List<Person1> createRoster() {
         
        List<Person1> roster = new ArrayList<>();
        roster.add(
            new Person1(
            "Fred",
            IsoChronology.INSTANCE.date(1980, 6, 20),
            Person1.Sex.MALE,
            "fred@example.com"));
        roster.add(
            new Person1(
            "Jane",
            IsoChronology.INSTANCE.date(1990, 7, 15),
            Person1.Sex.FEMALE, "jane@example.com"));
        roster.add(
            new Person1(
            "George",
            IsoChronology.INSTANCE.date(1991, 8, 13),
            Person1.Sex.MALE, "george@example.com"));
        roster.add(
            new Person1(
            "Bob",
            IsoChronology.INSTANCE.date(2000, 9, 12),
            Person1.Sex.MALE, "bob@example.com"));
         
        return roster;
    }
     
}