package uaslp.objetos.exams;

public class Student {
    private String name;
    private int code;
    private int score[] = new int[3];
    private double average;

    public Student() {

    }
    public Student(String name, int code) {
        this.name = name;
        this.code = code;
        average=0;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int parcial, int score) throws InvalidPartialException {
        if (parcial > 0 && parcial < 4) {
            this.score[parcial] = score;
            if(parcial == 3){
                average=(this.score[1]+this.score[2]+this.score[3])/3;
            }
        } else {
            throw new InvalidPartialException();
        }
    }
    public double getAverage() throws MissingScoreException{
        if (average!=0){
            return average;}
        else {throw new MissingScoreException();
        }
    }
}
