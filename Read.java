import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
public class Read {
	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("Sowrov.bin");
		ObjectInputStream is = new ObjectInputStream(fis);
		file F = new file();
		try {
			while(true)
			{
				F = (file) is.readObject();
				System.out.println(F);
			}
		}catch(EOFException e)
		{
			System.out.println(e);
		}
	}catch(Exception e)
		{
		System.out.println(e);
		}
		
	}

}


class file implements Serializable{
	String name ;int id; String username; String Password;
	file(){};
	file(String name, int id, String username, String Password)
	{
		this.name=name;
		this.id=id;
		this.username=username;
		this.Password=Password;
	}
	public String toString() {
		return name+" "+ id+" "+username+" "+ Password;
	}
	
}
