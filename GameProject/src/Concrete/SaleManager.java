package Concrete;

import Abstract.SaleService;
import Abstract.UserCheckService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	private UserCheckService _UserCheckService;

	public SaleManager(UserCheckService UserCheckService) {
		_UserCheckService = UserCheckService;
	}

	@Override
	public void sall(Gamer gamer, Game game, Campaign campaign) {
		if (_UserCheckService.checkIfRealPerson(gamer)) {
			game.setPrice(game.getPrice() * campaign.getAmount() / 100);
			System.out.println(game.getName().toUpperCase() + " was sold to " + gamer.getFirstName().toUpperCase()
					+ " for " + Math.round(game.getPrice()) + "₺ with the " + campaign.getName());

		} else {
			System.out.println("Please check the Gamer");
		}
	}

	@Override
	public void sall(Gamer gamer, Game game) {

		if (_UserCheckService.checkIfRealPerson(gamer)) {
			System.out.println(game.getName().toUpperCase() + " was sold to " + gamer.getFirstName().toUpperCase()
					+ " for " + Math.round(game.getPrice()) + "₺");
		} else {
			System.out.println("Please check the Gamer");
		}
	}
}
