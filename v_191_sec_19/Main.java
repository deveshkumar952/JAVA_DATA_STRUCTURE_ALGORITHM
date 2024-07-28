

public class Main {
    public static void main(String[] args) {
        Main r = new Main();
        var rec = r.factorial(3);
        System.out.println(rec);
    }

public int factorial (int n){
    if(n<1){
        return -1;
    }
    if(n==0 || n==1){
        return 1;
    }
    System.out.println(n);
    return n* factorial(n-1);
}
}
