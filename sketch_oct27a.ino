#include <Stepper.h>
#include <Servo.h>

const int stepsPerRevolution = 4096;
 
Stepper myStepper(stepsPerRevolution, 8, 10, 9, 11);
Servo myServo;
int giatri;
int xung;
void setup() {
  Serial.begin(9600);
  myStepper.setSpeed(15);
  myServo.attach(A0); 
  pinMode(3, OUTPUT);
}
 
void loop() {

  giatri = analogRead(A1);
  xung = map(giatri, 0, 1023, 0, 255);
  Serial.println(xung);
  if(xung > 50){
    //digitalWrite(3, 100);
    //myStepper.step(stepsPerRevolution);
    myServo.write(45);
    delay(500);
    myServo.write(90);
    delay(500);
    myServo.write(180);
    delay(500);
    myServo.write(0);
    delay(500);
  }
}
