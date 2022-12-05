class Vowels{
public static void main(String arg[]){
int vowel = 0;
int constant = 0;
String name = "AEIOU";
name = name.toLowerCase();
for(int i=0;i<name.length();i++){
if(name.charAt(i)=='a'|| name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
vowel++;
}
else if (name.charAt(i)>='a' && name.charAt(i)<='z' ){
constant++;
}
}
System.out.println("the vowels number is "+ vowel );
System.out.println("the constant number is "+ constant );
}
}