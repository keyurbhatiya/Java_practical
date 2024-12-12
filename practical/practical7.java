class xyz {
    int x,y,z;
    void getdata(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
    void display(){
        int m = x*x;
        int n = y*y;
        int p = z*z;
        System.out.println("Sum of squares: " + (m + n + p));
    }

}
/**
 * Innerpractical7
 */
public class practical7{

    public static void main(String[] args) {
        xyz obj = new xyz();
        obj.getdata(5,5,5);
        obj.display();
    }
}
