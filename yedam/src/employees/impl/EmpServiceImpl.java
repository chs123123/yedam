package employees.impl;

import java.util.List;
import java.util.Map;

import employees.common.EmpService;
import employees.common.Employee;

public class EmpServiceImpl implements EmpService {
	private static EmpServiceImpl singLeton = new EmpServiceImpl();
	private EmpServiceImpl() {}
	public static EmpServiceImpl getInstance() {
		return singLeton;
	}
	EmpDAO dao = new EmpDAO();
	@Override
	public Employee getEmp(int empId) {
		return dao.getEmp(empId);
	}

	
	@Override
	public List<Employee> getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public void insertEmp(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void updateEmp(Employee emp) {
		
	}

	@Override
	public void deleteEmp(int empId) {
		return;
	}
	@Override
	public Map<String, String> memberInfo() {
		return dao.memberInfo();
	}
	
}
