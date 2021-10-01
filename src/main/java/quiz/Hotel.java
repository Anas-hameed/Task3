package quiz;
import java.io.*;
public class Hotel {

	Room[] Rooms;
	int size; 

	Hotel(){
		size=0;
		Rooms= new Room[500];

	}
	//Add the room
	public int Addroom(String name) {
		if(size==500) {
			return -1;
		}
		Room temp = new Room(size,name);
		Rooms[size]= temp;
		size++;
		return size-1; 		
	}

	// Display all the available rooms
	public void DisplayRoom() {
		System.out.println("Available Rooms");
		for(int i=size; i<500; i++)
		{
			System.out.print("Room ID   :: " );
			System.out.println(i);
		}
	}


	// Adding functionality test
	// return -1 on unsuccessful addition
	// return room Number on successful addition
	public String FindCustomer(int key) throws Exception {
		if(key >=500 || key<0)
		{
			throw new Exception("Not a valid Key");
		}
		return Rooms[key].c.Name;
	}
	
	// This function will output the data into the file
	public boolean saveData() {
		try {
			FileWriter out 	  = new FileWriter("Temp.txt");
			BufferedWriter bw = new BufferedWriter(out);
			for(int i=0; i<size; i++ ) {
				bw.write(Rooms[i].c.Name,0, Rooms[i].c.Name.length());
			}
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}