import smtplib
import re

regex = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'

def check_email(email):
    if(re.fullmatch(regex, email)):
        return True
 
    else:
        return False


server = smtplib.SMTP_SSL("smtp.gmail.com", 465)
while True:
    email = str(input("Enter your email address: "))
    password = str(input("Enter your Password: "))

    if not check_email(email):
        continue
    else:
        try:
            server.login(email, password)
            print("Successfully Logged In")
            break
        except:
            print("Unsuccessfull login please try again")
            continue
while True:
    try:
        r_email = str(input("Enter Reciever's Email: "))
        message = str(input("Enter the Message: "))
        server.sendmail(email,r_email,message)
        print("Message sent Successfully")
        break
    except:
        print("Failed! \nPlease try again ")
        continue