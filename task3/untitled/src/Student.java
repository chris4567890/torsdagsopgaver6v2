import java.util.ArrayList;

public class Student extends Person{
    private String name;
    private ArrayList passedCourses, currentCourses;

    public Student(String name, ArrayList passedCourses){
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<String>();
    }
    public void setPassedCourses(String course){
        passedCourses.add(course);
    }
    public ArrayList getPassedCourses(){
        return passedCourses;
    }

    public ArrayList getCurrentCourses(){
        return currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course)){
            return true;
        }
        else{
            currentCourses.add(course);
            return false;
        }
    }
}
