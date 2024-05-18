package object;

import entity.Entity;
import Main.GamePanel;

public class Fish_Coelacanths extends Entity {
    public Fish_Coelacanths(GamePanel gp){
        super(gp);
        fishRarity = "Common";
        name = "Coelacanths";
        price = 5;
        fishStar = 2;
        down1 = setup("Fish/Coelacanths_2",gp.tileSize,gp.tileSize);
        count = 0;
        fishFinalImage = setup("Item/Qm",gp.tileSize,gp.tileSize);
//        fishFrame = setup("Fishingframe/Common");
    }
}