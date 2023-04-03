package exer;

import java.util.Scanner;

public class Score204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 성적을 입력하세요: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		char ch;
		
		if(score >= 80) {
			ch = '수';
		} else if(score >= 60) {
			ch = '우';
		} else if(score >= 40) {
			ch = '미';
		} else if(score >= 20) {
			ch = '양';
		} else {
			ch = '가';
		}
				
		System.out.println("당신의 성적은 " + ch + "입니다.");

	}

}
