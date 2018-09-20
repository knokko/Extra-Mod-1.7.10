package knokkoblocks.entities;

import java.util.Random;

import knokkoblocks.main.KnokkoBlocks;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHandler {
	public static void registerShooter(Class entityClass, String name){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.registerModEntity(entityClass, name, entityId, KnokkoBlocks.instance, 64, 1, true);
	}

}
