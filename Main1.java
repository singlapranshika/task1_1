import java.util.*;
abstract class Todaymood
{
String mood;
public abstract boolean workupdate();
 }
class work extends Todaymood
{
public boolean x;
public work(String mood)
{
this.mood=mood;
}
public boolean workupdate()
{
if(mood=="sad")
{
x= false;
}
else if(mood=="happy")
{
x= true;
}
return x;
}}
class Main1
{
public static void main(String args[])
{
Todaymood t=new work("sad");
System.out.print(t.workupdate());
}}
