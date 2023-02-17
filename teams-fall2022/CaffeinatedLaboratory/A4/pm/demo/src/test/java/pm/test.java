package test.java.pm;

public class test {
    public int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        test c = new test();
        int res = c.add(10,20);
        system.out.println(res);
    }
}
