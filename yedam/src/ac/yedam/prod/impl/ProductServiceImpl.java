package ac.yedam.prod.impl;

import java.util.List;

import ac.yedam.prod.ProductService;
import ac.yedam.prod.ProductVo;
import ac.yedam.prod.control.ProdProc;

public class ProductServiceImpl implements ProductService {
	private static ProductServiceImpl singLeton = new ProductServiceImpl();
	ProductDAO product = new ProductDAO();

	private ProductServiceImpl() {
	}

	public static ProductServiceImpl getInstance() {
		return singLeton;

	}

	@Override
	public ProductVo getProduct(String code) {
		return null;
	}

	@Override
	public List<ProductVo> getProductList() {
		return product.getProdList();
	}

	@Override
	public void insertProduct(ProductVo vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduct(ProductVo vo) {
		// TODO Auto-generated method stub

	}
}

/*
 * package employees.impl;
 * 
 * import java.util.List; import java.util.Map;
 * 
 * import employees.common.EmpService; import employees.common.Employee;
 * 
 * public class EmpServiceImpl implements EmpService { private static
 * EmpServiceImpl singLeton = new EmpServiceImpl(); private EmpServiceImpl() {}
 * public static EmpServiceImpl getInstance() { return singLeton; } EmpDAO dao =
 * new EmpDAO();
 * 
 * @Override public Employee getEmp(int empId) { return dao.getEmp(empId); }
 * 
 * 
 * @Override public List<Employee> getEmpList() { return dao.getEmpList(); }
 * 
 * @Override public void insertEmp(Employee emp) { dao.insertEmp(emp); }
 * 
 * @Override public void updateEmp(Employee emp) {
 * 
 * }
 * 
 * @Override public void deleteEmp(int empId) { return; }
 * 
 * @Override public Map<String, String> memberInfo() { return dao.memberInfo();
 * }
 * 
 * }
 * 
 */