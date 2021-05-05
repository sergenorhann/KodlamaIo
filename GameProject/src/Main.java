import java.time.LocalDate;

import Concrete.BaseGameManager;
import Concrete.BaseUserManager;
import Concrete.SaleManager;
import Concrete.SteamGameManager;
import Adapters.MernisServiceAdapter;
import Concrete.SteamUserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {
	public static void main(String[] args) {

		Gamer gamer1=new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("sergen");
		gamer1.setLastName("orhan");
		gamer1.setDateOfBirth(LocalDate.of(1997,07,16));
		gamer1.setNationalityId("11111111111");
		
		Gamer gamer2=new Gamer();
		gamer2.setId(1);
		gamer2.setFirstName("Ali");
		gamer2.setLastName("Yılmaz");
		gamer2.setDateOfBirth(LocalDate.of(1993,05,10));
		gamer2.setNationalityId("11111111111");
		
		
		BaseUserManager userManager = new SteamUserManager(new MernisServiceAdapter());
		userManager.add(gamer1);
		userManager.add(gamer2);
		
		
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Call Of Duty");
        game1.setPrice(149.99);

        Game game2 = new Game();
        game2.setId(2);
        game2.setName("Wahleim");
        game2.setPrice(39.99);
        
        
        Campaign campaign1 = new Campaign();
        campaign1.setId(1);
        campaign1.setName("50% Holiday discount");
        campaign1.setAmount(50);
        
        Campaign campaign2 = new Campaign();
        campaign2.setId(2);
        campaign2.setName("70% First login");
        campaign2.setAmount(70);

		
        BaseGameManager gameManager = new SteamGameManager();
        gameManager.add(game1);
        gameManager.add(game2);
        

        SaleManager sale1 = new SaleManager(new MernisServiceAdapter());
        sale1.sall(gamer1, game1, campaign2);
        
        SaleManager sale2 = new SaleManager(new MernisServiceAdapter());
        sale2.sall(gamer2, game1);
		
	}
}