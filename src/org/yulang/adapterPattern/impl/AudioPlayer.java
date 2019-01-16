package org.yulang.adapterPattern.impl;

import org.yulang.adapterPattern.adapter.MediaAdapter;
import org.yulang.adapterPattern.interfacePkg.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file : "+fileName);
		}else if(audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else{
		System.out.println("Invalid media file "+audioType+"not supported");	
		}
	}

}
