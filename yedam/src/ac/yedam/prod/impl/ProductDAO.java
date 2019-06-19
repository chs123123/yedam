package ac.yedam.prod.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ac.yedam.prod.ProductVo;
import ac.yedam.prod.common.DAO;

public class ProductDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public List<ProductVo> getProdList(){
		conn = DAO.getConnet();
		String sql = "SELECT p_code, p_name, price FROM yproduct";
		ProductVo pro = null;
		List<ProductVo>list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				pro = new ProductVo(sql, sql);
				pro.setProduCode(rs.getString("p_code"));
				pro.setProduName(rs.getString("p_name"));
				list.add(pro);
			}
		
	
		}	catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			DAO.close(conn);
		}
		return list;
	}

}