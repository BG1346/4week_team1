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
      System.out.println("10 미만의 임의 2개의 숫자를 계산하는 계산기 입니다.");
      int num1 = (int)(9*Math.random()+1);
      int num2 = (int)(9*Math.random()+1);
      System.out.println("ex)" + num1 + " + , -, *, / " + num2);
      int result = num1 + num2;
      System.out.println("두 수의 덧셈은" +num1+"+"+num2+"="+result);
      result = num1 - num2;
      System.out.println("두 수의 뺄셈은"+num1+"-"+num2+"="+result);
      result = num1 * num2;
      System.out.println("두 수의 곱셈은"+num1+"*"+num2+"="+result);
      result = num1 / num2;
      System.out.println("두 수의 나눗셈은"+num1+"/"+num2+"="+result);
      result = num % num2;
      System.out.println("두 수를 나눈 나머지는"+num1+"%"+num2+"="+result);



    }
}

