package uaslp.objetos.exams;

import java.util.Iterator;
import java.util.List;

public class Group {
    private List<Student> students;
    private int capacity;
    private int availability;
    private double average;


    public Group(int cap) {
        capacity=cap;
        availability=cap;
    }

    public List<Student> getStudents()
    {
        return students;
    }
    public int getCapacity(){
        return capacity;
    }
    public int setCapacity(){
        return capacity;
    }
    public int getAvailability(){
        return availability;
    }
    public void addStudent(Student newStudent) throws GroupIsFullException{
        if(availability>0)
        {students.add(newStudent);
        availability--;}
        else{
            throw new GroupIsFullException();
        }
    }

    public double getAverage() throws  MissingScoreException{
        double suma = 0;
        for(Student currentStudent:students){
            suma+=currentStudent.getAverage();
        }
        average=suma/(getCapacity()-getAvailability());
        return average;
    }
}
