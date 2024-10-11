import java.util.*;
import java.util.ArrayList;
import java.util.List;

import java.io.*;
public class battle {
	//public ArrayList<Profile> data;
	public static ArrayList<Profile> listdata = new ArrayList<Profile>();
	public static void inputdata() throws IOException {
		boolean isExist = false;
		Scanner sc=new Scanner(System.in);
		String nama;
		String gender;
		Integer age;
		//Profile pr = new Profile();
		do {
			isExist = false;
			System.out.println("Enter your name\n");
			nama = sc.next();
			System.out.println("Enter your gender: man / woman\n");
			gender = sc.next();
			System.out.println("Enter your age\n");
			age = sc.nextInt();
			int panjangnama = nama.length();
			if(panjangnama<5){
				isExist = true;
				System.out.println("Please insert name min 5 character");
			}
			if(gender.contains("man") || gender.contains("woman")) {
				
			}else {
				isExist = true;
				System.out.println("Sorry, i dont know your gender");
			}
			if(age<13) {
				isExist = true;
				System.out.println("Oh No, you are too young. This game just for 13+");
			}
		}while (isExist);
		listdata.add(new Profile(nama,gender,age));
		menu();
	}
	
	public static void menu() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Poke Battle zone\nGet ready to battle");
		System.out.println("1. Profile\n2. Battle\n3. Exit");
		System.out.println("\n\nChoose your option(number)");
		int menu = sc.nextInt();
		switch(menu) {
			case 1: profile();break;
			case 2: game();break;
			case 3: System.out.println("Thanks for playing");
			System.exit(0);;break;
		}
	}
	
	public static void profile() throws IOException {
		System.out.println("Your Profile is\n");
		for(Profile pr:listdata)
        {
            //System.out.println("Name : "+pr.getNama()+""+", kd brg : "+barang.getKd()+""+", nm brg : "+barang.getNm());
			System.out.println("Name: "+pr.getNama()+"\n");
			System.out.println("Gender: "+pr.getGender()+"\n");
			System.out.println("Age: "+pr.getUmur()+"\n");
        }
		/*System.out.println("Name: "+pra.getNama()+"\n");
		System.out.println("Gender: "+pra.getNama()+"\n");
		System.out.println("Age: "+pra.getNama()+"\n");*/
		menu();
	}

	public static void game() throws IOException {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new
		InputStreamReader(System.in));
		//System.out.println("Welcome to Poke Battle zone\nGet ready to battle");
		System.out.println("1. Charmander\n2. Squirtle\n3. Bulbasaur\n4. Pikachu");
		System.out.println("\n\nChoose your Pokemon(number)");
		int p1=sc.nextInt();
		Pokemon P1=null;
		switch(p1)
		{
			case 1: P1=new Charmander();break;
			case 2: P1=new Squirtle();break;
			case 3: P1=new Bulbasaur();break;
			case 4: P1=new Pikachu();break;
			default:System.out.println("Wrong input!");System.exit(0);break;
		}
		//System.out.println("What would you like to name your Pokemon?");
		//P1.name=br.readLine();
		//System.out.println("\n\nPlayer 2 choose your Pokemon(number)");
		//int p2=sc.nextInt();
		int randpokemon = rand.nextInt(4);
		randpokemon++;
		Pokemon P2=null;
		switch(randpokemon)
		{
			case 1: P2=new Charmander();break;
			case 2: P2=new Squirtle();break;
			case 3: P2=new Bulbasaur();break;
			case 4: P2=new Pikachu();break;
			default:System.out.println("Wronginput!");System.exit(0);break;
		}
		//System.out.println("What would you like to name your Pokemon?");
		//P2.name=br.readLine();
		System.out.println("Let the Battle begin");
		Pokemon Poke1,Poke2;
		
		Poke1=P1;
		Poke2=P2;
		
		System.out.println(Poke1.name+ " starts ");
		while(true)
		{
			System.out.println("\n\n Your Pokemon : "+Poke1.name+"\nHP:"+Poke1.HP+"\n");
			System.out.println("Moves:");
			Poke1.printMoves();
			System.out.println("\n\n Pokemon Enemy : "+Poke2.name+"\nHP:"+Poke2.HP+"\n");
			System.out.println("Moves:");
			Poke2.printMoves();
			System.out.println("\n\n"+Poke1.name+", choose a move(number)");
			int m1=sc.nextInt();
			m1--;
			System.out.println("\n\n"+Poke2.name+", choose a move(number)");
			int rand_skill_pokemon = rand.nextInt(3);//
			//int m2=sc.nextInt();
			int m2 = rand_skill_pokemon;
			//m2--;
			Poke2.moves(m2);
			Poke1.calculateDamage(Poke2,m1);
			if(Poke2.HP<=0)
			{
				System.out.println(Poke2.name+" is defeated!\n"+Poke1.name +" wins!");
				System.out.println("Do you want to battle again?(y/n)");
				char c=(br.readLine().toLowerCase()).charAt(0);
				if(c=='y')
				{
					game();
				}
				else
				{
					menu();
				}
			}
			Poke2.calculateDamage(Poke1,m2);
			if(Poke1.HP<=0)
			{
				System.out.println(Poke1.name+" is defeated!\n"+Poke2.name +" wins!");
				System.out.println("Do you want to battle again?(y/n)");
				char c=sc.next().toLowerCase().charAt(0);
				if(c=='y')
				{
					game();
				}
				else
				{
					menu();
				}
			}
			System.out.println("Enter any button to continue");
			String f=sc.next();
			System.out.print("\f");
		}
	}
	
	public static void main(String[] args) throws IOException {
		inputdata();
		
		//game();
	}
}
