import java.util.*;

package team1;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("두개의 숫자를 입력받아 계산합니다. 첫번째 숫자를 입력해주세요");

	int num1 = input.nextInt();

	System.out.println("연산자를 입력해주세요. (+, -, *, / 중 하나)");

	int operator = input.nextInt();

	System.out.println("두번째 숫자를 입력해주세요.");

	int num2 = input.nextInt();

	
	   if(operator == '-'){
	   int result = num1 - num2;
	   System.out.println("두 수의 빼기는"+result);
	  }
	  else if(operator == '+'){
	   int result = num1 + num2;
	   System.out.println("두 수의 합은"+result);
	  }
	  else
   	  {
	   System.out.println("잘못된 입력입니다.");
	  }






    }
}
