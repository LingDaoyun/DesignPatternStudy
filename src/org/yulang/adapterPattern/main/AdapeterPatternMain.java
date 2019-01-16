package org.yulang.adapterPattern.main;

import org.yulang.adapterPattern.impl.AudioPlayer;
import org.yulang.adapterPattern.interfacePkg.MediaPlayer;
/**
 * ������ģʽ������ϵͳ�г�����Ҫ��һЩ���ִ�Ķ��󡱷ŵ��µĻ�����ʹ�ã����µĻ����У�����Ҫ��Ľӿ��ֲ����㡣
 * ��demo��ʹ�õ��Ƕ���������ģʽ��Ҳ���Բ�����������ģʽ�����������������ģʽ������������ģʽ�������
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
