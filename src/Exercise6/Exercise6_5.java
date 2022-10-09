package Exercise6;
public class Exercise6_5 {
    public static void main(String[] args) {
        Student1 s = new Student1("홍길동",1,1,100,60,76);

        System.out.println(s.info());
    }
}

class Student1 {
    String name;
    int grade,classNum,korean,english,java;
    int Total() {
        return korean + english + java;
    }
    float Average(){
        float result = (float)Total()/3;
        return (float)(Math.round(result*10)/10.0);
    }
    Student1(){};

    Student1(String name, int grade, int classNum, int korean, int english, int java) {
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.korean = korean;
        this.english = english;
        this.java = java;
    }

    String info() {
        return name +","+ classNum +","+ korean +","+ english +","+ java +","+Total() +","+ Average();
    }

}