package ogrenciBilgiSistemi;

public class student {
    course c1;
    course c2;
    course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass=false;

    student(String name, String stuNo, String classes, course c1, course c2, course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=avarage;
        this.isPass=false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note=note3;
        }
    }

    void addBulkExamVerbal(int verbal1, int verbal2, int verbal3){
        if(verbal1>=0 && verbal1<=100){
            this.c1.verbal=verbal1;
        }
        if(verbal2>=0 && verbal2<=100){
            this.c2.verbal=verbal2;
        }
        if(verbal3>=0 && verbal3<=100){
            this.c3.verbal=verbal3;
        }
    }

    void avarage(){
        c1.avarageLesson=(c1.verbal*0.20)+(c1.note*0.80);
        c2.avarageLesson=(c2.verbal*0.30)+(c2.note*0.70);
        c3.avarageLesson=(c3.verbal*0.10)+(c3.note*0.90);

    }

    void isPass(){
        this.avarage=(this.c1.avarageLesson+ this.c2.avarageLesson + this.c3.avarageLesson)/3.00;

        if(this.avarage>50){
            this.isPass=false;
            System.out.println("Sınıfı başarılı bir şekilde geçmiştir.");
        }
        else{
            this.isPass=true;
            System.out.println("Sınıfta kalmıştır.");
        }
        System.out.println("ortalamanız:"+this.avarage);
    }

    void printNote(){
        System.out.println(c1.name +" notu: "+c1.avarageLesson);
        System.out.println(c2.name +" notu: "+c2.avarageLesson);
        System.out.println(c3.name +" notu: "+c3.avarageLesson);

    }

}
