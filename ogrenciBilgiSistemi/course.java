public class course {
    teacher teach;
    String name;
    String code;
    String prefix;
    int note;
    int verbal;
    double avarageLesson;

    course(String name, String code, String prefix, teacher t1){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teach=t1;
        int note=0;
    }

    void addTeacher(teacher teach){
        if (teach.branch.equals(this.prefix)){
            this.teach=teach;
        }
        else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }

    }
    void printteacherInfo(){
         this.teach.print();

    }

}
