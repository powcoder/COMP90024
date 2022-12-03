https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
import mpi.*;
public class HelloWorld {
       public static void main(String args[]) throws Exception {
             MPI.Init(args);
             int me = MPI.COMM_WORLD.Rank();
             int size = MPI.COMM_WORLD.Size();
             System.out.println("Hi from <"+me+">");
             MPI.Finalize();
       }
}

