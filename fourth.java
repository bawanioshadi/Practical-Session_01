class One{
    int a=10;
    int b;

    void printDetails(){
        System.out.println("From class One a="+a);
        System.out.println("From class One b="+b);

    }
}
class Two{
    int a,c;
    void printDetails(){
        System.out.println("From class Two a="+a);
        System.out.println("From class Two c="+c);

    }
}
class App{
    public static void main(String[] args){
        One ol=new One();
        Two tl=new Two();
        ol.printDetails();
        ol.b=100;
        ol.printDetails();
        tl.printDetails();
        tl.a=20;
        tl.c=10;
        tl.printDetails();

    }
}