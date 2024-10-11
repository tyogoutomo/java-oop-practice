
public class Pokemon {
	int HP,Def,SpDef,Att,SpAtt,Spe;
	String name,type1,type2;
	String moves[][];
	Pokemon(int h, String t1, String nama)
	{
		moves=new String[4][6];
		HP=h;
		//Def=d;
		//SpDef=sd;
		//Att=a;
		//SpAtt=sa;
		//Spe=s;
		type1=t1;
		name = nama;
		//type2=t2;
	}
	void printMoves()
	{
		for(int i=0;i<3;i++)
		System.out.println((i+1)+". "+moves[i][0]+" - "+moves[i][1]);
	}
	void moves(int s) {
		System.out.println(moves[s][0]);
	}
	void calculateDamage(Pokemon P, int m)
	{
		System.out.println("\n\n");
		double damage=0.0;
		double r=Math.random()*100;
		damage=Double.parseDouble(moves[m][1]);
		//System.out.println("damage "+damage);
		double rawDam=damage;
		String typem=moves[m][3];
		//System.out.println("typem "+typem);
		String typep1=P.type1;
		//System.out.println("typep1tujuan "+typep1);
		String typep2=P.type2;
		//System.out.println("typep2tujuan "+typep2);
		if(typep1.equals("fire"))
		{
			if(typem.equals("fire"))
			{
				//damage/=2;
			}
			else if(typem.equals("water"))
			{
				//kelemahannya
				damage*=2;
			}
			else if(typem.equals("grass"))
			{
				//damage/=2;
				//System.out.println("damage from Grassp1 "+damage);
			}
			else if(typem.equals("electric"))
			{
				//damage*=2;
			}
		}
		else if(typep1.equals("water"))
		{
			if(typem.equals("fire"))
			{
			 //damage/=2;
			}
			else if(typem.equals("water"))
			{
			 //damage/=2;
			}
			else if(typem.equals("grass"))
			{
			 //damage*=2;
			}
			else if(typem.equals("electric"))
			{
				//kelemahannya
				damage*=2;
			}
		}
		else if(typep1.equals("grass"))
		{
			if(typem.equals("fire"))
			{
				//kelemahannya
				damage*=2;
			}
			else if(typem.equals("water"))
			{
				//damage/=2;
			}
			else if(typem.equals("grass"))
			{
				//damage/=2;
			}
			else if(typem.equals("electric"))
			{
				//damage/=2;
			}
		}
		else if(typep1.equals("electric"))
		{
			if(typem.equals("fire"))
			{
				//damage/=2;
			}
			else if(typem.equals("water"))
			{
				//damage/=2;
			}
			else if(typem.equals("grass"))
			{
				//kelemahannya
				damage*=2;
			}
			else if(typem.equals("electric"))
			{
				//damage/=2;
			}
		}
		
		P.HP-=(int)(damage);
	}
}
