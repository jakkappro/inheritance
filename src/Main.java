public class Main {
    public static void main(String args[]) {
        Programmer programmer = new Programmer(100, 1);
        Teacher teacher = new Teacher(50, 1);

        System.out.println(programmer.getInfo());
        System.out.println(teacher.getInfo());
    }
}
