package ac.yedam.prod;

import java.util.List;

public interface InOutService {
	public void In(InOutVo v);
	public void Out(InOutVo v); 
	public List<InOutVo> getInOutList();
	

}
