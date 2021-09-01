package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
            		Student student = new Student(132081, "Feuilles", "Franco", "francofeuilles@gmail.com", "https://github.com/NotFukks", "/images/imagen.jpg");
            		SimplePresentationScreen frame = new SimplePresentationScreen(student);
            		frame.setVisible(true);
            	} catch (Exception e) {
            		e.printStackTrace();
            	}
            }
        });
    }
}