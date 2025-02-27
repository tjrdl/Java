package Java.question10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("인원수>>");
		int num = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기용
		String search = "";

		Map<String, String> phone = new HashMap<String, String>();

		for (int i = 0; i < num; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸 없이 입력>>>");
			phone.put(sc.next(), sc.next());
		}
		System.out.println("저장되었습니다....");

		while (true) {
			System.out.println("검색할 이름>> ");
			search = sc.next();

			if (search.equals("그만")) {
				break;
			}
			if (phone.containsKey(search)) {
				System.out.println(search + "의 번호는 " + phone.get(search) + " 입니다.");
			}
		}
		sc.close();

	}

}
