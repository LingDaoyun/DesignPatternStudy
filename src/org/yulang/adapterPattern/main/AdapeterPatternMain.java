package org.yulang.adapterPattern.main;

import org.yulang.adapterPattern.impl.AudioPlayer;
import org.yulang.adapterPattern.interfacePkg.MediaPlayer;
/**
 * 适配器模式解决软件系统中常常需要将一些“现存的对象”放到新的环境中使用，而新的环境中，对象要求的接口又不满足。
 * 改demo中使用的是对象适配器模式，也可以采用类适配器模式，但相较于类适配器模式，对象适配器模式更加灵活
 * @author lsihao
 *
 */
public class AdapeterPatternMain {
	public static void main(String[] args) {
		MediaPlayer mp = new AudioPlayer();
		mp.play("mp4", "mp4 file");
		mp.play("vlc", "vlc file");
		mp.play("mp3", "mp3 file");
	}
}
