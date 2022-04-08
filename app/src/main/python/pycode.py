import io
import re

#https://stackoverflow.com/questions/54667573/how-to-configure-python-interpretor-in-android-studio
def countchars(inputString):
    return len(inputString)

def countwords(inputString):
    return len(re.findall(r'\w+', inputString))

def countsmthg():
    return 5

def countsmthgsecond(inputFirstNumber, inputSecondNumber, inputThirdNumber):
    suma = inputFirstNumber + inputSecondNumber + inputThirdNumber
    return suma

def compound_interest(principle, rate, time):
    # Calculates compound interest
    Amount = principle * ((1 + rate / 100), time)
    return Amount

