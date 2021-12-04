import java.util.Vector;

public class Department {
    private String name; // the name of school “Dept of Computing and Info Science.”
    private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.

    //Getters And Setters
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }
    public Department(String name, String id) {
        //initializing the private variable using "this" keyword
        this.name=name;
        this.id=id;
        this.courseList=new Vector<Course>();
        this.registerList=new Vector<Student>();



        // also initialize the vectors
    }

    public void registerStudentCourseInDepartment(Student student,Course course){
        this.registerList.add(student);
        this.courseList.add(course);
        //initializing the vectors using this keyword


    }

    public void printCoursesOffered(){
        //Printing the courses that are offered
        System.out.println("Courses offered are: ");
        for (int i=0;i<courseList.size();i++){
            System.out.println((i+1)+" "+courseList.elementAt(i));

        }
    }

    public void printStudentByName(){
        //Printing the student name
        System.out.println("Student registered in this department are: ");
        for(int i = 0; i < registerList.size(); i++)
            System.out.println((i+1) + ") " + registerList.elementAt(i));
    }


    public boolean isStudentRegistered(Student student){
        return this.registerList.contains(student);
        //returns true or false
    }

    private Vector<Student> studentsRegisteredInCourse(int code){//keeping the method private as it will be restricted to this class itself
        boolean x=false;
        Vector<Student>students=new Vector<Student>();//create and initializing a new vector
        for (int i=0;i<courseList.size();i++){

            if (code==(courseList.elementAt(i)).getNumber()){
                students=(courseList.elementAt(i)).getClassList();//using the class list to store the students of a particular code
                x=true;
                break;


            }
        }

        if (x){
            return students;//if the code is found

        }
        else {
            //otherwise return null
            return null;
        }


    }

    public void printStudentsRegisteredInCourse(int code){
        Vector<Student>students2=studentsRegisteredInCourse(code);//creating a new vector to store the vector that is returned by studentsRegisteredInCourse
        for (int i=0;i<students2.size();i++){
            //Using for loop to print the vector
            System.out.println(students2.elementAt(i));
        }



    }

    public Course largestCourse(){
        int a = -1, b = -1, max = -1;

        for(int i= 0; i < courseList.size(); i++)
        {
            a = (courseList.elementAt(i)).getClassList().size();
            if(a>max)
            {
                max = a;
                b = i;
            }
        }
        return courseList.elementAt(b);//returning the largest course



    }









    public String toString() {
        String str2=this.id+" "+this.courseList.size()+" "+"courses"+" ,"+this.registerList.size()+" "+"students";
        return str2;
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students
    }
}
