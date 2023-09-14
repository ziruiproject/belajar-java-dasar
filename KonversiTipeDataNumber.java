public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        byte iniKecil = 127;
        short iniLebihBesar = iniKecil;
        int iniBesarLagi = iniLebihBesar;
        long iniPalingBesar = iniBesarLagi;
        float iniFloat = iniPalingBesar;
        double iniMaksimal = iniFloat;

        double iniDouble = 125.4678;
        int iniInt = (int) iniDouble;
        System.out.println(iniDouble);
        System.out.println(iniInt);
    }
}
