package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {

	private int id;
	
	private int userId;
	
	private int goodsId;
	
	private String goodsName;
	
	private int itemCount;
	
	private int total;
	
	private Timestamp createdAt;
//	ID
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
//	ユーザーID	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
//	グッズID
	public int getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
//グッズネーム
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
//アイテムカウント	
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
//	トータル
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
//コンテンツ作成時間
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}

