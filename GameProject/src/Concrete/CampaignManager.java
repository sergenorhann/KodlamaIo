package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Added to Database : " + campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted from Database : " + campaign.getName());		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated : " + campaign.getName());		
	}

}
