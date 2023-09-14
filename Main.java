class Main {
    public static void main(String[] args) {
        float iniFloat = 1.42398F;
        System.out.println(String.format("%.2f", iniFloat));
    }

    public static double convertToCelcius(double Fahrenheit) {
        return (5.0 / 9.0) * (Fahrenheit - 32.0);
    }

    public static String getCurrentTime() {
        long unixTime = System.currentTimeMillis();
        return "";
    }
}