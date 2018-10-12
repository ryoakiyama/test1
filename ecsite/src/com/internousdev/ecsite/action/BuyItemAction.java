package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;
public class BuyItemAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -7787951498734562406L;
	private Collection<String> checkList;
	private String id;
	private String itemName;
	private String itemPrice;
	private String itemTransactionId;
	private String totalCount;
	private String totalPrice;
	private String itemStock;
	private String count;
	private String pay;
	private Collection<String> checklist;
	private String userMasterId;
	private String errorMessage;

	public Map<String, Object> session;



	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();


	public String execute() throws SQLException{
		String result = ERROR;
		System.out.println("-----------BuyItemConfirmAction");

		System.out.println("checkList:"+ checkList);
		System.out.println("id:"+ id);
		System.out.println("itemName:"+ itemName);
		System.out.println("itemPrice:"+ itemPrice);
		System.out.println("count:"+ count);
		System.out.println("pay:"+ pay);

		String[] idList = id.split(", ", 0);
		String[] itemNameList = itemName.split(", ", 0);
		String[] itemPriceList = itemPrice.split(", ", 0);
		String[] itemStockList = itemStock.split(", ", 0);
		String[] countList = count.split(", ", 0);

		session.get("____");

//	String result = SUCCESS;

		if(checkList==null){
			errorMessage = "商品が選択されていません";
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			List<BuyItemDTO> buyItemDTOList = buyItemDAO.getBuyItemInfo();
			session.put("buyItemDTOList", buyItemDTOList);
			return ERROR;
		}

		System.out.println("ID数------->" + idList.length);
		for(int i = 0; i < idList.length;i++){
			for(String check : checkList){
				System.out.println("CHECKED ID-------->" + check);
				if(check.equals(String.value0f(idList[i]))){
					BuyItemDTO dto = new BuyItemDTO();
					id=idList[i].toString();
					itemTransactionId = idList[i].toString();
					itemName = idList[i].toString();
					itemPrice = idList[i].toString();
					itemStock = idList[i].toString();
					count = idList[i].toString();

					int totalCount = Interger.parseIne(countList[i].toString());
					int price = Interger.parseInt(itemPriceList[i].toString());
					int total = price * totalCount;
					totalCount = idList[i].toString();
					userMasterId = idList[i].toString();
					pay = idList[i].toString();




					System.out.println("----カート情報["+(i)+"]-----");
					System.out.println("ID   :"+dto.getId());
					System.out.println("ITEMNAME:"+dto.getItemName());
					System.out.println("ITEMPRICE:"+dto.getItemPrice());
					System.out.println("ITEMSTOCK:"+dto.getItemStock());
					System.out.println("COUNT:"+dto.getCount());
					System.out.println("TOTALPRICE:"+dto.getTotalPrice());
					System.out.println("TOTALCOUNT:"+dto.getTotalCount());
					System.out.println("USERMASTERID:"+dto.getUserMasterId());
					System.out.println("Pay:"+dto.getPay());
					System.out.println("--------------------------------");

					buyItemDTOList.add(dto);
				}
			}
		}



		// TODO 跡で確認
//	BuyItemDAO buyItemDAO = new BuyItemDAO();
//	List<BuyItemDTO> buyItemDTOList = buyItemDAO.getBuyItemInfo();
//	session.put("buyItemDTOList",buyItemDTOList);
//	TODO ここまで




//	session.put("count", count);
//	int intCount = Integer.parseInt(session.get("count").toString());
//	int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
//	session.put("total_price", intCount * intPrice);
//
//
//	String payment;
//	if(pay.equals("1")) {
//	payment = "現金払い";
//	session.put("pay", payment);
//	} else {
//	payment = "クレジットカード";
//	session.put("pay", payment);
//	}
//	return result;
		return result;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}
	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {

		this.session = session;

	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public Collection<String> getChecklist() {
		return checklist;
	}

	public void setChecklist(Collection<String> checklist) {
		this.checklist = checklist;
	}

	public String getUserMasterId() {
		return userMasterId;
	}

	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getItemTransactionId() {
		return itemTransactionId;
	}

	public void setItemTransactionId(String itemTransactionId) {
		this.itemTransactionId = itemTransactionId;
	}
	}

