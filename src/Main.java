import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a,c;
        float kq=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap a");
        a= scanner.nextInt();
        System.out.println("nhap c");
        c= scanner.nextInt();
        if (a!=0 && c!=0){
            kq=c/a;
            System.out.println("phuong trinh co nghiem la"+kq);
        }
        if (a==0 && c==0) {
                System.out.println("phuong trinh vo so nghiem");
        }
        if (a==0 && c!=0){
                    System.out.println("phuong trinh vo nghiem");
        }
    }
}