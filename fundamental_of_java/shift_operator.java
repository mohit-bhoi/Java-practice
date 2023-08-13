package fundamental_of_java;

class shift_operator{
    public static void main(String[] args) {
        //Positive number
       byte m = 40;
       System.out.println("Before Values of m: "+(m)+"\nValue in Bits: " +Integer.toBinaryString(m));
       System.out.println("Value after left shift: "+(m<<1)+"\nValue after left shift in bits: "+ Integer.toBinaryString((m<<1)));


       System.out.println("===================");
//negative numberw
       byte n = -40;
       System.out.println("Unsigned right shift");
       System.out.println("Before Values of m: "+(n)+"\nValue in Bits: " +Integer.toBinaryString(n));
       System.out.println("Value after left shift: "+(n>>>2)+"\nValue after left shift in bits: "+ Integer.toBinaryString((n>>>2)));
    }
}