package com.internousdev.ecsite.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
//	private BuyItemDAO buyItemDAO = new BuyItemDAO();

//	private List<BuyItemDTO> myPageList = new ArrayList<BuyItemDTO>();

	public String execute() {

		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);
//        LoginDAO dao = new LoginDAO();
////		myPageList =  dao.select();

		//新規追加分
		BuyItemDAO buyItemDAO = new BuyItemDAO();
		List<BuyItemDTO> buyItemDTOList = buyItemDAO.getBuyItemInfo();
		session.put("buyItemDTOList",buyItemDTOList);


		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			//管理者かどうかをチェックする

			result = SUCCESS;
//			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("login_user_id",loginDTO.getLoginId());



			return result;

		}
		return result;

	}

	public String getLoginUserId() {
		return loginUserId;
	}
		public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
		public String getLoginPassword() {
		return loginPassword;
	}
		public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

//		public List<BuyItemDTO> getMyPageList(){
//		return myPageList;
//	}
//     	public void setMyPageList(List<BuyItemDTO> helloStrutsDTOList){
//		myPageList = helloStrutsDTOList;
//	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}