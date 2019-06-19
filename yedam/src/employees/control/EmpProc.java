package employees.control;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import employees.common.EmpService;
import employees.common.Employee;
import employees.impl.EmpServiceImpl;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	EmpService service = EmpServiceImpl.getInstance();

	public void execute() {
		loginCheck();
		int menu = 0;
		while (true) {
			System.out.println("메뉴를 선택하세요. 1)단건조회 2)전체조회 3)입력 4)업데이트 9)종료");
			menu = sc.nextInt();
			if (menu == 1)
				getEmpProc();
			else if (menu == 2)
				getEmpListProc();
			else if (menu == 3)
				insertEmp();
			else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}

	public void updateEmpProc() {
		System.out.println("1) salary 2) Email 변경.");
		int choice = 0;
		int empId, salary;
		if (choice == 1) {
			System.out.println("변경할 사원ID:");
			empId = sc.nextInt();
			sc.nextLine();
			System.out.println("Salary 입력:");
			sc.nextLine();

		}
	}

//	public void updateEmpProc() {
//		System.out.println("변경할 사원ID:");
//		int empId= sc.nextInt();sc.nextLine();
//		System.out.println("Salary 입력:");
//		int salary = sc.nextInt();sc.nextLine();
//		
//	}
	// 로그인체크
	public void loginCheck() {
		Map<String, String> map = service.memberInfo();
		while (true) {
			System.out.println("아이디를 입력:");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력:");
			String pw = sc.nextLine();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인이 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("존재하지 않는 아아디입니다.");
			}
		}
	}

	// 한건입력
	public void insertEmp() {
		System.out.println("아이디를 입력:");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력:");
		String firstName = sc.nextLine();
		System.out.println("성을 입력:");
		String lastName = sc.nextLine();
		System.out.println("Salary 입력:");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Email 입력:");
		String email = sc.nextLine();
		System.out.println("Job 입력:");
		String jobId = sc.nextLine();
		Employee emp = new Employee(empId, firstName, lastName, salary);
		emp.setEmail(email);
		emp.setJobId(jobId);
		service.insertEmp(emp);
	}

	// 단건조회
	public void getEmpProc() {
		// EmpService service = new EmpServiceImpl();
		System.out.println("조회할 ID를 입력하세요.");
		int empId = sc.nextInt();
		Employee emp = service.getEmp(empId);
		System.out.println(emp);
	}

	// 전체조회
	public void getEmpListProc() {
		// EmpService service = new EmpServiceImpl();
		List<Employee> list = service.getEmpList();
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
}
