class LCD_Python:
    def __init__(self, x, num1, num2):
        self.x = x
        self.num1 = num1
        self.num2 = num2
        
    @staticmethod
    def lowcom(x, num1, num2):
        if (num1 % x == 0 and num2 % x == 0):
            return x
        return LCD_Python.lowcom(x + 1, num1, num2)

x = 2
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
lcd = LCD_Python.lowcom(x, num1, num2)
print("The lowest common divisor is:", lcd)
