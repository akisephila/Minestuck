package com.mraof.minestuck.inventory;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.inventory.captchalogue.CaptchaDeckMenu;
import com.mraof.minestuck.inventory.musicplayer.CassetteContainerMenu;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.*;

public class MSMenuTypes
{
	public static final DeferredRegister<MenuType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Minestuck.MOD_ID);
	
	public static final RegistryObject<MenuType<MiniCruxtruderMenu>> MINI_CRUXTRUDER = REGISTER.register("mini_cruxtruder", () -> new MenuType<>((IContainerFactory<MiniCruxtruderMenu>) MiniCruxtruderMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<MiniTotemLatheMenu>> MINI_TOTEM_LATHE = REGISTER.register("mini_totem_lathe", () -> new MenuType<>((IContainerFactory<MiniTotemLatheMenu>) MiniTotemLatheMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<MiniAlchemiterMenu>> MINI_ALCHEMITER = REGISTER.register("mini_alchemiter", () -> new MenuType<>((IContainerFactory<MiniAlchemiterMenu>) MiniAlchemiterMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<MiniPunchDesignixMenu>> MINI_PUNCH_DESIGNIX = REGISTER.register("mini_punch_designix", () -> new MenuType<>((IContainerFactory<MiniPunchDesignixMenu>) MiniPunchDesignixMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<SendificatorMenu>> SENDIFICATOR = REGISTER.register("sendificator", () -> new MenuType<>((IContainerFactory<SendificatorMenu>) SendificatorMenu::newFromPacket, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<GristWidgetMenu>> GRIST_WIDGET = REGISTER.register("grist_widget", () -> new MenuType<>((IContainerFactory<GristWidgetMenu>) GristWidgetMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<UraniumCookerMenu>> URANIUM_COOKER = REGISTER.register("uranium_cooker", () -> new MenuType<>((IContainerFactory<UraniumCookerMenu>) UraniumCookerMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<AnthvilMenu>> ANTHVIL = REGISTER.register("anthvil", () -> new MenuType<>(AnthvilMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<CaptchaDeckMenu>> CAPTCHA_DECK = REGISTER.register("captcha_deck", () -> new MenuType<>(CaptchaDeckMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<EditmodeMenu>> EDIT_MODE = REGISTER.register("edit_mode", () -> new MenuType<>(EditmodeMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<AtheneumMenu>> ATHENEUM = REGISTER.register("atheneum", () -> new MenuType<>(AtheneumMenu::new, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<ConsortMerchantMenu>> CONSORT_MERCHANT = REGISTER.register("consort_merchant", () -> new MenuType<>((IContainerFactory<ConsortMerchantMenu>) ConsortMerchantMenu::load, FeatureFlags.VANILLA_SET));
	public static final RegistryObject<MenuType<CassetteContainerMenu>> CASSETTE_CONTAINER = REGISTER.register("cassette_container", () ->new MenuType<>(CassetteContainerMenu::new, FeatureFlags.VANILLA_SET));
}
