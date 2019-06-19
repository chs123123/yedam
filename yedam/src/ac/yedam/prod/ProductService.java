package ac.yedam.prod;

import java.util.List;

public interface ProductService {
	// 상품조회
	public ProductVo getProduct(String code);

	// 상품입력
	public void insertProduct(ProductVo vo);

	// 상품변경
	public void updateProduct(ProductVo vo);

	// 전체리스트조회
	public List<ProductVo> getProductList();

}
