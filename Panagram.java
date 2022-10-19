public class Panagram {
public static final int n = 26;
public int check(String arr){
if(arr.length() < n){
return -1;
}
for(char c = 'A'; c <= 'Z' ; c++){
if((arr.indexOf(c) < 0) && (arr.indexOf((char)(c + 32)) <
0)){
return -1;
}
}
return 1;
}
public static void main(String[] args) {
Panagram obj = new Panagram ();
int d = obj.check("Abcdefghijklmnopqrstuvwxyz");
if(d == -1)
System.out.print("not pangram");
else
System.out.print("pangram");
}
}