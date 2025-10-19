import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath ="src\\I Love You, Im Sorry.wav"; // since this is in our srs folder no need to put the absolute file path relative file path is enough.
        File file =new File(filePath); // to create a file object we have to pass the file path as an object

        /* We created an audio input stream object that is the first step of playing music
        * And here we have used try block with resources that means those will be automatically closed after it's done.No
        * need to close manually. */
        try( Scanner scan =new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            Clip clip =AudioSystem.getClip(); // clip is like an audio player it allows to play, pause the audio
            clip.open(audioStream); // clip object is going to play our audio stream.
           // clip.start(); // start the file if we leave it like this the audio will run for small seconds and immediately end the program.

            /* We can use threading for this but here using a more simple kinda method we are giving user the input to play ,pause or replay the music
            * that means the music will play until the user says stop */
            String response=" ";
            while (! response.equals("Q")){
                System.out.println("P=Play");
                System.out.println("S=Stop");
                System.out.println("R=Reset");
                System.out.println("Q=Quit");
                System.out.print("Enter your choice:");
                response =scan.next().toUpperCase(); // in case the user entered lower case we are making it upper case.

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);  // This method sets the audio clip’s current playback position to the beginning—specifically, to 0 microseconds from the start.
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");

                }
            }

            System.out.println("No problems detected");
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        catch( IOException e ){
            System.out.println("Can't locate the file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource"); // if another resource is trying to access that audio file or that is unplayable.
        }
        finally {
            System.out.println("Bye");
        }






    }
}