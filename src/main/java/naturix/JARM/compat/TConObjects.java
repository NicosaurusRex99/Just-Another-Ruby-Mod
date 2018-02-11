package naturix.JARM.compat;

import naturix.JARM.compat.traits.TraitRuby;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.traits.AbstractTrait;

@SuppressWarnings("WeakerAccess")
public class TConObjects {
    public static Material rubymaterial    = new Material("rubymaterial"    , 0x32_5D_25);
    
    public static final AbstractTrait ruby = new TraitRuby();
}