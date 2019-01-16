package org.yulang.adapterPattern.impl;

import org.yulang.adapterPattern.interfacePkg.AdvancedMediaPlayer;

public class VlcPayer  implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file  name "+ fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		// DO nothing
	}

}
