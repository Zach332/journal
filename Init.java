package src.com.jou.main;
import java.io.*;
public class Init {
	public static void main(String[] args) {
		StateManager man = new StateManager(StateManager.State.DayView);
		DateFinder dateFinder = new DateFinder();
		IO io = new IO();
		Data data = new Data();

		if(Data.weeks.size() == 0) {
			Week week = new Week();
		}
		man.appRun();

	}
}
