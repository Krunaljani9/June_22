package Inner_class;

abstract class Test{
    abstract void disp();
}
interface TestInterface{
    void show();
}
public class anonymous {

    public static void main(String[] args) {
        Test t=new Test() {
            void disp(){
                System.out.println("anonymous inner class method invoked");
            }
        };
        t.disp();
        TestInterface obj=new TestInterface() {
           public void show(){
                System.out.println("anonymous interface method invoked");
            }
        };
        obj.show();
    }
}
