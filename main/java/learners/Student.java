package learners;

public class Student extends Person implements Learner{
    private double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
    totalStudyTime = totalStudyTime + numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
