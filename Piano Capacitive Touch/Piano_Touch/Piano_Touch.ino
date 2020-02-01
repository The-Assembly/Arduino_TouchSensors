void setup() {

 Serial.begin(9600);      //begins serial monitor 
 for (int i=0; i<=9; i++)
 {
 pinMode(i, INPUT);         //initialize all pins as input to read
 }

}

void loop() 
{

                           
if (digitalRead(2) == HIGH)   //if voltage detected at pin 2
{ 
 
Serial.println("a");
delay(700);                 //delay is added to match

}

if (digitalRead(3) == HIGH)
{
Serial.println("s");
delay(700);

}

if (digitalRead(4) == HIGH)
{
Serial.println("d");
delay(700);

}

if (digitalRead(5) == HIGH)
{
Serial.println("f");
delay(700);

}

if (digitalRead(6) == HIGH)
{
Serial.println("g");
delay(700);

}

if (digitalRead(7) == HIGH)
{
Serial.println("h");
delay(700);

}
if (digitalRead(8) == HIGH)
{
Serial.println("j");
delay(700);

}


if (digitalRead(9) == HIGH)
{
  Serial.println("k");
delay(700);

}




}
