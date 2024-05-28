package inflearn.basic1.method;

public class Value {

    /* 기본형과 참조형의 메서드 호출
    *
    * 우선, 기본형과 참조형의 대입은 인스턴스를 복사하는 것이 아닌, 값을 복사하는 것이다.
    *   기본형은 10, 10.0 등의 value가 복사가 된다.
    *   참조형은 인스턴스 주소를 가리킨다. 즉, 같은 주소를 가리키는 것이 있다면 값이 변경되면 전부 값이 치환된다.
    *
    * 자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다. 그러나 이 값이 실제 값이냐, 참조(메모리 주소)값이냐에 따라
    * 동작이 달라진다.
    *   - 기본형 : 메서드로 기본형 데이터를 전달하면 해당 값이 복사되어 전달된다. 이 경우, 메서드 내부에서 매개변수의 값을 변경해도,
    *             호출자의 변수 값에는 영향이 없다.
    *   - 참조형 : 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다. 이 경우, 메서드 내부에서 파라미터로 전달된 객체의
    *             멤버 변수를 변경하면, 호출자의 객체도 변경된다.
    * */

    public static void main(String[] args) {
//        Student student1 = new Student();
//        initStudent(student1, "박건욱", 15, 100);
//
//        Student student2 = new Student();
//        initStudent(student2, "홍길동", 17, 80);

        Student student1 = createStudent("박건욱",15,100);
        Student student2 = createStudent("홍길동",17,80);

        printStudent(student1);
        printStudent(student2);

    }


    static  Student createStudent(String name, int age, int grade) { // 반환형은 Student 이다.
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // createStudent 메소드에 필드를 넘겨주면 student 메모리 주소를 리턴한다.
                        // 그러면 필드를 보내는 곳 에서 반환값은 Student 이여야한다.
    }
    static void printStudent(Student student) {
        System.out.println( student.name + student.age + student.grade );
    }
//
//    static void initStudent(Student student, String name, int age, int grade) { // 참조값과, 기본형의 값을 전달받는다.
//        student.name = name;
//        student.age = age;
//        student.grade = grade;
//    }
}

class Student {
    String name;
    int age;
    int grade;
}
