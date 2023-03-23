import java.util.ArrayList;

public class Teacher extends Person {
    private String name;
    private ArrayList canTeach,currentCourses;
    public Teacher(String name, ArrayList canTeach){
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<String>();
    }
    public void setCurrentCourses(String course){
        currentCourses.add(course);
    }

    public void setCanTeach(String course){
        canTeach.add(course);
    }

    public ArrayList getCanTeach(){
        return canTeach;
    }

    public ArrayList getCurrentCourses(){
        return currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }

        else{
            return false;
        }
    }
}
