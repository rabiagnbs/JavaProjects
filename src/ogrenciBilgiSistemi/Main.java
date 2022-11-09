package ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        teacher t1= new teacher("Mahmut Hoca","0505","Tarih");
        teacher t2= new teacher("Graham Bell","0506","Fizik");
        teacher t3= new teacher("Külyutmaz","0507","Biyoloji");

        course tarih=new course("tarih","101","Tarih",t1);
        tarih.addTeacher(t1);

        course fizik=new course("fizik","102","Fizik",t2);
        fizik.addTeacher(t2);

        course biyoloji=new course("biyoloji","103","Biyoloji",t3);
        biyoloji.addTeacher(t3);


        student s1=new student("inek şaban", "123","2",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,50,100);
        s1.addBulkExamVerbal(90,70,50);
        s1.avarage();

        s1.isPass();
        s1.printNote();
    }
}