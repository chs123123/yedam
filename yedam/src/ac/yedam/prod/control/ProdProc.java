package ac.yedam.prod.control;

import java.util.List;
import java.util.Scanner;

import ac.yedam.prod.ProductVo;
import ac.yedam.prod.impl.ProductServiceImpl;



public class ProdProc {
	Scanner sc = new Scanner(System.in);
	ProductServiceImpl service = ProductServiceImpl.getInstance(); 
	public void execute() {
		int menu = 0;
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1)상품 2)재고 3)종료");
			menu = sc.nextInt();
			
			if (menu == 1)
				getProdProc();
			else if (menu ==2)
				System.out.println("...");
			else if (menu ==3) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
		}
	}
	}

	public void getProdProc() {
		System.out.println("1)상품조회 2)상품등록 3)상품변경 4)전체상품 5)상위목록");
			int submenu = sc.nextInt();
			
			if (submenu == 4)
				getProListProc();
	}
			public void getProListProc() {
				List<ProductVo> list = service.getProductList();
				for (ProductVo pro : list) {
					System.out.println(pro);
				}
			}
	
	
	}

