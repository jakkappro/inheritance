public class Teacher {
    float salary;
    int bonus;

    public Teacher(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getInfo() {
        return "Teacher’s salary is " + salary + " and bonus is " + bonus;
    }
}
