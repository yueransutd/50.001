package piano;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.MidiUnavailableException;

import midi.Instrument;
import midi.Midi;
import music.NoteEvent;
import music.Pitch;

public class PianoMachine {
	
	private Midi midi;
    private int shift=0;
    private Instrument instrument=Midi.DEFAULT_INSTRUMENT;
    private boolean recordingNow=false;
    private List<NoteEvent> lst=new ArrayList<NoteEvent>();
    
	/**
	 * constructor for PianoMachine.
	 * 
	 * initialize midi device and any other state that we're storing.
	 */
    public PianoMachine() {
    	try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }
    
    //TODO write method spec
    public void beginNote(Pitch rawPitch) {
    	//midi.beginNote(new Pitch(0).toMidiFrequency());
    	//TODO implement for question 1
        Pitch pitch2=rawPitch.transpose(shift);
        midi.beginNote(pitch2.toMidiFrequency(),instrument);

        if(recordingNow==true) {
            NoteEvent ne=new NoteEvent(pitch2,System.currentTimeMillis(),instrument,NoteEvent.Kind.start);
            lst.add(ne);
        }

    }
    
    //TODO write method spec
    public void endNote(Pitch rawPitch) {
    	//midi.endNote(new Pitch(0).toMidiFrequency());
    	//TODO implement for question 1
        Pitch pitch2=rawPitch.transpose(shift);
        midi.endNote(pitch2.toMidiFrequency(),instrument);

        if(recordingNow==true) {
            NoteEvent ne=new NoteEvent(pitch2,System.currentTimeMillis(),instrument,NoteEvent.Kind.stop);
            lst.add(ne);
        }

    }
    
    //TODO write method spec
    public void changeInstrument() {
       	//TODO: implement for question 2
        instrument=instrument.next();
    }
    
    //TODO write method spec
    public void shiftUp() {
    	//TODO: implement for question 3
        if(shift<Pitch.OCTAVE*2) {
            shift+=Pitch.OCTAVE;
        }
    }
    
    //TODO write method spec
    public void shiftDown() {
    	//TODO: implement for question 3
        if(shift>Pitch.OCTAVE*2*(-1)) {
            shift-=Pitch.OCTAVE;
        }
    }
    
    //TODO write method spec
    public boolean toggleRecording() {
    	//return false;
    	//TODO: implement for question 4
        if(recordingNow==false) {
            recordingNow=true;
            lst=new ArrayList<>();
        }
        else recordingNow=false;
        return recordingNow;


    }
    

    public void playback2() throws MidiUnavailableException{


            Midi m = Midi.getInstance();
            int i=0;
            //NoteEvent ne=lst.get(i);
            while (i<lst.size()-1) {

                Pitch p = lst.get(i).getPitch();
                long t = lst.get(i).getTime();
                Instrument ins = lst.get(i).getInstr();

                if (lst.get(i).getKind() == NoteEvent.Kind.start) {
                    m.beginNote(p.toMidiFrequency(), ins);
                } else if (lst.get(i).getKind() == NoteEvent.Kind.stop) {
                    m.endNote(p.toMidiFrequency(), ins);
                }
                i++;
                NoteEvent ne2=lst.get(i);
                long t2 = (ne2.getTime() - lst.get(i-1).getTime()) / 10;
                Midi.rest((int) t2);
            }
        m.endNote(lst.get(lst.size()-1).getPitch().toMidiFrequency(), lst.get(lst.size()-1).getInstr());
        }
    //TODO write method spec
    public void playback() {
        //TODO: implement for question 4
        try{
            playback2();
        }
        catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }





    /*public static void main(String[] args) throws MidiUnavailableException {
        Midi midi;
        PianoMachine pm;

        midi = Midi.getInstance();
        midi.clearHistory();
        pm = new PianoMachine();

        pm.beginNote(new Pitch(0));
        Midi.rest(10);
        pm.endNote(new Pitch(0));

        pm.changeInstrument();
        Midi.rest(10);
        pm.changeInstrument();
        pm.beginNote(new Pitch(2));
        Midi.rest(10);
        pm.endNote(new Pitch(2));

        System.out.println(midi.history());
        midi.clearHistory();

        //shift
        pm.shiftUp();
        pm.beginNote(new Pitch(2));
        Midi.rest(10);
        pm.endNote(new Pitch(2));
        pm.shiftDown();

        System.out.println(midi.history());
        midi.clearHistory();



        //recording
        pm.toggleRecording();
        pm.beginNote(new Pitch(3));
        pm.beginNote(new Pitch(5));
        Midi.rest(10);
        pm.endNote(new Pitch(3));
        pm.endNote(new Pitch(5));
        pm.toggleRecording();

        System.out.println(midi.history());
        midi.clearHistory();
        Midi.rest(10);

        //playback
        pm.playback();
        Midi.rest(10);

        System.out.println(midi.history());



    }*/

}
