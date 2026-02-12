package Interfaces.Devices;

public class Smartphone implements Phone ,Camera,MusicPlayer {

    @Override
    public void takePicture() {
        System.out.println("Taking picture");
    }

    @Override
    public void recordVedio() {
        System.out.println("Recording vedio");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void MakeCall() {
        System.out.println("Making a call");
    }

    @Override
    public void CutCall() {
        System.out.println("Cutting a call");
    }
}
