import java.io.*;

class Person implements Serializable{
	public String name;
	public int age;
	Person(){}
	Person(String s, int i){
		name = s;
		age = i;
	}
	public String toString() {
		return "Name = "+name+","+ "Age = "+age;
	}
}
public class Test{
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Farzana Islam";
		p.age = 100;
		Person parr[] = {new Person("Laila Begum", 12), new Person("Saila Begum", 32)};
		String myFile2 = "data.bin";
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(myFile2,true));
			os.writeObject(p); //write object
			os.writeObject(parr);
			os.close();
		}catch(IOException e) {
			System.out.println("Error");
		}
		System.out.println("Done writting");
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(myFile2));
			Person pCopy = (Person) is.readObject();
			System.out.println("Name = "+pCopy.name + " "+", Age ="+pCopy.age);
			Person ParrCopy[] = (Person[]) is.readObject();
			for(int i=0; i<ParrCopy.length; i++)
				System.out.println(ParrCopy[i]);
			is.close();
		}
		catch(IOException | ClassNotFoundException e) {
			System.out.println("Error");
		}
	}
}