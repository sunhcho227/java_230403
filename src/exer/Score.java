package exer;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 점수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();

		if(score >= 80) {
			System.out.println("당신은 우수 입니다!");
		} else if(score >= 60) {
			System.out.println("당신은 보통 입니다!");
		} else if(score >= 40) {
			System.out.println("당신은 미달 입니다!");
		} else {
			System.out.println("당신은 낙제 입니다!");
		}
		// 다중 if는 조건이 여러개일때 쓴다
		// 조건이 1개일때는 if(조건), else(나머지 값들)
		// 조건이 2개이상 일때는 if, else if(첫번째 조건에 걸리지 않는 것들), else(1,2 조건 모두에 해당 안되는 것들)
		// 쉽게 말하면 계속해서 범위가 줄어드는 것
		
		
	}

}