package team1;

import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import org.junit.Test;


public class AppTest 
{
        public static void main(String[] args) {
            Scanner scan;
            scan = new Scanner(System.in);

            System.out.println("첫번째숫자하나입력");
            String input = scan.nextLine();


            System.out.println("*,/중 하나를 입력하세요");
            String input4 = scan.nextLine();

            System.out.println("두번째숫자하나입력");
            String input2 = scan.nextLine();

            int num = Integer.parseInt(input);
            int num2 = Integer.parseInt(input2);


            if(input4.equals("*")){
                int result = num * num2;
                System.out.println("두 수의 곱은"+result);
            }
            else if(input4.equals("/")){
                int result = num / num2;
                System.out.println("두 수의 나누기는"+result);
            }

            }
        }

