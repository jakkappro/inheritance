public class Programmer {
    float salary;
    int bonus;

    public Programmer(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getInfo() {
        return "Programmer’s salary is " + salary + " and bonus is " + bonus;
    }
}
