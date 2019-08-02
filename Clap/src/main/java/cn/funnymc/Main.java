package cn.funnymc;

import java.net.UnknownHostException;

import cn.funnymc.server.*;
import cn.funnymc.login.*;
/**
 * 拍手游戏程序入口
 * @author TheFunnyCrafter
 */
public class Main {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println("Starting Clapping Game Server...");
		//在10087端口上启动Clap服务器
		new Clap(10087).start();
		//初始化MySQL
		MySQL.getPassword();
		MySQL.getConn();
	}
}
