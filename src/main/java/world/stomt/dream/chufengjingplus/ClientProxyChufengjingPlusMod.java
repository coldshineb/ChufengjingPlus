package world.stomt.dream.chufengjingplus;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;
import world.stomt.dream.chufengjingplus.common.Startup;
import world.stomt.dream.chufengjingplus.external.IconLoader;

import java.io.File;
import java.nio.file.Paths;


public class ClientProxyChufengjingPlusMod implements IProxyChufengjingPlusMod {
	public static Logger logger;

	@Override
	public void init(FMLInitializationEvent event) {
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		OBJLoader.INSTANCE.addDomain("chufengjingplus");
		logger = event.getModLog();
		Startup.setTitle();
		Startup.addServerInformation();//添加初风境服务器
		File di = Paths.get(event.getModConfigurationDirectory().getAbsolutePath(), "chufengproject").toFile();
		File icon = Paths.get(di.getAbsolutePath(), "icon.png").toFile();
		if (icon.exists() && !icon.isDirectory()) {
			Display.setIcon(IconLoader.load(icon));
		} else {
			logger.error("初风境客户端不完整，请重新下载解压。");
		}//设置图标
	}

		@Override
		public void postInit (FMLPostInitializationEvent event){
		}

		@Override
		public void serverLoad (FMLServerStartingEvent event){
		}

		public void loadComplete (FMLLoadCompleteEvent event){
			Startup.setTitle();
		}
}