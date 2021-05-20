package uaslp.objetos.exams;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;
    private int capacity;
    private int availability;

    public Group(int cap) {
        capacity=cap;
        availability=cap;
        students=new ArrayList<>(cap);
    }

    public List<Student> getStudents()
    {
        return students;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getAvailability(){
        return availability;
    }
    public void addStudent(Student newStudent){
        if(availability>0)
        {students.add(newStudent);
        availability--;}
        else{
            throw new GroupIsFullException();
        }
    }

    public double getAverage(){
        Student student;
        double average=0;
        for(int i=0;i<students.size();i++){
            student=students.get(i);
            average+=student.getAverage();
        }
        average=average/(students.size());
        return average;
    }
}
