package org.yulang.adapterPattern.impl;

import org.yulang.adapterPattern.interfacePkg.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		// Do nothing
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing mp4 file name "+fileName);
	}

}
