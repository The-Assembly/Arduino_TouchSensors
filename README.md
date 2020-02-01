# Turn Everyday Objects into Touch Sensors

**Components Needed:**

- Arduino Uno
- 8 Resistors
- Breadboard
- 18 Jumper Cables
- 8 Alligator Clips
- USB Cable

**Software Used:**

1. Arduino IDE

**Workshop Skill Break-up**

50 % Hardware and 50 % Software

**Workshop Overview**

Makey-Makey is an Invention Kit that has a similar functionality to a microcontroller. It is suitable for all ages as it is a simple electronic device. Makey-Makey allows a wide range of creativity since it works as a smart toy that enables users to connect everyday objects to computer programs. Using a circuit board, alligator clips, and a USB cable, the toy uses closed loop electrical signals to send the computer either a keyboard stroke or mouse click signal. The kit could be designed to make music,

scrub through a video clip or control a video game. In this workshop, we will play the piano by touching flowers, control a video game using hand-drawn sketches and create a music thermin out of pencil graphite.

**Pre-Workshop Steps**

Download Arduino IDE

Python 2.7 and Pip installed.

**Rawaan&#39;s part:**

**Steps:**

1. Download the Makey\_DIY zip folder and save it.

2. Go to Piano capacitive touch folder, refer to the Fritzing circuits

3. Make sure to use 1 mega ohms resistors.

4. Connect the end of your crocodile clips to a conductive object.

5. Make sure your circuit is connected accordingly to the Fritzing circuits.

6. Go to Piano Capacitive Touch \&gt; Piano Arduino.ino. Open it.

7.Go to Tools, and make sure it is Board: &quot;Arduino/Genuine Uno&quot;.

8.Also make sure your port is selected as &quot;Arduino/Genuine Uno&quot;.

9.Click on the &quot;Upload&quot; button on the toolbar of your Arduino IDE.

10.Open the MakeKeyboard.py file with an editor of your choice &amp; make  sure the port number is same as Arduino. For example it might be &quot;COM9&quot;.

11. Navigate to MakeKeyboard file and open it. Keep it running in the background.

12. Navigate to the &#39;Application + Sound Files&#39; folder. Open the AKey file.

13. Have fun!



**Asif&#39;s part:**

<img src = '/Images/Controller.png'>

**Steps:**

1. Download the Makey\_DIY zip folder and save it.

2. Go to Piano capacitive touch folder, refer to the Fritzing circuits

3. Make sure to use 1 mega ohms resistors.

4. Connect the end of your crocodile clips to a conductive object.

5. Make sure your circuit is connected accordingly to the Fritzing circuits.

6. Go to Piano Capacitive Touch \&gt; Piano Arduino.ino. Open it.

7.Go to Tools, and make sure it is Board: &quot;Arduino/Genuine Uno&quot;.

8.Also make sure your port is selected as &quot;Arduino/Genuine Uno&quot;.

9.Click on the &quot;Upload&quot; button on the toolbar of your Arduino IDE.

10.Open the MakeKeyboard.py file with an editor of your choice &amp; make  sure the port number is same as Arduino. For example it might be &quot;COM9&quot;.

11. Navigate to MakeKeyboard file and open it. Keep it running in the background.

12. Navigate to the &#39;Application + Sound Files&#39; folder. Open the AKey file.

13. Have fun!

**Seba&#39;s part**

Introduction to Capacitive Touch Concept

Turning LED&#39;s and Buzzers by Touching Metal Coins  Touching Sensor aka [SWITCH]

1. Hardware Setup

<img src = '/Images/CapacitiveTouch.png'>

2. Software Setup

Part a :

- Adding the Library [https://github.com/arduino-libraries/CapacitiveSensor/zipball/master](https://github.com/arduino-libraries/CapacitiveSensor/zipball/master)
- Download the zip folder
- We go to the location where it is stored and copy the folder
- Then we navigate to Documents Arduino Libraries
- Paste the folder there
- Then we go back to Arduino and select Sketch Tab Include Library Add Zip Library and Select same as before from Documents Arduino Libraries CapactiveSensor File







Part b  Code w/ comments to further explain
 ```
 #include \&lt;CapacitiveSensor.h\&gt;

 //setting the digital pins across the resistor that would be the input and output using the function that turns the arduino   pins into touch sensors so 4 is the output in the case below

 CapacitiveSensor   cs\_2\_4 = CapacitiveSensor(2,4);// 1M resistor between pins 2 &amp; 4, pin 4 is sensor pin, add a wire and or foil

 CapacitiveSensor   cs\_3\_5 = CapacitiveSensor(3,5);

 //setting digital input sensor pins

 int in\_1 = 2;
 
 int in\_2 =3;

 //buzzer power pin

 int Piezopin= 12;

 //setting digital output sensor pins

 int out = 4;

 int out2 =5;

 //to be later used to simplify logic

 int state = HIGH;

 //a variable to store the reading states of the output sensor  

 int r;

 int a;

 //to be later used to simplify logic          

 int p = LOW;

 long time = 0;

 //debouncing used as if user keeps his hand on the coin, without removing it within seconds, led&#39;s will keep blinking aka debounce

 long debounce = 200;

 void setup()

 {

   //4 is the output sensor pin across the 1st resistor**

   pinMode(4, INPUT);

   // 8 is the power pin of the first LED**

   pinMode(8, OUTPUT);

   //5 is the output sensor pin across the 2nd resistor**

   pinMode(5,INPUT);

   // 10 os the power pin of the 2nd LED**

   pinMode(10,OUTPUT);

 }

 void loop()

 {

   //OUTPUT FROM SENSOR PINS IS STORED IN THOSE VARIABLES TO BE LATER USED FOR SIMPLIFICATION

   r = digitalRead(4);

   a=  digitalRead(5);

   //this line suggests that if you touch the led once so time delay is low, then it would enter the loop, and according to previous state led will turn on/off,

   //however if time delay increases meaning your hand is still touching the coin, led will keep blinking --\&gt; touchong time should be less than 200 mses which is bouncing time as set b4

  //Here, we are reading the 1st resistor output sensor pin which is r corresponding with pin 4

   if (r == HIGH &amp;&amp; p == LOW &amp;&amp; millis() - time \&gt; debounce)

   {

     **//changes the state of the led depending on the previous state so if its high and you touch the coin, it&#39;ll become low \&lt;turn off\&gt;**

    if (state == HIGH)

      state = LOW;

      **//if you don&#39;t touch again, obviously will remain high**

    else

      state = HIGH;

      **//setting time to msec**

    time = millis();

    **//setting the buzzer to a certain frequency to show diff sounds when touching diff coins**

    tone (Piezopin,30000,500);

    **//writing the led state aka outputting it**

    digitalWrite(8, state);

    p = r;

   }
 
  // exactly same as above but in this case we are reading the 2nd resistor output senesor pin which is a corresponding with pin 5

    else if (a == HIGH &amp;&amp; p == LOW &amp;&amp; millis() -time \&gt;debounce)

    {

      if (state == HIGH)

      state = LOW;

      else

      state = HIGH;

      time = millis();

      tone (Piezopin,3000,500);

      digitalWrite (10,state);

      p=a;

    }
 
 }
 ```
