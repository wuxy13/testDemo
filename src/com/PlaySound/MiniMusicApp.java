/**
 * 
 */
package com.PlaySound;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 * @author wuxy13
 *播放声音
 *最简单
 */
public class MiniMusicApp {
	public void play(){
		try {
			/*取得Sequencer并将其打开*/
			Sequencer player=MidiSystem.getSequencer();
			player.open();
			
			/**/
			Sequence seq=new Sequence(Sequence.PPQ, 4);
			
			/*取得track*/
			Track track=seq.createTrack();
			
			/*对track加入几个midievent*/
			ShortMessage a1=new ShortMessage();
			ShortMessage a2=new ShortMessage();
			ShortMessage a3=new ShortMessage();
			ShortMessage a4=new ShortMessage();
			ShortMessage a5=new ShortMessage();
			a1.setMessage(144,1,34,20);
			a2.setMessage(144,2,54,40);
			a3.setMessage(144,3,74,60);
			a4.setMessage(144,4,94,100);
//			a5.setMessage(192,4,102,100);
			track.add(new MidiEvent(a1, 1));
			track.add(new MidiEvent(a2, 5));
			track.add(new MidiEvent(a3, 9));
			track.add(new MidiEvent(a4, 13));
//			track.add(new MidiEvent(a5, 17));
			
			ShortMessage b=new ShortMessage();
			b.setMessage(128,1,44,100);
			track.add(new MidiEvent(b, 38));
			
			/*把sequence送到sequencer上*/
			player.setSequence(seq);
			
			/*开始播放*/
			player.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
