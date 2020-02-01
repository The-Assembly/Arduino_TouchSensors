//© 2020 The Assembly, Rights Reserved
//Authors Asif Rasheed, Rawan Suwwan, Seba Alkafri


void setup() {
  Serial.begin(9600);
  pinMode(3, INPUT); 
  pinMode(4, INPUT);
  pinMode(7, INPUT); 
  pinMode(6, INPUT);
}

void loop() {
  if(digitalRead(3) == HIGH){
    Serial.println("left");
  }
  if(digitalRead(4) == HIGH){
    Serial.println("right");
  }
  if(digitalRead(7) == HIGH){
    Serial.println("up");
  }
  if(digitalRead(6) == HIGH){
    Serial.println("down");
  }
  delay(700);
}
