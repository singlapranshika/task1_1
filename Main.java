import java.util.*;

 class Todaymood
{
    private String mood;
    
    public String getmood()
    {
        return mood;
    }
public void setmood(String mood)
{
    this.mood=mood;
}
}
class Main
{
public static void main(String args[])
{
    Todaymood t=new Todaymood();
    t.setmood("happy");
    System.out.print(t.getmood());
}}
