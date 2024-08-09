import com.codegym.Student;

public class Main {

    public static void main(String[] args) {
        Student student01 = new Student();
        System.out.println(student01.getId());//0
        System.out.println(student01.getName());//null

        student01.setId(2);
        student01.setName("Huy");
        System.out.println(student01.getId());//2
        System.out.println(student01.getName());//"Huy"

        Student student02 = new Student(1, "Tho");
        System.out.println(student02.toString());//{id: 1, name: "Tho", gender: false}
        student02.setGender(true);
        System.out.println(student02.toString());//{id: 1, name: "Tho", gender: true}

    }
}