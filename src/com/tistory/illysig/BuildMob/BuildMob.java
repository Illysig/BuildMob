package com.tistory.illysig.BuildMob;

import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.block.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;
import org.bukkit.inventory.*;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BuildMob extends JavaPlugin{
	
	private CreeperListener creeperListener = new CreeperListener();
	private SkeletonListener skeletonListener = new SkeletonListener();
	private EnderManListener enderManListener = new EnderManListener();
	private PigZombieListener pigZombieListener = new PigZombieListener();
	private ZombieListener zombieListener = new ZombieListener();
	private BlazeListener blazeListener = new BlazeListener();
	private SpiderListener spiderListener = new SpiderListener();
	
	public void onDisable() {
		System.out.println(this + " Disable!");
	}
 
	public void onEnable() {
		
		PluginManager pm = this.getServer().getPluginManager();
		
		pm.registerEvent(Event.Type.BLOCK_PLACE, creeperListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.BLOCK_PLACE, skeletonListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.BLOCK_PLACE, enderManListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.BLOCK_PLACE, pigZombieListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.BLOCK_PLACE, zombieListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.BLOCK_PLACE, blazeListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.BLOCK_PLACE, spiderListener, Event.Priority.Normal, this);
		
		System.out.println(this + " Enabled! By Illysig");
	}
 
	public class CreeperListener extends BlockListener {
		public void onBlockPlace(BlockPlaceEvent event) {
			if (event.isCancelled() || !event.getItemInHand().getType().equals(Material.LEAVES)) 
				return;
			try {
				Block blockPlaced = event.getBlockPlaced(), blockUnder = blockPlaced.getRelative(0, -1, 0);
				
				Block[] blocks = new Block[] { blockUnder, blockUnder.getRelative(-1, 0, 0), 
					blockUnder.getRelative(1, 0, 0), blockUnder.getRelative(0, 0, -1), blockUnder.getRelative(0, 0, 1), 
					blockUnder.getRelative(0, -1, 0) };
				if (blocks[0].getType() == Material.TNT && blocks[1].getType() == Material.VINE && blocks[2].getType() == Material.VINE &&
					blocks[3].getType() == Material.VINE && blocks[4].getType() == Material.VINE && blocks[5].getType() == Material.LEAVES) {
					event.setCancelled(true);
					event.getPlayer().setItemInHand(new ItemStack(event.getItemInHand().getType(),
						event.getItemInHand().getAmount(), event.getItemInHand().getDurability()));
					for (Block b: blocks)
						b.setType(Material.AIR);
					event.getPlayer().getWorld().spawn(blocks[5].getLocation(), Creeper.class);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public class SkeletonListener extends BlockListener {
		
		public void onBlockPlace(BlockPlaceEvent event) {
			
			if (event.isCancelled() || !event.getItemInHand().getType().equals(Material.PUMPKIN)) 
				return;
			try {
				Block blockPlaced = event.getBlockPlaced(), blockUnder = blockPlaced.getRelative(0, -1, 0);
				
				Block[] blocks = new Block[] { blockUnder, blockUnder.getRelative(-1, 0, 0), 
					blockUnder.getRelative(1, 0, 0), blockUnder.getRelative(0, 0, -1), blockUnder.getRelative(0, 0, 1), 
					blockUnder.getRelative(0, -1, 0) };
				if (blocks[0].getType() == Material.WOOL && blocks[1].getType() == Material.LEVER && blocks[2].getType() == Material.LEVER &&
					blocks[3].getType() == Material.LEVER && blocks[4].getType() == Material.LEVER && blocks[5].getType() == Material.WOOL) {
					event.setCancelled(true);
					event.getPlayer().setItemInHand(new ItemStack(event.getItemInHand().getType(), 
						event.getItemInHand().getAmount(), event.getItemInHand().getDurability()));
					for (Block b: blocks)
						b.setType(Material.AIR);
					event.getPlayer().getWorld().spawn(blocks[5].getLocation(), Skeleton.class);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public class EnderManListener extends BlockListener {
		
		public void onBlockPlace(BlockPlaceEvent event) {
			
			if (event.isCancelled() || !event.getItemInHand().getType().equals(Material.PUMPKIN)) 
				return;
			try {
				Block blockPlaced = event.getBlockPlaced(), blockUnder = blockPlaced.getRelative(0, -1, 0);
				
				Block[] blocks = new Block[] { blockUnder, blockUnder.getRelative(-1, 0, 0), 
					blockUnder.getRelative(1, 0, 0), blockUnder.getRelative(0, 0, -1), blockUnder.getRelative(0, 0, 1), 
					blockUnder.getRelative(0, -1, 0) };
				if (blocks[0].getType() == Material.OBSIDIAN && blocks[1].getType() == Material.LEVER && blocks[2].getType() == Material.LEVER &&
					blocks[3].getType() == Material.LEVER && blocks[4].getType() == Material.LEVER && blocks[5].getType() == Material.OBSIDIAN) {
					event.setCancelled(true);
					event.getPlayer().setItemInHand(new ItemStack(event.getItemInHand().getType(), 
						event.getItemInHand().getAmount(), event.getItemInHand().getDurability()));
					for (Block b: blocks)
						b.setType(Material.AIR);
					event.getPlayer().getWorld().spawn(blocks[5].getLocation(), Enderman.class);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public class PigZombieListener extends BlockListener {
		
		public void onBlockPlace(BlockPlaceEvent event) {
			
			if (event.isCancelled() || !event.getItemInHand().getType().equals(Material.PUMPKIN)) 
				return;
			try {
				Block blockPlaced = event.getBlockPlaced(), blockUnder = blockPlaced.getRelative(0, -1, 0);
				
				Block[] blocks = new Block[] { blockUnder, blockUnder.getRelative(-1, 0, 0), 
					blockUnder.getRelative(1, 0, 0), blockUnder.getRelative(0, 0, -1), blockUnder.getRelative(0, 0, 1), 
					blockUnder.getRelative(0, -1, 0) };
				if (blocks[0].getType() == Material.NETHERRACK && blocks[1].getType() == Material.LEVER && blocks[2].getType() == Material.LEVER &&
					blocks[3].getType() == Material.LEVER && blocks[4].getType() == Material.LEVER && blocks[5].getType() == Material.NETHERRACK) {
					event.setCancelled(true);
					event.getPlayer().setItemInHand(new ItemStack(event.getItemInHand().getType(), 
						event.getItemInHand().getAmount(), event.getItemInHand().getDurability()));
					for (Block b: blocks)
						b.setType(Material.AIR);
					event.getPlayer().getWorld().spawn(blocks[5].getLocation(), PigZombie.class);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public class ZombieListener extends BlockListener {
		
		public void onBlockPlace(BlockPlaceEvent event) {
			
			if (event.isCancelled() || !event.getItemInHand().getType().equals(Material.PUMPKIN)) 
				return;
			try {
				Block blockPlaced = event.getBlockPlaced(), blockUnder = blockPlaced.getRelative(0, -1, 0);
				
				Block[] blocks = new Block[] { blockUnder, blockUnder.getRelative(-1, 0, 0), 
					blockUnder.getRelative(1, 0, 0), blockUnder.getRelative(0, 0, -1), blockUnder.getRelative(0, 0, 1), 
					blockUnder.getRelative(0, -1, 0) };
				if (blocks[0].getType() == Material.MOSSY_COBBLESTONE && blocks[1].getType() == Material.LEVER && blocks[2].getType() == Material.LEVER &&
					blocks[3].getType() == Material.LEVER && blocks[4].getType() == Material.LEVER && blocks[5].getType() == Material.MOSSY_COBBLESTONE) {
					event.setCancelled(true);
					event.getPlayer().setItemInHand(new ItemStack(event.getItemInHand().getType(), 
						event.getItemInHand().getAmount(), event.getItemInHand().getDurability()));
					for (Block b: blocks)
						b.setType(Material.AIR);
					event.getPlayer().getWorld().spawn(blocks[5].getLocation(), Zombie.class);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
	}
	public class BlazeListener extends BlockListener {
		
		public void onBlockPlace(BlockPlaceEvent event) {
			
			if (event.isCancelled() || !event.getItemInHand().getType().equals(Material.PUMPKIN)) 
				return;
			try {
				Block blockPlaced = event.getBlockPlaced(), blockUnder = blockPlaced.getRelative(0, -1, 0);
				
				Block[] blocks = new Block[] { blockUnder, blockUnder.getRelative(-1, 0, 0), 
					blockUnder.getRelative(1, 0, 0), blockUnder.getRelative(0, 0, -1), blockUnder.getRelative(0, 0, 1), 
					blockUnder.getRelative(0, -1, 0) };
				if (blocks[0].getType() == Material.GOLD_BLOCK && blocks[1].getType() == Material.LEVER && blocks[2].getType() == Material.LEVER &&
					blocks[3].getType() == Material.LEVER && blocks[4].getType() == Material.LEVER && blocks[5].getType() == Material.GOLD_BLOCK) {
					event.setCancelled(true);
					event.getPlayer().setItemInHand(new ItemStack(event.getItemInHand().getType(), 
						event.getItemInHand().getAmount(), event.getItemInHand().getDurability()));
					for (Block b: blocks)
						b.setType(Material.AIR);
					event.getPlayer().getWorld().spawn(blocks[5].getLocation(), Blaze.class);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public class SpiderListener extends BlockListener {
		
		public void onBlockPlace(BlockPlaceEvent event) {
			
			if (event.isCancelled() || !event.getItemInHand().getType().equals(Material.PUMPKIN)) 
				return;
			try {
				Block blockPlaced = event.getBlockPlaced(), blockUnder = blockPlaced.getRelative(0, -1, 0);
				
				Block[] blocks = new Block[] { blockUnder, blockUnder.getRelative(-1, 0, 0), 
					blockUnder.getRelative(1, 0, 0), blockUnder.getRelative(0, 0, -1), blockUnder.getRelative(0, 0, 1), 
					blockUnder.getRelative(0, -1, 0) };
				if (blocks[0].getType() == Material.COBBLESTONE && blocks[1].getType() == Material.LEVER && blocks[2].getType() == Material.LEVER &&
					blocks[3].getType() == Material.LEVER && blocks[4].getType() == Material.LEVER && blocks[5].getType() == Material.COBBLESTONE) {
					event.setCancelled(true);
					event.getPlayer().setItemInHand(new ItemStack(event.getItemInHand().getType(), 
						event.getItemInHand().getAmount(), event.getItemInHand().getDurability()));
					for (Block b: blocks)
						b.setType(Material.AIR);
					event.getPlayer().getWorld().spawn(blocks[5].getLocation(), Spider.class);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	}

