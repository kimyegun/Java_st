package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		//ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		//ArrayList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
			
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간", (endTime-startTime));
		
		//LinkedList 컬렉션에 저장하는 시간 측정

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간", (endTime-startTime));
	
	}
	}

