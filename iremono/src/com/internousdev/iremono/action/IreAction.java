package com.internousdev.iremono.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.iremono.dao.IreDAO;
import com.internousdev.iremono.dto.IreDTO;
import com.opensymphony.xwork2.ActionSupport;

public class IreAction extends ActionSupport {

	private List<IreDTO> BobDTOList = new ArrayList<IreDTO>();

	public String execute(){
		String ret = ERROR;
		IreDAO dao = new IreDAO();

		BobDTOList = dao.select();
		ret = SUCCESS;

//		if(BobDTOList.size() >0 ){
//			ret = SUCCESS;
//		}else{
//			ret = ERROR;
//		}
		return ret;
	}


	public List<IreDTO> getBobDTOList(){
		return BobDTOList;
	}

//	public void setBobDTOList(List<IreDTO> BobDTOList){
//		BobDTOList = BobDTOList;
//	}

}
