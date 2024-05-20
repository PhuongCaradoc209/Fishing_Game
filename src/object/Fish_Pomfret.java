package object;

import entity.Entity;
import Main.GamePanel;

public class Fish_Pomfret extends Entity {
    public Fish_Pomfret(GamePanel gp){
        super(gp);
        fishRarity = "RARE";
        name = "Pomfret";
        price = 7;
        fishStar = 2;
        //Image for Collections
        down1 = setup("Fish/Pomfret_2",gp.tileSize*5/2,gp.tileSize*5/2);
        //Image for tradeState
        down2 = setup("Fish/Pomfret_2",gp.tileSize,gp.tileSize);
        count = 0;
        fishFinalImage = setup("Item/Qm",gp.tileSize,gp.tileSize);
        fishFrame = setup("Fishingframe/Rare",gp.tileSize*18,gp.tileSize*15);
    }
}
