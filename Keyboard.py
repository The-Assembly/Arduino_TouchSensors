#Copyright 2020 The Assembly, Rights Reserved
#Authors Asif Rasheed, Rawan Suwwan, Seba Alkafri

import serial as sl
import time
import datetime
import keyboard

ser = sl.Serial('/dev/cu.usbmodem143101',9600)

while True:
    var = ser.readline()
    stri = var.decode('ascii')
    stri = stri.replace('\r','')
    stri = stri.replace('\n','')
    print(stri)
    keyboard.press(stri)
    time.sleep(.7)
    keyboard.release(stri)
