package 每周一练.作业7;



public class Student implements Comparable {
    String number;
    int score;

    public Student(String n, int s){
        this.number = n;
        this.score = s;
    }
    @Override
    public int compareTo( Object o) {
        Student student = (Student) o;
        return (this.score-student.score);//升序
    }
}
