package org.yulang.adapterPattern.adapter;

import org.yulang.adapterPattern.impl.Mp4Player;
import org.yulang.adapterPattern.impl.VlcPayer;
import org.yulang.adapterPattern.interfacePkg.AdvancedMediaPlayer;
import org.yulang.adapterPattern.interfacePkg.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advanceMediaPlayer;

	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc"))	{
			advanceMediaPlayer = new VlcPayer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer = new Mp4Player();
		}
	}


	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer.playMp4(fileName);;
		}else if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer.playVlc(fileName);
		}
	}

}
