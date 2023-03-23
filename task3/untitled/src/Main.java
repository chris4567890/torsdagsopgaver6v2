import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("Python");
        courses.add("Essential oils");
        courses.add("c++");
        courses.add("c#");
        ArrayList<Person> persons = new ArrayList<Person>();
        Student s1 = new Student("Christian",courses);
        s1.setPassedCourses("Java 1.0");
        Student s2 = new Student("Nicolai",courses);
        Teacher t1 = new Teacher("Signe",courses);
        Teacher t2 = new Teacher("Tess",courses);
        t2.setCanTeach("Java 1.0");
        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);

        for(int i = 0; i < persons.size(); ++i){

            if (persons.get(i).addCourse("Java 1.0") == false){
                if (persons.get(i) instanceof Student){
                    System.out.println(persons.get(i).getName()+ " Har allerede bestået dette kursus");
                } else if (persons.get(i) instanceof Teacher) {
                    System.out.println(persons.get(i).getName() + "Kan ikke undervise dette emne");
                }
            }
        }

    }
}