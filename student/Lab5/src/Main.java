public class Main {
    public static void main(String[] args) {
        Student ps = new Student("Piotr Shishkov", 18, new Course[]{
                new Course("OOP", 10),
                new Course("BD", 7),
                new Course("Math", 8)
        });
        Student mv = new Student("Vladislav Maslihov", 20, new Course[]{
                new Course("OOP", 8),
                new Course("BD", 9),
                new Course("Math", 7)
        });
        Student kt = new Student("Konstantin Tolici", 20, new Course[]{
                new Course("OOP", 8),
                new Course("BD", 9),
                new Course("Math", 7)
        });

        University utm = new University("UTM", 1964, new Student[]{ps,mv,kt});

        System.out.println("University: "+utm.Name+" was founded in "+ utm.FoundationYear);
        System.out.println("Students list");
        for (Student st:utm.Students) {
            System.out.println("\nStudent: "+st.Name+"; Age: "+st.Age+";");
            System.out.println("\nMarks");
            for (Course mark:st.Marks){
                System.out.println("Course: "+mark.Name+"; Mark: "+mark.Mark+";");
                

            }
        }
    }
}


class University {
    public String Name;
    public int FoundationYear;
    public Student[] Students;

    public University(String name, int foundYear, Student[] students){
        Name = name;
        FoundationYear = foundYear;
        Students = students;
    }
}

class Student{
    public String Name;
    public int Age;
    public Course[] Marks;

    public Student(String name, int age, Course[] marks){
        Name = name;
        Age = age;
        Marks = marks;
    }
}

class Course{

    public int Mark;
    public String Name;

    public Course(String name, int mark){
        Name = name;
        Mark = mark;
    }
}