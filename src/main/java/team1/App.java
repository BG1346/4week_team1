import java.util.*;
package team1;

public class App {

    public static void main(String[] args) {
      // 유저정보 출력
      User user1 = new User();
      user1.setName("jason");
      user1.setAge(29);
      user1.setYears("senior");
      System.out.println(user1.getName()+" "+user1.getAge()+" "+user1.getYears());
      
      // 계산기
      System.out.println("두개의 숫자를 계산하는 계산기 입니다.");
      int num1 = (int)(10*Math.random());
      int num2 = (int)(10*Math.random());
      System.out.println("ex)" + num1 + " + , - " + num2);
      System.out.println("연산자를 입력해주세요. (+, -, *, / 중 하나)");
      System.out.println("두번째 숫자를 입력해주세요.");
	   int result = num1 + num2;
	   System.out.println("두 수의 빼기는"+num1+"+"+num2+"="+result);
	   result = num1 - num2;
	   System.out.println("두 수의 합은"+num1+"-"+num2+"="+result);
     if(input4.equals("*")){
          int result = num * num2;
          System.out.println("두 수의 곱은"+result);
      }
      else if(input4.equals("/")){
          int result = num / num2;
          System.out.println("두 수의 나누기는"+result);
    }
}

