void setup() {

 Serial.begin(9600);
 for (int i=0; i<=12; i++)
 {
 pinMode(i, INPUT);
 }
 //note: we only NEED 12 pins on the board
}

void loop() 
{

/*if (digitalRead(0) == HIGH)
Serial.println("C");

if (digitalRead(1) == HIGH)
Serial.println("C#");
*/ 

if (digitalRead(2) == HIGH)
{
 
Serial.println("a");
delay(500);

}

if (digitalRead(3) == HIGH)
{
Serial.println("s");
delay(500);

}

if (digitalRead(4) == HIGH)
{
Serial.println("d");
delay(500);

}

if (digitalRead(5) == HIGH)
{
Serial.println("f");
delay(500);

}

if (digitalRead(6) == HIGH)
{
Serial.println("g");
delay(500);

}

if (digitalRead(7) == HIGH)
{
Serial.println("h");
delay(500);

}
if (digitalRead(8) == HIGH)
{
Serial.println("j");
delay(500);

}


if (digitalRead(9) == HIGH)
{
  Serial.println("k");
delay(500);

}




}
