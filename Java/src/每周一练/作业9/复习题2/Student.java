package 每周一练.作业9.复习题2;

public class Student implements Comparable{
    private int number;
    private String name;
    private int score;

    public Student(int number, String name, int score) {
        this.number = number;
        this.name = name;
        this.score = score;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return (student.score-this.score);
    }
}
