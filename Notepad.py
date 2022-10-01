#contributed by Manan Bansal
from tkinter import  *
from tkinter.filedialog import askopenfilename,asksaveasfilename
from tkinter.messagebox import  *
import os

def newfile():
    global file
    root.title("Untitled   - Notepad")
    file=None
    TextArea.delete(1.0,END)
def openfile():
    file=askopenfilename(defaultextension=".txt" , filetypes=[("All files", "*.*"),("Text Documents","*.txt") ])
    if file=="":
        file=None
    else:
        root.title(os.path.basename(file) + "- Notepad")
        TextArea.delete(1.0,END)
        f=open(file,"r")
        TextArea.insert(1.0,f.read())
        f.close()
def quitapp():
    root.destroy()
def savefile():
    global file
    if file==None:
        file=asksaveasfilename(initialslfilename="Untitled.txt",defaultextension=".txt" , filetypes=[("All files", "*.*"),("Text Documents","*.txt") ])
        if file=="":
            file=None
        else:
            f=open(file,"w")
            f.write(TextArea.get(1.0,END))
            f.close()
            root.title(os.path.basename(file)+ "  - Notepad")
    else :
        f = open(file, "w")
        f.write(TextArea.get(1.0, END))
        f.close()


def cut():
    TextArea.event_generate("<<Cut>>")
def copy():
    TextArea.event_generate("<<Copy>>")
def paste():
    TextArea.event_generate("<<Paste>>")
def about():
    showinfo("Text Editor" , " Text Editor by Manan Bansal")


if __name__ == '__main__':
    root=Tk()
    root.title("Untitled      Notepad")
    root.geometry("500x500")
    TextArea=Text(root,font="Helvetica 15")
    file = None

    TextArea.pack(expand=True , fill=BOTH)
    MenuBar = Menu(root)

    filemenu = Menu(MenuBar,tearoff=0)
    filemenu.add_command(label="New", command=newfile)
    filemenu.add_command(label="Open", command=openfile)
    filemenu.add_command(label="Save", command=savefile)
    filemenu.add_separator()
    filemenu.add_command(label="Exit", command=quitapp)
    MenuBar.add_cascade(label="File", command=filemenu)


    EditMenu = Menu(MenuBar,tearoff=0)
    EditMenu.add_command(label="Cut",command=cut)
    EditMenu.add_command(label="Copy", command=copy)
    EditMenu.add_command(label="Paste",command=paste)
    MenuBar.add_cascade(label="Edit",menu=EditMenu)


    HelpMenu=Menu(MenuBar,tearoff=0)
    HelpMenu.add_command(label="About Editor" , command=about)
    MenuBar.add_cascade(label="Help", menu=HelpMenu)

    root.config(menu=MenuBar)

    Scroll= Scrollbar(TextArea)
    Scroll.pack(side=RIGHT , fill= Y)
    Scroll.config(command=TextArea.yview)
    TextArea.config(yscrollcommand=Scroll.set)

    root.mainloop()
