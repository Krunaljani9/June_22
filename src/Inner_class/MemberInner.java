package Inner_class;

public class MemberInner { //outer class
    private int num=100;
    class inner{ //inner class
        void disp(){
            System.out.println("inner disp()"+num);
        }
    }

    public static void main(String[] args) {

        MemberInner outer=new MemberInner();
        MemberInner.inner innerObj=outer.new inner();
        innerObj.disp();
        
    }
    
}
