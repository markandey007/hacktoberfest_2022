def getdate():
    import datetime
    return datetime.datetime.now()
name=input("Enter the name of patient : ")
healthCheck=int(input("Enter 1 or 2 accordingly : "))
if name=="harry":
    if healthCheck==1:
        with open("harryDIE.txt","a") as f:
            time=str(getdate())
            f.write(time+"  ")
            inp=input("Enter diet:")
            f.write(inp+"\n")
    elif healthCheck==2:
        with open("harryEX.txt","a") as f:
            time=str(getdate())
            f.write(time+"  ")
            inp = input("Enter Exercise:")
            f.write(inp+"\n")
elif name=="rohan":
    if healthCheck==1:
        with open("rohanDi.txt","a") as f:
            time=str(getdate())
            f.write(time+"  ")
            inp = input("Enter diet:")
            f.write(inp +"\n")
    elif healthCheck==2:
        with open("rohanEX.txt","a") as f:
            time=str(getdate())
            f.write(time+"  ")
            inp = input("Enter Exercise:")
            f.write(inp+"\n")
