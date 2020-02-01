
#include <CapacitiveSensor.h>

CapacitiveSensor   cs_2_4 = CapacitiveSensor(2,4);// 1M resistor between pins 2 & 4, pin 4 is sensor pin, add a wire and or foil
CapacitiveSensor   cs_3_5 = CapacitiveSensor(3,5);

int in_1 = 2;
int in_2 =3;

int Piezopin= 12;
int out = 4; 
int out2 =5;
int out3 =7; 
int state = HIGH;  
int r;
int a;           
int p = LOW;    
long time = 0;       
long debounce = 200;
void setup()
{
  pinMode(4, INPUT);
  pinMode(8, OUTPUT);
  pinMode(5,INPUT);
  pinMode(10,OUTPUT);
}
void loop()                    
{
 
  r = digitalRead(4);
  a= digitalRead(5);
  
  
  if (r == HIGH && p == LOW && millis() - time > debounce) {
    if (state == HIGH)
      state = LOW;
    else 
      state = HIGH;
    time = millis(); 
    tone (Piezopin,30000,500);
    digitalWrite(8, state);
    p = r;
  }
    /**else if (a == HIGH && p == LOW && millis() -time >debounce)
    {
      if (state == HIGH)
      state = LOW;
      else
      state = HIGH;
      time = millis();
      tone (Piezopin,3000,500); 
      digitalWrite (10,state); 
      p=a;
      **/
    }
  
  
  
