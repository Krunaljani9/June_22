package Inner_class;

public class localinner {
int num=10;
    public static void main(String[] args) {
        localinner obj=new localinner();
        obj.disp();
    }
    void disp(){
        class InnerLocal{
            void show(){
                System.out.println("local inner class method invoked"+num);
            }
        }
        InnerLocal objinner=new InnerLocal();
        objinner.show();
    }
}
