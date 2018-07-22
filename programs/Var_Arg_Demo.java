public class Var_Arg_Demo {
        public static void method1(int... a){
            System.out.println("var-arg method");
        }
        public static void main(String[] args){
            method1();
            method1(10);
            method1(20,30);
            method1(10,20,30,40);
        }
        
}
