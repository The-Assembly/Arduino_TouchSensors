#Copyright 2020 The Assembly, Rights Reserved
#Authors Asif Rasheed, Rawan Suwwan, Seba Alkafri

import serial as sl
import time
import datetime
import keyboard

ser = sl.Serial('/dev/cu.usbmodem141101',9600)

while True:
    var = ser.readline()
    stri = var.decode('ascii')
    stri = stri.replace('\r','')
    stri = stri.replace('\n','')
    keyboard.press_and_release(stri)
