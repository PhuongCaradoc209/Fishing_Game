package object;

import entity.Entity;
import Main.GamePanel;

public class OBJ_Can extends Entity {
    public OBJ_Can(GamePanel gp){
        super(gp);
        name = "Can";
        price = 0;
        fishStar = 0;
        down1 = setup("Item/Can",gp.tileSize*5/2,gp.tileSize*5/2);
        down2 = setup("Item/Can",gp.tileSize,gp.tileSize);
        count = 0;
        fishFinalImage = setup("Item/Qm",gp.tileSize,gp.tileSize);
        fishRarity = "TRASH";
        fishFrame= setup("Fishingframe/Trash",gp.tileSize*18,gp.tileSize*15);
    }
}
