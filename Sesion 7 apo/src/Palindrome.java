public class Main {
    public static void isPalindrome(String word){
         boolean palindrome=true;
         String palabra=word.toUpperCase();
        for(int i=0; i<palabra.length() && palindrome==true;i++){
            char izq=palabra.charAt(i);
            int x=palabra.length()-1-i;
            char der=palabra.charAt(x);
            if(izq!=der){
            palindrome=false;
            }
        }
        if (palindrome){
        System.out.println("La palabra " + word + " si es un palindromo");
        } else{
            System.out.println(word+ " no es un palindrome");
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String palabra= "Somos";
        isPalindrome(palabra);
        isPalindrome("Anita lava la tina");
        
       
    }
}