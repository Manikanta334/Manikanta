class Lcu
{
  String movie;
  int year;
  String hero;  

Lcu(String movie, int year, String hero)
{
    this.movie = movie;
    this.year = year;
    this.hero = hero;
}
@Override
public String toString()
{
    return "Movie: "+movie+ " year: "+year+ " Hero: "+hero;
}
public static void main(String args[])
{
    Lcu l1 = new Lcu("Kaithi",2019,"Karthik");
    Lcu l2 = new Lcu("Vikram",2022,"Kamal Hasan");
    Lcu l3 = new Lcu("LEO",2023,"Vijay");

    Lcu[] l ={l1,l2,l3};
    
 
    for(int i = 0; i<l.length; i++)
    {
        System.out.println(l[i]);
   
    }
}
}
