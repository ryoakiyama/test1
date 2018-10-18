package com.internousdev.oden.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.oden.dao.OdenDAO;
import com.internousdev.oden.dto.OdenDTO;
import com.opensymphony.xwork2.ActionSupport;

public class OdenAction extends ActionSupport {

	private List<OdenDTO> odenDTOList = new ArrayList<OdenDTO>();

	public String execute(){
		String ret= ERROR;
		OdenDAO dao = new OdenDAO();

		odenDTOList = dao.select();


		ret = SUCCESS;
		return ret;
	}

	public List<OdenDTO> getOdenDTOList(){
		return odenDTOList;
	}

	public void setOdenDTOList(List<OdenDTO> OdenDTOList){
		OdenDTOList = odenDTOList;
	}

}
