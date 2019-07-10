package naturix.ruby.proxy;

import naturix.ruby.registry.ModItems;
import naturix.ruby.world.ModOreFeature;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("ruby") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.rubyGem);
        }
    };

    public void init() {

    }
}