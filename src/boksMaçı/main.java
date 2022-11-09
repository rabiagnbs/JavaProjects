package boksMaçı;

public class main {
    public static void main(String[] args) {
        fighter f1=new fighter("ali",10,120,100);
        fighter f2=new fighter("mustafa",20,85,85);
        match match=new match(f1,f2,85,100);
        match.run();
    }
}
