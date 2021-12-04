import java.util.Vector;

public class Course {
    private Department dept;
    private String title; // title of the course (e.g. “Intro to programming”);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private  Vector <Student>classList;// contains all students registered in this course

    //Getters And Setters
    public Department getDept() {
        return this.dept;

    }

    public String getCode() {
        return this.code;

    }
    public int getNumber(){
        return this.number;
    }

    public Course(String code, int number, Department dept, String title) {
        //initializing the private variable using "this" keyword
        this.code=code;
        this.number=number;
        this.dept=dept;
        this.title=title;
        this.classList=new Vector<Student>();
        //Initializing the vector



        // also initialize the classList;
    }

    public Course(int number){
        this.number=number;

    }

    public Course(){

    }

    public void addStudentToCourse(Student student){
        this.classList.add(student);
        //adding element to vector
    }

    public Vector<Student>getClassList(){
        return classList;
    }

    public String toString() {

        String str3=getCode()+" "+this.number+" "+this.title+" "+"Enrollment:"+" "+this.classList.size();
        return str3;
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

    }
}
