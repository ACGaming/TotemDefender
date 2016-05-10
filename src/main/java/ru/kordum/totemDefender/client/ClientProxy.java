package ru.kordum.totemDefender.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import ru.kordum.totemDefender.client.renders.RenderProjectile;
import ru.kordum.totemDefender.client.renders.RenderTotem;
import ru.kordum.totemDefender.common.CommonProxy;
import ru.kordum.totemDefender.common.entities.EntityProjectile;
import ru.kordum.totemDefender.common.entities.TileEntityDiamondTotem;
import ru.kordum.totemDefender.common.entities.TileEntityGoldTotem;
import ru.kordum.totemDefender.common.entities.TileEntityIronTotem;
import ru.kordum.totemDefender.common.entities.TileEntityWoodenTotem;

public class ClientProxy extends CommonProxy {

    //---------------------------------------------------------------------------
    //
    // CONSTRUCTOR
    //
    //---------------------------------------------------------------------------

    public ClientProxy() {

    }

    //---------------------------------------------------------------------------
    //
    // PUBLIC METHODS
    //
    //---------------------------------------------------------------------------

    public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWoodenTotem.class, new RenderTotem());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronTotem.class, new RenderTotem());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldTotem.class, new RenderTotem());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDiamondTotem.class, new RenderTotem());

        EntityRegistry.registerGlobalEntityID(EntityProjectile.class, "totemProjectile", EntityRegistry.findGlobalUniqueEntityId());
        RenderingRegistry.registerEntityRenderingHandler(EntityProjectile.class, new RenderProjectile());
    }
}