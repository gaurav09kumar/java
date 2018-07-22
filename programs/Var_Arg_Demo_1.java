public class Var_Arg_Demo_1{
        public static void sum(int... a){
            int total=0;
            for(int x1:a){
                total=total+x1;
            }
            System.out.println("The total is "+total);
        }
        public static void main(String[] args){
            sum();
            sum(10);
            sum(20,30);
            sum(10,20,30,40);
        }
        
}
