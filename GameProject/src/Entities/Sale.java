package Entities;

import Abstract.Entity;

public class Sale implements Entity{
	int _id;
	int _gamerId;
	int _campaignId;

	public Sale()
	{
		
	}
	
	public Sale(int id, int gamerId, int campaignId) {
		super();
		_id = id;
		_gamerId = gamerId;
		_campaignId = campaignId;
	}
	public int getGamerId() {
		return _gamerId;
	}
	public void setGamerId(int gamerId) {
		_gamerId = gamerId;
	}
	public int getCampaignId() {
		return _campaignId;
	}
	public void setCampaignId(int campaignId) {
		_campaignId = campaignId;
	}
	
	
}