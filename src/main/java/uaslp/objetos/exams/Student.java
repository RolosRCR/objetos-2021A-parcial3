package uaslp.objetos.exams;

public class Student {
    private String name;
    private int code;
    private Integer score[];

    public Student(String name, int code) {
        this.name = name;
        this.code = code;
        score=new Integer[3];
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int partial, int score) throws InvalidPartialException {
       if (partial>3||partial<1)
           throw new InvalidPartialException();
       else
           this.score[partial-1]=score;
    }
    public double getAverage() throws MissingScoreException{
        double average=0;
        for(int i=0;i<3;i++){
            if(score[i]==null)
                throw new MissingScoreException("Missing partial "+(i+1));
            average+=score[i];
        }
        average/=3;
        return average;
    }
}
