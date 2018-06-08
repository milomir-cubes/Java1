package media;

public class Television {
    
    private int volume;
    private int currentProgram;
    private boolean turnOn;
    
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    public boolean getTurnOn() {
        return this.turnOn;
    }
    
    
    
}
