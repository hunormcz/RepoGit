class Car {
String color=null;
int speed = 0;
int hp = 0;

void changecolor(String newValue)
{
color=newValue;
}

void changespeed(int newValue)
{
speed=newValue;
}

void changehp(int newValue)
{
hp=newValue;
}
void printStates() {
    System.out.println("color: " + 
                       color+"+speed: "+speed+ "hp: "+hp);

}
}