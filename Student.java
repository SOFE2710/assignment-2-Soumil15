import java.util.Vector;

public class Student extends Person {
    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in


    public Student(String stdName, String stdId) {
        //initializing the private variable using "this" keyword
        this.name=stdName;
        this.id=stdId;
        this.courses=new Vector<Course>();

    }
    public Student(){
        //Constructor

    }


    public void registerFor(Course course){
        this.courses.add(course);
        // initializing the vectors



    }
    public boolean isRegisteredInCourse(Course course){
        return this.courses.contains(course);
        //returns true or false

    }

//Getters and Setters
    public String getName() {
        return this.name;

    }

    public String getId() {
        return this.id;

    }




    public String toString() {
        String str=getId()+" "+getName();
        return str;

        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850




    }
}
