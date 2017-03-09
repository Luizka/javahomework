package project16;

/**
 * Created by Луиза on 07.03.2017.
 */
public class Test {
    int a;
    final int b;
    final int v;
    int s;
    int x;

    public Test() {
        b = 2;
        v = 4;
    }

    public Test(int a, int b){
        this();
        this.a = a;
        this.s = b;
    }
    public Test(int a, int b, int c){
        this(a,b);
        this.x = c;
    }
}

