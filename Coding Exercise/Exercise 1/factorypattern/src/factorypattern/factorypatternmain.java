package factorypattern;
import java.util.*;
public class factorypatternmain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			boolean flag=true;
			while(flag)
			{System.out.println("Enter task (bug / feature / improvement / exit): ");
				String tasktodo=sc.nextLine();
				switch(tasktodo.toLowerCase()){
					case "bug":
					{
						TaskFactory task=new bugFactory();
		                interfaceTask t1=task.getTask();
		                t1.task();
		                break;
					}
					case "feature":
					{TaskFactory task=new featureFactory();
		              interfaceTask t2=task.getTask();
		              t2.task();
		              break;
					}
					case "improvement":
					{
						TaskFactory task=new improvementFactory();
		               interfaceTask t3=task.getTask();
		               t3.task();
		               break;
			        }
					case "exit":
					{
						flag=false;
						continue;
					}
					default:
					{
						System.out.println("invalid task!");
						continue;
					}
				}
		}
			sc.close();
		
	

	}

}
