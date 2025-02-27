package Java.question10;

import java.util.Scanner;

class Member {
	private String id;
	private String name;
	private String country;

	private static int count = 0;

	Member(String id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
		count++;
	}

	public String getId() {
		return id;
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public static int getCount() {
		return count;
	}

	public static void delete() {
		count--;
	}
}

public class MemberAct {
	static Member[] member = new Member[100]; // max 100
	static int memberCount = 0;
	public static void menu() {
		System.out.println("=== 헬스클럽 회원관리 프로그램===");
		System.out.println("1. 회원 정보관리 | 2. 프로그램 종료");
		System.out.println("============================");
		System.out.println("메뉴를 선택하세요. >>>");
	}

	public static void mebermenu() {
		System.out.println("==== 일반회원 정보관리 ====");
		System.out.println("11. 일반회원 정보입력 | 22. 일반회원 정보삭제 | 33. 일반회원 정보 확인 | 0. 이전단계");
		System.out.println("============================");
		System.out.println("메뉴를 선택하세요. >>>");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inner = 0;

		String id, name, country;

		while (true) {
			menu();
			int select = sc.nextInt();
			sc.nextLine();

			if (select == 1) {
				while (true) {

						mebermenu();
						inner = sc.nextInt();
						sc.nextLine();

						if (inner == 11) {
							System.out.println("가입할 회원 수를 입력하세요>> ");
							int i = sc.nextInt();
							sc.nextLine();
							for (int j = 0; j < i; j++) {
								System.out.println("회원 정보를 입력하세요.");
								System.out.println("회원 아이디: ");
								id = sc.next();
								System.out.println("회원 이름: ");
								name = sc.next();
								System.out.println("회원 지역: ");
								country = sc.next();
								member[memberCount++] = new Member(id, name, country);
							}
						}
						if (inner == 22) {
						    System.out.println("삭제할 회원 번호를 입력하세요.");
						    int deleteIndex = sc.nextInt();
						    sc.nextLine();

						    if (deleteIndex > 0 && deleteIndex <= memberCount) {
						        // 삭제할 회원 정보 초기화
						        member[deleteIndex - 1] = null;

						        // 배열 정리: 삭제된 위치 이후의 회원을 앞으로 이동
						        for (int i = deleteIndex - 1; i < memberCount - 1; i++) {
						            member[i] = member[i + 1];
						        }

						        member[memberCount - 1] = null; // 마지막 자리 정리
						        memberCount--; // 현재 회원 수 감소
						        Member.delete();

						        System.out.println("회원이 삭제되었습니다.");
						    } else {
						        System.out.println("잘못된 회원 번호입니다.");
						    }
						}

						if (inner == 33) {
							System.out.println("등록된 회원수는 " + Member.getCount());
							for (int i = 0; i < memberCount; i++) {
								System.out.println("회원 번호: " + (i+1));
								System.out.println("회원 아이디: " + member[i].getId());
								System.out.println("회원 이름: " + member[i].getName());
								System.out.println("회원 지역: " + member[i].getCountry());
								System.out.println();
							}
						}

						if (inner == 0) {
							break;
						}

					
					
					
				}

			}
			if (select == 2) {
				break;
			}
		}
		sc.close();
	}

}
